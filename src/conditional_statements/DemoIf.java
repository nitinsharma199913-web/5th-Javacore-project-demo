package conditional_statements;

import java.sql.SQLOutput;

public class DemoIf {

    public static void main(String[] args) {
        //SYNTAX : if(condition){}
        //Write a code to check any number is greater than 0 or not?
        int number = 10;
        if (number>0) {
            System.out.println("Number is greater than Zero.... "+number);
        }
        //write a code to check number is less tha  zero
        if (number<0) {
            System.out.println("Number is less than Zero...  "+number);
        }
//Write a code to check if a person city is Pune
        String city = "Delhi";
        if (city=="Pune"){
            System.out.println("Person city is Pune...  "+city);
        }
        //Write a code to check if a person's city is not Pune
        if (city!="Pune"){
            System.out.println("Person city is not Pune...  "+city);
        }
        //Write a code to check if a product price is costly(>5000) or not?
        double price=1000;
        if (price>=5000){
            System.out.println("Product is costly....  "+price);
        }
        //Write a code to check if a product price is Not Costly(<5000)?
        if (price<5000){
            System.out.println("Product is Not costly...  "+price);
        }
        }
    }

