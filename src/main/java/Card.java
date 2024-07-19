
public abstract class Card implements Display {
        protected int id;
        protected String question;
        protected String answer;
        protected int difficulty;
        protected boolean isknown;
        protected transient Deck deck;
        protected static int count = 1;
    
        public Card(String question, String answer, Deck deck) {
            this.id = count++;
            this.question = question;
            this.answer = answer;// zwischen 0 - 5 Schwierigkeitsstufen
            this.difficulty = 0;
            this.isknown = false;
            this.deck = deck;
        }
    
    
    
        @Override
        public void display() {
            System.out.println("Hallo");
            //Display Methode einfügen//
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public boolean maskAsKnown(){
            isknown = true;
            return isknown;
        }
    
        public boolean maskAsUnknown(){
            isknown = false;
            return isknown;
        }
    
        public int increaseDifficulty(){
            if(difficulty < 5){
                ++difficulty;
            }
            return difficulty;
        }
    
        public int decreaseDifficulty(){
            if(difficulty > 0){
                --difficulty;
            }
            return difficulty;
        }
    
        public boolean isIsknown() {
            return isknown;
        }
    
        public void setIsknown(boolean isknown) {
            this.isknown = isknown;
        }
    
        public String getAnswer() {
            return answer;
        }
    
        public void setAnswer(String answer) {
            this.answer = answer;
        }
    
        public int getDifficulty() {
            return difficulty;
        }
    
        public void setDifficulty(int difficulty) {
            this.difficulty = difficulty;
        }
    
        public Deck getDeck() {
            return deck;
        }
    
        public void setDeck(Deck deck) {
            this.deck = deck;
        }
    
        public static int getCount() {
            return count;
        }
    
        public static void setCount(int anzahl) {
            Card.count = anzahl;
        }
    
        public String getQuestion() {
            return question;
        }
    
        public void setQuestion(String question) {
            this.question = question;
        }
    }

