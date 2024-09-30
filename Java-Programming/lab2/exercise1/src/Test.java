import javax.swing.*;
import java.util.Random;

public class Test {
    static Random random = new Random();
    static int correct = 0;
    static int incorrect = 0;
    static String[][] questions = {
            {"What is the correct syntax to declare a main method in Java",
                    "A) public void static main(String args[]) ",
                    "B) static public void main(String[] args)",
                    "C) public static void main(String[] args)",
                    "D) void main(String[] args)"}, {
            "Which of the following is not a Java access modifier?",
            "A) public", "B) private", "C) protected", "D) static" }, {
            "Which method is used to print text to the console in Java?",
            "A) System.print()", "B) System.out.write()", "C) System.out.println()", "D) Console.println()" },
            { "Which of the following is not a loop in Java?", "A) loop", "B) for", "3) while", "4) do-while"},{
            "Which of these operators is used for comparison in Java?", "A) =", "B) ==", "C) !=", "D) Both B and C"}
    };
    public static void simulateQuestion(int[] correctAnswers) {


        for (int i = 0; i < questions.length; i++) {
            int answer = JOptionPane.showOptionDialog(null, questions[i][0], "Question" + (i + 1), JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{questions[i][1], questions[i][2], questions[i][3], questions[i][4]}, null);
            checkAnswer(answer, correctAnswers[i]);
        }
        JOptionPane.showMessageDialog(null, "Correct Answers: " + correct + "\nIncorrect Answers:" + incorrect, "Score", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void checkAnswer(int answer, int correctAnswer) {
        String message;
        if (answer == correctAnswer) {
            message = generateMessage(random.nextInt(5), true);
            correct++;
        } else {
            message = generateMessage(random.nextInt(5), false) + " The correct answer was: " +
                    questions[answer][correctAnswer + 1];
            incorrect++;
        }

        JOptionPane.showMessageDialog(null, message, "Answer Feedback", JOptionPane.INFORMATION_MESSAGE);
    }

    //Not sure
    public static String generateMessage(int x, boolean isCorrect){
        if (isCorrect) {
            switch (x) {
                case 1:
                    return "You are doing great!";
                case 2:
                    return "Correct! Keep pushing forward!";
                case 3:
                    return "RIGHT! Success is just around the corner.";
                case 4:
                    return "PERFECT keep going!";
                case 5:
                    return "Your on FIRE!";
                default:
                    return "ERROR";
            }
        } else {
            switch (x) {
                case 1:
                    return  "Oops! That's not correct.";
                case 2:
                    return "Incorrect. Better luck next time!";
                case 3:
                    return "Not quite! The correct answer was: ";
                case 4:
                    return "Wrong But, Never back down Never What?";
                case 5:
                    return  "Wrong, But keep trying!!";
                default:
                    return "ERROR";
            }
        }
    }

    public void inputAnswer() {
        int[] correctAnswers = {2, 3, 2, 0, 3};

        simulateQuestion(correctAnswers);

        JOptionPane.showMessageDialog(null, "Correct Answers: " + correct + "\nIncorrect Answers: " + incorrect, "Score", JOptionPane.INFORMATION_MESSAGE);
    }



}
