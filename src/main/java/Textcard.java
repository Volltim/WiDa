public class Textcard extends Card {

    public Textcard(String question, String answer, Deck deck) {
        super(question, answer, deck);
    }



    @Override
    public void display() {
        System.out.println("Question: " + getQuestion());
        System.out.println("Answer: " + getAnswer());
        System.out.println("Difficulty: " + getDifficulty());
        System.out.println("Known: " + (isIsknown() ? "Yes" : "No"));
    }
}
