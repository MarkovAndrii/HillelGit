package lesson13.actions;

public interface ActionsForTeacher extends ActionsForStudent{

    default void work() {
        System.out.println("Teach at the university");
    }

    static void teachEnglish() {
        System.out.println("Higher level English");
    }

    void tell();

    void listen();
}
