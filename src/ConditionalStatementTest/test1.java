package ConditionalStatementTest;
public class test1 {
    public static void main(String[] args) {
        //Write a code to check whether person is eligible for driving licence based on
        // condition of age, age should less than 18 years?
        int age =24;
        if (age >= 18) {
            System.out.println("Yes, Person is eligible for driving licence...");
        }
        if (age < 18) {
            System.out.println("No, Person is not eligible for driving licence...");
        }
        //Write a code to check century of a batsman?
        int runs = 154;
        if (runs >= 100) {
            System.out.println("Batsman make century...");
        }
        if (runs < 100) {
            System.out.println("Batsman doesn't make century...");
        }
    }
}
