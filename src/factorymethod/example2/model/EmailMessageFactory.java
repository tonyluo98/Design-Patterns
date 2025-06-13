package factorymethod.example2.model;

public class EmailMessageFactory extends MessageFactory {

    @Override
    public Message createMessage() {
        return new EmailMessage();
    }
}
