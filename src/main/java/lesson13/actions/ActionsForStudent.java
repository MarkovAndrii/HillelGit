package lesson13.actions;

public interface ActionsForStudent {

    default void work() {
        System.out.println("To study at the university");
    }

    static void learnLanguage(){
        System.out.println("Understand English well");
    }

    void read();

    void answer();
}
