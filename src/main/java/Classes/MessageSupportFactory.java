package Classes;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Iwan on 10.12.2015.
 */
public class MessageSupportFactory {

    private static MessageSupportFactory instance = null;

    private Properties props = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;
    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(new FileInputStream("C:\\Users\\Iwan\\IdeaProjects\\HWSpringCore\\src\\main\\java\\conf\\msf.properties"));

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer =
                    (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider =
                    (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    static {
        instance = new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance() {

        return instance;
    }
    public  MessageRenderer getMessageRenderer()
    {
        return renderer;
    }
    public MessageProvider getMessageProvider()
    {
        return provider;
    }
}
