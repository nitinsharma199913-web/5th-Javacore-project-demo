package ConditionalStatementTest;

public class test3 {
    public static void main(String[] args) {
        long marks=45;
        if (marks>=33){
            System.out.println("Cleared the Exam...");
        }
        if (marks<33){
            System.out.println("Not Cleared the Exam...");
        }
        String country="Japan";
        if (country=="India"){
            System.out.println("INDIAN...");
        }
        if (country!="India"){
            System.out.println("NON INDIAN...");
        }

    }
}
