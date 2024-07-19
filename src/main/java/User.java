import java.util.ArrayList;
import java.util.List;

public class User implements Display {
    private int userId;
    private String username;
    private List<Deck> decks;
    private static List<User> users = new ArrayList<>();
    private static int count = 1;

    public User(String username) {
        this.userId = count++;
        this.username = username;
        this.decks = new ArrayList<>();
        users.add(this);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        User.users = users;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }

    public void addDeck(Deck deck) {
        this.decks.add(deck);
    }

    @Override
    public void display() {
        System.out.println("Hallo");
        //implement Display Method//
    }


}