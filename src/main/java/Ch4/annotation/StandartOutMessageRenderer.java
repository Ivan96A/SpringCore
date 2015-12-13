package Ch4.annotation;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Created by Iwan on 13.12.2015.
 */
@Service("messageRenderer")
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

      @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = messageProvider;
    }
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}

