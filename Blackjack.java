import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            int num1 = 0; 
            int num2 = 0;
            num1 = (int)(10*Math.random() + 1); 
            num2 = (int)(10*Math.random() + 1); 
            int sum = num1 + num2; 
            System.out.println("You have a " + num1 + " and a " + num2 + " for a total of " + sum);
            System.out.println("Enter a 1 if you want another card or any other number, if not enter any other number");
            int input = userInput.nextInt(); 
            if (input ==1);
        }



        
    }
}