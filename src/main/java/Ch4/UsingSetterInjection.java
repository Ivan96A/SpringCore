package Ch4;

import Ch4.xml.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Iwan on 13.12.2015.
 */
public class UsingSetterInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-myxml.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.renderer();
    }
}
