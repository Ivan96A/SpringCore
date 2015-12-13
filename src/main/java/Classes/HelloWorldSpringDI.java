package Classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Iwan on 10.12.2015.
 */
public class HelloWorldSpringDI {
     public static void main(String[] args) {
         ApplicationContext ctx = new ClassPathXmlApplicationContext
                 ("app-context.xml");
         MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
         mr.renderer();
     }
}
