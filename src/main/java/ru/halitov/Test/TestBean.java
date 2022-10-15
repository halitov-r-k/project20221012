package ru.halitov.Test;

public class TestBean {
    public static TestBean getBean() { return new TestBean();}
    private String name;
    /* public TestBean(String name) { this.name = name; } */
    private TestBean() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    private void initBean() { System.out.println("Bean-init-method"); }
    private void destroyBean() { System.out.println("Bean-destroy-method"); }
}
