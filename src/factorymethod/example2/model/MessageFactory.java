package factorymethod.example2.model;

import factorymethod.example2.Message;

public abstract class MessageFactory {

    public abstract Message createMessage();

    public void send(String message) {
        Message msg = createMessage();
        msg.sendMessage(message);
    }
}
