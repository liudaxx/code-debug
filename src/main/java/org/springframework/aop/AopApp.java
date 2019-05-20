package org.springframework.aop;

import org.springframework.BaseApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import singleton.init.TestBean;

/**
 * @author: liupeikai
 * @Date: 2019/5/18
 */
public class AopApp  {
    protected static String configFile ="E:\\learn\\code-debug\\src\\main\\resources\\com.singleton\\aop-config.xml" ;

    protected static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new FileSystemXmlApplicationContext(configFile);
        AopInterface testBean = (AopInterface) applicationContext.getBean("testBean-1");
        testBean.doSomething();
    }
}
