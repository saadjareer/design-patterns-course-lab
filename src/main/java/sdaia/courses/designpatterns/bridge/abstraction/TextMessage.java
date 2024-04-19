package sdaia.courses.designpatterns.bridge.abstraction;

import sdaia.courses.designpatterns.bridge.implementation.MessageSender;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }

}
