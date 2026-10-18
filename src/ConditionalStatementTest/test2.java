package ConditionalStatementTest;

public class test2 {
    public static void main(String[] args) {
        //Write a code to check voting eligibility. If candidate is eligible then show
        // message "Welcome to voting System".
        int age=13;
        if (age>=18) {
            System.out.println("Welcome to Voting System...");
        }
        if (age<18){
                System.out.println("You are not eligible for Voting...");
            }

    }
}
