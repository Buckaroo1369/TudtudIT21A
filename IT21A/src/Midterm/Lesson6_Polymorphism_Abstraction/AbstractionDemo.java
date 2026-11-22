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

class MemoryFragment extends RecoveredFragment {

    MemoryFragment(String fragmentName) {
        super(fragmentName);
    }

    @Override
    void describeRecovery() {
        System.out.println("Recovery Details: A memory recovered from  the past");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

    }
    
}
