package kz.greetgo.blog.stand.bean_containers;

import kz.greetgo.blog.stand.bean.StandServer;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;

@Bean
@Include(BeanConfigForStandBeanContainer.class)
public interface StandBeanContainer extends BeanContainer {

    StandServer standServer();
}