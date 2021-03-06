package kz.greetgo.blog.stand.bean_containers;


import kz.greetgo.blog.controller.controller.BeanConfigForPackageController;
import kz.greetgo.blog.stand.bean.BeanConfigForPackageBeans;
import kz.greetgo.blog.stand.register_impl.BeanConfigForPackageRegisterImpl;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({BeanConfigForPackageBeans.class,
        BeanConfigForPackageController.class,
        BeanConfigForPackageRegisterImpl.class})
public class BeanConfigForStandBeanContainer {
}