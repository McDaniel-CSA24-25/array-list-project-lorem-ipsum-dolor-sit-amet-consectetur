import java.util.ArrayList;
public class Question {
    String questionText;
    ArrayList<String> options;
    int correctAnswerIndex;
    int difficulty;
    public Question() {
        questionText = "What is my favorite color?";
        options = new ArrayList<>();
        options.add("Red");
        options.add("Blue");
        options.add("Green");
        options.add("Yellow");
        correctAnswerIndex = 1;
        difficulty = 2;
    }
    public Question(String q, ArrayList<String> o, int cai, int d) {
        questionText = q;
        options = new ArrayList<>();
        options.addAll(o);
        correctAnswerIndex = cai;
        difficulty = d;
    }
}
