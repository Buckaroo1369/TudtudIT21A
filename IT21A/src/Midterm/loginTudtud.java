package Midterm;

public class loginTudtud {
    
    public static void main(String[] args) {
        userAcountsTudtud logIn = new userAcountsTudtud();
        logIn.setUserName("admin");
        logIn.setUserPassword("admin123");
        
        if (logIn.getUserName().equals("admin") && logIn.getUserPassword().equals("admin123")) {
            System.out.println("LOGIN Successfully");
        } else {System.out.println("Incorrect Credentials");}
    }
    
    
    
   
}
    
