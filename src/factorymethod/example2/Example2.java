package factorymethod.example2;
import factorymethod.example2.model.EmailMessageFactory;
import factorymethod.example2.model.LetterMessageFactory;
import factorymethod.example2.model.MessageFactory;

//Example creating a factory method with abstract factory with business logic
public class Example2 {

    public static void main(String[] args) {
        MessageFactory emailFactory = new EmailMessageFactory();
        emailFactory.send("Hello via Email!");

        MessageFactory letterFactory = new LetterMessageFactory();
        letterFactory.send("Hello via Letter!");
    }

}
