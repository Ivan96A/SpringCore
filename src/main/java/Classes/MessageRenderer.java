package Classes;

/**
 * Created by Iwan on 10.12.2015.
 */
public interface MessageRenderer {

    public void renderer();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}
