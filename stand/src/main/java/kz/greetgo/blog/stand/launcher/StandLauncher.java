package kz.greetgo.blog.stand.launcher;

import kz.greetgo.blog.stand.bean_containers.StandBeanContainer;
import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.greetgo.blog.stand.utils.Modules;


public class StandLauncher   {
    public static void main(String[] args) throws Exception {
        new StandLauncher().run();
    }

    private static void run() throws Exception {
        DepinjectUtil.implementAndUseBeanContainers( "kz.greetgo.blog.stand",
                Modules.standDir()+"build/src_bean_container");

        StandBeanContainer standBeanContainer =
                Depinject.newInstance(StandBeanContainer.class);

        standBeanContainer.standServer().start();
    }


}