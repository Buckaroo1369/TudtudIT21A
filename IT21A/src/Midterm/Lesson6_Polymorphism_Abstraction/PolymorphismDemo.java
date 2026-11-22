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

    }
}
