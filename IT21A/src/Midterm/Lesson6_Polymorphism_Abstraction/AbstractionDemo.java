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

class DreamFragment extends RecoveredFragment {

    DreamFragment(String fragmentName) {
        super(fragmentName);
    }

    @Override
    void describeRecovery() {
        System.out.println("Recovery Details: A dream recovered from the imagination");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("THE LOST AND FOUND DEPARTMENT OF THE MIND");
        System.out.println("========================================");
        System.out.println("New fragments received...\n");

        RecoveredFragment fragment1 =
                new MemoryFragment("A Familiar Place");

        RecoveredFragment fragment2 =
                new DreamFragment("Somewhere That Doesn't Exist");

        fragment1.displayRecord();
        fragment1.describeRecovery();

        System.out.println();

        fragment2.displayRecord();
        fragment2.describeRecovery();

        System.out.println("\nAll fragments have been recorded.");
        System.out.println("========================================");

    }
    
}
