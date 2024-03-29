import javax.mail.Message;

//class for forming a message from GUI
public class MyMessage {

    private User user;
    private String from;
    private String to;
    private String subject;
    private String messageText;

    MyMessage(User user, String from, String to, String subject, String messageText) {
        this.user = user;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.messageText = messageText;
    }

    // getters and setters for class fields
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
