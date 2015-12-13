package Ch4.annotation;

 import org.springframework.stereotype.Service;
/**
 * Created by Iwan on 13.12.2015.
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
     public String getMessage() {
         return "Hello World!";
     }
}
