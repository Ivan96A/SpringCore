package Classes;

/**
 * Created by Iwan on 10.12.2015.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
