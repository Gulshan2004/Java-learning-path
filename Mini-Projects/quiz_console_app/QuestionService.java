import java.util.Scanner; //Imports the Scanner class so that we can take input from the keyboard.

public class QuestionService {
    Question[] questions = new Question[5]; // Array that stores   Question Object with name=questions
    String selection[] = new String[5]; //This stores the answers entered by the user.

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) { //Take each Question object from questions[] and store it inside q
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in); // Helps get the value from th user
            selection[i] = sc.nextLine();// Suppose User enters 4 then selection[0]="4" , It bassically stores the value entered by the user in a sequential manner 
            i++;//Move to the Next position 
        }
        for (String s : selection) { // This prints the Entire Selection Array after the loop ends whuch contains the value entered by the user 
            System.out.println(s);
        }
    }
    public void printScore(){ //Checks whether answers are correct.
        int score=0; //initally 0 
        for(int i=0;i<questions.length;i++){
            Question que = questions[i]; //Current question 
            String actualAnswer = que.getAnswer();// this will check the actual answer
            String userAnswer =selection[i];// this will check the user's Answer 

            if(actualAnswer.equals(userAnswer)){ // compares both the answers
                score ++; // if true than increment score
            }
        }
        System.out.println("Your score is : " + score); // After the loop ends enter the final score
    }

}
