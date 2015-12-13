package Classes;

/**
 * Created by Iwan on 10.12.2015.
 */
public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer mr = new StandartOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.renderer();
    }
}
