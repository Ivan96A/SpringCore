package Ch4;

import Ch4.annotation.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Iwan on 13.12.2015.
 */
public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-annotation.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("messageProvider",
                MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
