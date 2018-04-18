package kz.greetgo.blog.register.beans.postgres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@BeanScanner
@Include({BeanConfigRegisterImpl.class, BeanConfigControllers.class})
public class BeanConfigAll {
}