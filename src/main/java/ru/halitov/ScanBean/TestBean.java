package ru.halitov.ScanBean;

import org.springframework.stereotype.Component;

@Component("TestBeanId")
public class TestBean {
    private String name;
    public TestBean() { }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    private void initBean() { System.out.println("Bean-init-method"); }
    private void destroyBean() { System.out.println("Bean-destroy-method"); }
}
