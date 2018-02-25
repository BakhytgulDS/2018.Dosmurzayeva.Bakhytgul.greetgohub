package kz.greetgo.blog.stand.launcher;

import kz.greetgo.depinject.Depinject;
import kz.greetgo.depinject.gen.DepinjectUtil;

public class StandLauncher{
    public static void main(String[] args){
        new StandLauncher().run();
    }
    private static void run(){
        try{
            DepinjectUtil.implementBeanContainers("kz.greetgo.blog.stand",
                    kz.greetgo.education.stand.util.Modules.standDir()+"build/src_bean_container");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}