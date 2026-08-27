package Prelim;
import java.util.Scanner;

public class FunDemMethodsDEMO {
    
    //void method
    static void Greetings(String name, int age){
            System.out.println("Hilo, I am " + name + ". I am " + age + " years young!");
    }
    
    //returning method
    static int calculateRealAge(int currentYear, int birthYear) {
        return currentYear - birthYear;    
    }
    
    public static void main(String[] args) {
        Greetings("Vince", 23);
        
        int calculatedAge = calculateRealAge(2026, 2003);
        System.out.println("I am actually " + calculatedAge + " :P");
        
        Scanner vince = new Scanner(System.in);
                System.out.println("\nWho are you?");
                System.out.print("Enter your name: ");
                String name  = vince.nextLine();
                System.out.print("Enter your age: ");
                int age = vince.nextInt();
                System.out.println("Hello " + name + ", you are " + age + "years old.");
               
        if (age < 13) { System.out.println("You are too young!"); }
        else if (age > 12 && age < 20) { System.out.println("You are a Teenager"); }
        else { System.out.println("You are expired.."); }
        
        System.out.println("\nAre you telling the truth?");
        System.out.print("Tell me the year today: ");
        int yearToday = vince.nextInt();
        System.out.print("Tell me your Birthyear: ");
        int birthYear = vince.nextInt();   
        int realAge = yearToday - birthYear;
        if (realAge == age) { System.out.println("Mkay..."); }
        else { System.out.println("LIAR!!!! Kasuklamsuklam"); }
        
        String[] children = {"Whitey", "Browney", "Blacky"};
        
        System.out.println("\nChildren of Vince: ");
        for (int cv = 0; cv < children.length; cv++) {
            System.out.println(children[cv]);
        }
        
        
    }
    
}
