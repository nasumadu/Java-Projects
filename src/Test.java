import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String q1 = "Who has won the most Super Bowls? "
                + "(A)Pittsburgh Steelers (B)Green Bay Packers (C)San Francisco 49ers (D)Dallas Cowboys?";

        String q2 = "Where does Michael Jordan rank on all-time scoring list?"
                + " (A)1st (B)2nd (C)3rd (D)4th";

        String q3 = "What Running Back hold the single season rushing yards record?"
                + " (A)Adrian Peterson (B)Eric Dickerson (C)Barry Sanders (D)Emmitt Smith";

        String q4 = "Who holds the all time career sacks record?"
                + " (A)Deacon Jones (B)Reggie White (C)Bruce Smith (D)Michael Strahan";

        String q5 = "What quarterback holds the single season passing yards record?"
                + " (A)Peyton Manning (B)Drew Brees (C)Tom Brady (D)Dan Marino ";

        String q6 = "What player owns the record for points in a single game?"
                + " (A)Michael Jordan (B)Bill Russell (C)Wilt Chamberlain (D)Oscar Robertson";

        String q7 = "Who was the last player to hit .400 in MLB?"
                + "(A)Ty Cobb (B)Babe Ruth (C)Ted Williams (D)Lou Gehrig";

        String q8 = "How many National Titles did UCLA basketball win in a row?"
                + " (A)7 (B)8 (C)9 (D)10";

        String q9 = "Who holds the NBA record for career assist?"
                + " (A)Magic Johnson (B)Isaiah Thomas (C)John Stockton (D)Steve Nash";

        String q10 = "What college football rivalry is known as 'The Backyard Brawl'?"
                + " (A)Oklahoma vs Texas (B)Auburn vs Alabama (C)Pittsburgh vs West Virginia (D)USC vs UCLA";



        Question[] questions = new Question[]{
                new Question(q1, "A"),
                new Question(q2, "C"),
                new Question(q3,"B"),
                new Question(q4,"B"),
                new Question(q5,"A"),
                new Question(q6,"C"),
                new Question(q7,"C"),
                new Question(q8,"A"),
                new Question(q9,"C"),
                new Question(q10,"C"),

    };

        takeTest(questions);

    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }


    }

