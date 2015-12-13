package Ch4;

/**
 * Created by Iwan on 12.12.2015.
 */
public interface NewsletterSender {
    public void setSmtpServer(String stmpServer);
    public String getSmtpServer();

    public void setFromAddres(String fromAddres);
    public String getAddres();
    public void send();
}
