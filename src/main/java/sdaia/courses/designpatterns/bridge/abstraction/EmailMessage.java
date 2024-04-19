package sdaia.courses.designpatterns.bridge.abstraction;
import sdaia.courses.designpatterns.bridge.implementation.MessageSender;

public class EmailMessage extends Message{
    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
        messageSender.sendMessage();
    }

}
