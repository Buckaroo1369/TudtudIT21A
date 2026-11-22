abstract class RecoveredFragment {

    String fragmentName;

    RecoveredFragment(String fragmentName) {
        this.fragmentName = fragmentName;
    }

    abstract void describeRecovery();

    void displayRecord() {
        System.out.println("Recovered Fragment: " + fragmentName);
        System.out.println("Department Record: Filed and documented.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

    }
    
}
