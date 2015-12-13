package Classes;

/**
 * Created by Iwan on 10.12.2015.
 */
public class StandartOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider = null;
    public void renderer() {
        if(messageProvider == null) {
            throw  new RuntimeException(
                    "You must set the property messageProvider of class: "
                    + StandartOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
