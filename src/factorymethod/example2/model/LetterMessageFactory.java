package factorymethod.example2.model;

public class LetterMessageFactory extends MessageFactory {

    @Override
    public Message createMessage() {
        return new LetterMessage();
    }
}
