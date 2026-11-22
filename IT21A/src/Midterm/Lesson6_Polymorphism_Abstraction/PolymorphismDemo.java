class LostFragment {

    public void recover() {
        System.out.println("Recovering a lost fragment of the mind...");
    }
}

class ForgottenMemory extends LostFragment {

    @Override 
    public void recover() {
        System.out.println("Memory Recovered: A moment that was almost forgotten...");
    }
}

class UnansweredQuestion extends LostFragment {

    @Override
    public void recover() {
        System.out.println("Question recovered: Still unanswered, but not forgotten...");
    }
}

public class PolymorphismDemo {
    
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     THE LOST AND FOUND OF THE MIND     ");
        System.out.println("========================================");
        System.out.println("Recover session initiated...\n");

        LostFragment fragment1 = new ForgottenMemory();
        LostFragment fragment2 = new UnansweredQuestion();

        fragment1.recover();
        fragment2.recover();

        System.out.println("\nRecover session complete.");
        System.out.println("========================================");
        
    }
}
