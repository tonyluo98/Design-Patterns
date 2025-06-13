package factorymethod.example2.model;

public class LetterMessage implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Letter: " + message);
    }
}
