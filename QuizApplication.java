import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class QuizApplication {
    public static  void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> setupAnswers = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();
        setupAnswers.add("Yes");
        setupAnswers.add("No");
        questions.add(new Question("Do you love the color of the sky?", setupAnswers, 0, 1));
        questions.add(new Question("(12+144+20+3sqrt(4))/7+5*11=9^2+0?", setupAnswers, 0, 3));
        setupAnswers.set(0, "A snake a snake");
        setupAnswers.set(1, "Oh, it's a snake");
        setupAnswers.add("Mushroom mushroom");
        setupAnswers.add("Mush-mushroom");
        questions.add(new Question("Badger badger badger badger badger badger badger badger badger badger badger badger.", setupAnswers, 2, 1));
        questions.add(new Question());
        setupAnswers.set(0, "Line break");
        setupAnswers.set(1, "Backspace");
        setupAnswers.set(2, "Vertical tab");
        setupAnswers.set(3, "Carriage return");
        questions.add(new Question("What does \\r do?", setupAnswers, 3, 2));
        setupAnswers.set(0, "Yes");
        setupAnswers.set(1, "No");
        setupAnswers.set(2, "Maybe");
        setupAnswers.set(3, "No, but you are");
        questions.add(new Question("Is it cake?", setupAnswers, 1, 1));
        Collections.shuffle(questions);
        int score = 0;
        for (Question q : questions) {
            printQuestion(q);
            if (keyboard.nextInt()==q.correctAnswerIndex) {
                System.out.println("Correct!\n");
                score += q.difficulty;
            } else {
                System.out.println("Incorrect.\n");
            }
        }
        System.out.println("Your final score was "+score+".");
    }
    public static void printQuestion(Question q) {
        System.out.println(q.questionText+"\t(Difficulty "+q.difficulty+")");
        for (int i = 0; i<q.options.size(); i++) {
            System.out.println("\t"+i+": "+q.options.get(i));
        }
    }
}
