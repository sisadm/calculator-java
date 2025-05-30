import java.util.Scanner;


public class Main {
 
    

    public static void main(String[] args) {
        
        // define scanner 
        Scanner scanner = new Scanner(System.in);
 
        

        // first line to get the first number
        System.out.println("When ever you want to Quit, type <q>!");
        System.out.println("Please enter the first number: ");
        
        // save the input as a string
        String firstNumber = scanner.next();


        // convert string to double
        double num1 = Double.parseDouble(firstNumber);




        
    }

}