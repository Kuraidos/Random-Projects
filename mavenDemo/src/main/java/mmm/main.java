package mmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/spring.xml");

        Vehicle obj = (Vehicle)context.getBean("car");
        obj.drive();
        System.out.println(context.getBean("tyre"));
    }
}
