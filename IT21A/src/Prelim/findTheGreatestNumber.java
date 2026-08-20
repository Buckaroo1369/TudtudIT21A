package Prelim;
import java.util.Scanner;
public class findTheGreatestNumber {
    
    public static void main(String[] args) {
        
        Scanner vince = new Scanner(System.in);
        
        System.out.print("Input the 1st number: ");
        int num1 = vince.nextInt();
        
        System.out.print("Input the 2nd number: ");
        int num2 = vince.nextInt();
        
        System.out.print("Input the 3rd number: ");
        int num3 = vince.nextInt();
        
        vince.close();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }
    
    }
}
