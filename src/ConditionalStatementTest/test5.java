package ConditionalStatementTest;

public class test5 {
    public static void main(String[] args) {
        String country="India";
        if (!(country=="India")){
            System.out.println("Country should not be India");
        } else{
            System.out.println("Country is India");
        }
    int number=25;
        if (!(number%5==0)){
        System.out.println("Number is not divisible by 5");
        } else {
            System.out.println("Number is divisible by 5");
        }

    }
}
