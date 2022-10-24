package ru.halitov.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestJavaConfig {
    public static void main(String[] args) {
     AnnotationConfigApplicationContext context =
             new AnnotationConfigApplicationContext(SpringConfig.class);


     context.close();
    }
}
