const gulp = require('gulp');
const del = require('del');
const less = require('gulp-less');
const path = require('path');
const pug = require('gulp-pug');


gulp.task('clean', function() {
    return del(['build']);
});

gulp.task('less', function () {
    return gulp.src('front/less/*.less').pipe(less())
        .pipe(gulp.dest(path.join(__dirname, "build", "css")))
});

gulp.task('pug', function () {
    return gulp.src('front/pug/*.pug').pipe(pug())
        .pipe(gulp.dest(path.join(__dirname, "build", "html")))
});

gulp.task('ser', gulp.series('clean', gulp.parallel('less', 'pug')));