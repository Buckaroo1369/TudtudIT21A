package Midterm;
import java.util.Scanner;

public class encapsulationPractice {
    
    private String greekGod;
    
    public String getName(){
        return greekGod;
    }
    
    public void setName(String name){
        this.greekGod = name;
    }
    
    public static void main(String[] args) {
        encapsulationPractice who = new encapsulationPractice();
        who.setName("RENE BATERBONIA");
        System.out.println("The name of the Greek God is " + who.greekGod);
        
        if (name("RENE BATERBONIA")) {System.out.println("MAAAAAAMAAAAA");
        
        }
        
    }
    
    
    
}
