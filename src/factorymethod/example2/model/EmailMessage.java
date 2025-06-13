package factorymethod.example2.model;

public class EmailMessage implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
