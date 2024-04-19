package sdaia.courses.designpatterns.bridge.abstraction;

import sdaia.courses.designpatterns.bridge.implementation.MessageSender;

public abstract class Message {
    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
