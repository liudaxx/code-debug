package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: liupeikai
 * @Date: 2019/5/18
 */
public class BaseApp {
    protected static String configFile ;

    protected static ApplicationContext applicationContext;

    static{
        applicationContext = new FileSystemXmlApplicationContext(configFile);
    }

}
