package projectFinal;

	import java.util.Date;

	public class Message extends Employee{
	    private String text;
	    private User sender;
	    private Date date;

	    public Message() {

	    }

	    public Message(String text, User sender, Date date) {
	        this.text = text;
	        this.sender = sender;
	        this.date = date;
	    }

	    public String getText() {
	        return text;
	    }

	    public void setText(String text) {
	        this.text = text;
	    }

	    public User getSender() {
	        return sender;
	    }

	    public void setSender(User sender) {
	        this.sender = sender;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    @Override
	    public String toString() {
	        return "Message [text=" + text + ", sender=" + sender + ", date=" + date + "]";
	    }
	}

