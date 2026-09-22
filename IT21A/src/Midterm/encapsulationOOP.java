package Midterm;

import java.util.Scanner;

public class encapsulationOOP {
    
    private int eks;
    
    public int gitNam(){
        return eks;
    }
    
    public void sitNam(int nam){
        this.eks = nam;
    }
    
    public static void main(String[] args) {
       encapsulationOOP obj = new encapsulationOOP();
       obj.sitNam(67);
       
        System.out.println("Da nambir is: " + obj.eks);
    }
    
}
