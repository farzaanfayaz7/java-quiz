
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            System.out.println("Enter your name: ");

            String userName = name.nextLine();
            System.out.println("Hello, " + userName + "!");

            String q1 = "What is 2 + 2 equal to?";
            String q2 = "What is 5 times 6 equal to?";
            String q3 = "What is 12 divided by 4 equal to?";
            String q4 = "What is 10 - 3 equal to?";
            String q5 = " What is 20 times 5?";

            String a1 = "4";
            String a2 = "30";
            String a3 = "3";
            String a4 = "7";
            String a5 = "100";

            question[] questions = {
                    new question(q1, a1),
                    new question(q2, a2),
                    new question(q3, a3),
                    new question(q4, a4),
                    new question(q5, a5)
            };

            Test(questions);


        }


        public static void Test(question[] questions) {
            int score = 0;
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i].prompt);
                String answer = input.nextLine();
                if (answer.equals(questions[i].answer)) {
                    score++;
                }

                System.out.println("Your score is : " + score + "/" + questions.length);


            }
        }
    }





