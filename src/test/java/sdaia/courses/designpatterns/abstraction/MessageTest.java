package sdaia.courses.designpatterns.abstraction;

import org.junit.Test;
import sdaia.courses.designpatterns.bridge.abstraction.Message;
import sdaia.courses.designpatterns.bridge.abstraction.TextMessage;
import sdaia.courses.designpatterns.bridge.implementation.EmailMessageSender;
import sdaia.courses.designpatterns.bridge.implementation.MessageSender;
import sdaia.courses.designpatterns.bridge.implementation.TextMessageSender;


public class MessageTest {

    @Test
    public void testSend() throws Exception {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new TextMessage(emailMessageSender);
        emailMessage.send();
    }
}
