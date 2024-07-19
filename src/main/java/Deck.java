import java.util.ArrayList;
import java.util.List;

public class Deck implements Display {
    private static int count = 1;
    private int id;
    private String subject;
    private transient User user;
    private List<Card> cards = new ArrayList<>();

    public Deck(String subject, User user) {
        this.id = count++;
        this.subject = subject;
        this.user = user;
    }

    @Override
    public void display() {
        System.out.println("Hallo");
        // Display Methode einfügen //
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Deck.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}

