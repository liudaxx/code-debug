package org.springframework;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import singleton.init.TestBean;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    private static DefaultListableBeanFactory bf;


    public static void main( String[] args ) throws IOException {
        bf = new DefaultListableBeanFactory();
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\learn\\code-debug\\src\\main\\resources\\com.singleton\\getBean-config.xml");

        TestBean testBean = (TestBean) applicationContext.getBean("testBean-1");
        System.out.println(testBean.getNumber());;
        System.out.println(testBean.getTestBean());;
        TestBean testBean2 = (TestBean) applicationContext.getBean("testBean-2");

        System.out.println( "Hello World!" );
    }
}
