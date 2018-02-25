const gulp = require('gulp');
const del = require('del');
const less = require('gulp-less');
const path = require('path');
const pug = require('gulp-pug');
const webpack = require('webpack');
const gulpLog = require('gulplog');
const notifier = require('node-notifier');
const browserSync = require('browser-sync');

let isWatch = true;

function outDir() {
    return path.resolve(__dirname, 'build', 'public', 'greetgohub');
}

gulp.task('clean', function() {
    return del(['build']);
});

gulp.task('less', function () {
    return gulp.src('front/less/*.less').pipe(less())
        .pipe(gulp.dest(path.join(outDir(), "css")))
});

gulp.task('pug', function () {
    return gulp.src('front/pug/*.pug').pipe(pug())
        .pipe(gulp.dest(path.join(outDir())))
});

gulp.task('copy', function () {
    gulp.src([
        "front/iconfont/**/*.*"
    ]).pipe(gulp.dest(path.resolve(outDir(), 'iconfont')));
    gulp.src([
        "node_modules/zone.js/dist/zone.min.js",
        "node_modules/core-js/client/shim.min.js"
    ]).pipe(gulp.dest(path.resolve(outDir(), 'js')));
    return gulp.src([
        "node_modules/@angular/material/prebuilt-themes/indigo-pink.css",
        "node_modules/bootstrap/dist/css/bootstrap.min.css"
    ]).pipe(gulp.dest(path.resolve(outDir(), 'css')));
});
gulp.task('assets', gulp.parallel('less', 'pug'));
//gulp.task('par', gulp.parallel('less','pug');


gulp.task('pug', function () {
    return gulp.src("front/pug/index.pug").pipe(pug({pretty: true}))
        .on("error", console.log)
        .pipe(gulp.dest(outDir()))
});

gulp.task('webpack', function (callback) {

    let options = {
        entry: [path.resolve('.', 'front', 'ts', 'main.ts')],
        output: {
            path: path.resolve(__dirname, 'build', 'public', 'greetgohub', 'js'),
            publicPath: '/',
            filename: '[name].js',
            sourceMapFilename: '[name].js.map',
        },
        watch: isWatch,
        devtool: 'cheap-module-inline-source-map',
        module: {
            loaders: [{
                test: /\.ts$/,
                include: path.resolve(__dirname, 'front', 'ts'),
                loader: ['ts-loader'],
            }],
        },
        resolve: {
            extensions: [".ts", ".js"]
        },
        plugins: [
            new webpack.NoEmitOnErrorsPlugin() // otherwise error still gives a file
        ]
    };

    webpack(options, function (err, stats) {
        if (!err) { // no hard error
// try to get a soft error from stats
            err = stats.toJson().errors[0];
        }

        if (err) {
            notifier.notify({
                title: 'Webpack',
                message: err
            });

            gulpLog.error(err);
        } else {
            gulpLog.info(stats.toString({
                colors: true
            }));
        }

// task never errs in watch mode, it waits and recompile
        if (!options.watch && err) {
            callback(err);
        } else {
            callback();
        }

    });
});

gulp.task('server', function (back) {
    browserSync.init({server: path.resolve(outDir())});

    browserSync.watch('build/public/**/*.*').on('change', browserSync.reload);

    back();
});



gulp.task('start', gulp.series(
    'clean', 'copy', 'assets', function (callback) {
        isWatch = true;
        callback();
    }, 'webpack', 'server',
    function () {
        gulp.watch('front/pug/**/*.pug', gulp.series('pug'));
        gulp.watch('front/less/**/*.less', gulp.series('less'));
    }
));