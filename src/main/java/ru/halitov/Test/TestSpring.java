package ru.halitov.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean = context.getBean("testBeanId", TestBean.class);
        testBean.setName("RuslanH");
        System.out.println(testBean.getName());
        context.close();

    }
}
