package kz.greetgo.blog.stand.bean_containers;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.blog.stand.bean_containers.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.blog.stand.bean.StandServer standServer() {
    return getter_native_StandServer_5.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.controller.controller.TestController> cachedValue_native_TestController_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.controller.TestController> getter_native_TestController_1 = this::get_native_TestController_1;
  private kz.greetgo.blog.controller.controller.TestController get_native_TestController_1 () {
    {
      kz.greetgo.blog.controller.controller.TestController x = cachedValue_native_TestController_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.controller.controller.TestController x = cachedValue_native_TestController_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.controller.controller.TestController localValue = new kz.greetgo.blog.controller.controller.TestController();
        localValue.registerBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.register.TestRegister>)(java.lang.Object)getter_native_TestRegisterImpl_7;
        cachedValue_native_TestController_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration> cachedValue_native_CrossOriginFilterRegistration_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration> getter_native_CrossOriginFilterRegistration_2 = this::get_native_CrossOriginFilterRegistration_2;
  private kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration get_native_CrossOriginFilterRegistration_2 () {
    {
      kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration localValue = new kz.greetgo.blog.stand.bean.CrossOriginFilterRegistration();
        cachedValue_native_CrossOriginFilterRegistration_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.bean.JettyControllerRegistration> cachedValue_native_JettyControllerRegistration_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.bean.JettyControllerRegistration> getter_native_JettyControllerRegistration_3 = this::get_native_JettyControllerRegistration_3;
  private kz.greetgo.blog.stand.bean.JettyControllerRegistration get_native_JettyControllerRegistration_3 () {
    {
      kz.greetgo.blog.stand.bean.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.bean.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_3.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.bean.JettyControllerRegistration localValue = new kz.greetgo.blog.stand.bean.JettyControllerRegistration();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_8;
        localValue.view = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_StandBlogViews_4;
        cachedValue_native_JettyControllerRegistration_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.bean.StandBlogViews> cachedValue_native_StandBlogViews_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.bean.StandBlogViews> getter_native_StandBlogViews_4 = this::get_native_StandBlogViews_4;
  private kz.greetgo.blog.stand.bean.StandBlogViews get_native_StandBlogViews_4 () {
    {
      kz.greetgo.blog.stand.bean.StandBlogViews x = cachedValue_native_StandBlogViews_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.bean.StandBlogViews x = cachedValue_native_StandBlogViews_4.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.bean.StandBlogViews localValue = new kz.greetgo.blog.stand.bean.StandBlogViews();
        cachedValue_native_StandBlogViews_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.bean.StandServer> cachedValue_native_StandServer_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.bean.StandServer> getter_native_StandServer_5 = this::get_native_StandServer_5;
  private kz.greetgo.blog.stand.bean.StandServer get_native_StandServer_5 () {
    {
      kz.greetgo.blog.stand.bean.StandServer x = cachedValue_native_StandServer_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.bean.StandServer x = cachedValue_native_StandServer_5.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.bean.StandServer localValue = new kz.greetgo.blog.stand.bean.StandServer();
        localValue.webAppContextRegistration = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_9;
        localValue.afterInject();
        cachedValue_native_StandServer_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.bean.Utf8FilterRegistration> cachedValue_native_Utf8FilterRegistration_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.bean.Utf8FilterRegistration> getter_native_Utf8FilterRegistration_6 = this::get_native_Utf8FilterRegistration_6;
  private kz.greetgo.blog.stand.bean.Utf8FilterRegistration get_native_Utf8FilterRegistration_6 () {
    {
      kz.greetgo.blog.stand.bean.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.bean.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_6.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.bean.Utf8FilterRegistration localValue = new kz.greetgo.blog.stand.bean.Utf8FilterRegistration();
        cachedValue_native_Utf8FilterRegistration_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.register_impl.TestRegisterImpl> cachedValue_native_TestRegisterImpl_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.register_impl.TestRegisterImpl> getter_native_TestRegisterImpl_7 = this::get_native_TestRegisterImpl_7;
  private kz.greetgo.blog.stand.register_impl.TestRegisterImpl get_native_TestRegisterImpl_7 () {
    {
      kz.greetgo.blog.stand.register_impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.register_impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_7.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.register_impl.TestRegisterImpl localValue = new kz.greetgo.blog.stand.register_impl.TestRegisterImpl();
        cachedValue_native_TestRegisterImpl_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.controller.utils.Controller>> getter_ref_list_Controller_8 = this::get_ref_list_Controller_8;
  private java.util.List<kz.greetgo.blog.controller.utils.Controller> get_ref_list_Controller_8() {
    java.util.List<kz.greetgo.blog.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_TestController_1.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_9 = this::get_ref_list_WebAppContextRegistration_9;
  private java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_9() {
    java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_CrossOriginFilterRegistration_2.get());
    list.add(getter_native_JettyControllerRegistration_3.get());
    list.add(getter_native_Utf8FilterRegistration_6.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
