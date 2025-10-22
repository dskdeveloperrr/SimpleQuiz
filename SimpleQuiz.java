import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {"Capital of India?", "2+2=?", "Java is a ___?"};
        String[] answers = {"Delhi", "4", "Programming Language"};
        int score = 0;
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase(answers[i])) score++;
        }
        System.out.println("Your score: " + score + "/" + questions.length);
        sc.close();
    }
}
