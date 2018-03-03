package kz.greetgo.blog.stand.bean;

import kz.greetgo.blog.controller.utils.Controller;
import kz.greetgo.blog.stand.utils.WebAppContextRegistration;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.JettyWarServlet;
import kz.greetgo.mvc.interfaces.TunnelExecutorGetter;
import kz.greetgo.mvc.interfaces.Views;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.ArrayList;
import java.util.List;

@Bean
public class JettyControllerRegistration extends JettyWarServlet implements WebAppContextRegistration{
    public BeanGetter<List<Controller>> controllerList;

    @Override
    protected List<Object> getControllerList() {
        List<Object> ret = new ArrayList<>();
        ret.addAll(controllerList.get());
        return ret;
    }

    public BeanGetter<Views> view;

    @Override
    protected Views getViews() {
        return view.get();
    }

    @Override
    protected String mappingBase() {
        return getTargetSubContext()+"/*";
    }


    @Override
    protected void afterRegistered(){
        for (TunnelExecutorGetter tunnelExecutorGetter:tunnelExecutorGetters){
            System.out.println(tunnelExecutorGetter.infoStr());
        }
    }

    @Override
    protected String getTargetSubContext() {
        return "/api";
    }

    @Override
    public double priority() {
        return 0;
    }
}