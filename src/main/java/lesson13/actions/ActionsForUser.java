package lesson13.actions;

public interface ActionsForUser {

    default void work() {
        System.out.println("Study in the program");
    }

    static void performTask(){
        System.out.println("The task is completed");
    }

    void turnOnComputer();

    void turnOffComputer();
}
