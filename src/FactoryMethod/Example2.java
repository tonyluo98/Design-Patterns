package FactoryMethod;

//Example creating a factory method with abstract factory with business logic
public class Example2 {

    public static void main(String[] args) {
        MessageFactory emailFactory = new EmailMessageFactory();
        emailFactory.send("Hello via Email!");

        MessageFactory letterFactory = new LetterMessageFactory();
        letterFactory.send("Hello via Letter!");
    }

    interface Message {

        void sendMessage(String message);
    }

    static class EmailMessage implements Message {

        @Override
        public void sendMessage(String message) {
            System.out.println("Sending Email: " + message);
        }
    }

    static class LetterMessage implements Message {

        @Override
        public void sendMessage(String message) {
            System.out.println("Sending Letter: " + message);
        }
    }

    static abstract class MessageFactory {

        public abstract Message createMessage();

        public void send(String message) {
            Message msg = createMessage();
            msg.sendMessage(message);
        }
    }

    static class EmailMessageFactory extends MessageFactory {

        @Override
        public Message createMessage() {
            return new EmailMessage();
        }
    }

    static class LetterMessageFactory extends MessageFactory {

        @Override
        public Message createMessage() {
            return new LetterMessage();
        }
    }
}
