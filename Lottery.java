//Prompts user to enter a two-digit number that does not start with zero and compares that number to a
//randomly-generated lottery number to evaluate if the numbers match completely, in part, or not at all.

package lottery;

import static java.lang.Math.round;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        // Generate random lottery numbers
        int lottery = (int)(System.currentTimeMillis() % 100);
        int lottery1 = round(lottery/10);
        int lottery2 = lottery % 10;
                
        // Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a two-digit number that does not start with zero.");
        int userResponse = input.nextInt();
        int userResponse1 = round(userResponse/10);
        int userResponse2 = userResponse % 10;
        
        // Evaluate response against random number
        if (userResponse == lottery){
            System.out.println("Congratulations! You have won $10,000. The lottery number is "
                    + lottery + " and your number is " + userResponse + ".");
        } else if (userResponse1 == lottery1 && userResponse2 == lottery2){
            System.out.println("Congratulations! You have won $3,000. The lottery number is "
            + lottery + " and your number is " + userResponse + ".");
        } else if (userResponse1 == lottery1 || userResponse2 == lottery2){
            System.out.println("Congratulations! You have won $1,000. The lottery number is "
            + lottery + " and your number is " + userResponse + ".");
        } else {
            System.out.println("Sorry. You did not win. The lottery number is " + lottery
            + " and your number is " + userResponse + ".");
        }
        
    }
    
}