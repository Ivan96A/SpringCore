package Ch4.xml;

/**
 * Created by Iwan on 13.12.2015.
 */
public interface MessageRenderer {
    public void renderer();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}
