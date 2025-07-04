import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        List<Question> questions = createQuestions();

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("----------------------");

        int questionNumber = 1;
        for (Question q : questions) {
            System.out.println("Question " + questionNumber + ": " + q.getQuestionText());
            String[] options = q.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            int userAnswer = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter your choice (1-" + options.length + "): ");
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    if (userAnswer >= 1 && userAnswer <= options.length) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid choice. Try again.");
                    }
                } else {
                    System.out.println("Please enter a number!");
                    scanner.next(); // consume invalid token
                }
            }

            if (userAnswer - 1 == q.getCorrectOption()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " 
                        + options[q.getCorrectOption()] + "\n");
            }
            questionNumber++;
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your score: " + score + " out of " + questions.size());
    }

    public static List<Question> createQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question(
            "Which language is used for Android development?",
            new String[]{"Java", "Swift", "C#", "Ruby"},
            0
        ));

        list.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"this", "extends", "implements", "super"},
            1
        ));

        list.add(new Question(
            "Which method is the entry point for a Java program?",
            new String[]{"main()", "start()", "init()", "run()"},
            0
        ));

        return list;
    }
}
