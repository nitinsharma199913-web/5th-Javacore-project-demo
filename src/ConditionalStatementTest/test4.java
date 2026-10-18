package ConditionalStatementTest;

public class test4 {
    public static void main(String[] args) {
        // Write a code to check % of  student?
        // 1. percentage >=33 and <60 : Second Division
        // 2. percentage >=60 and <75 : First Division
        // 3. Percentage >75 : Gold Medalist
        int marks=33;
        if (marks>=75){
            System.out.println("Gold Medalist...");
        } else if (marks>=60){
            System.out.println("First Division...");
        } else if (marks>=33) {
            System.out.println("Second Division...");
        } else if (marks<33) {
            System.out.println("Fail....");
        }


    }
}
