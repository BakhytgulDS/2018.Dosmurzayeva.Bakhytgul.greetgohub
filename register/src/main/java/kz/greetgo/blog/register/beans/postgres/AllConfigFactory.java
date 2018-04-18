package kz.greetgo.blog.register.beans.postgres;

import kz.greetgo.blog.register.config.DbConfig;
import kz.greetgo.blog.register.test.util.App;
import kz.greetgo.conf.hot.HotConfigFactory;
import kz.greetgo.depinject.core.Bean;

@Bean
public class AllConfigFactory extends HotConfigFactory {

    public DbConfig createDbConfig(){
        return createConfig(DbConfig.class);
    }

    @Override
    protected String getBaseDir() {
        return App.appDir() + "/conf";
    }
}