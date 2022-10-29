package lesson13.actions;

public interface ActionsForAdmin {

    default void work() {
        System.out.println("Work with the program");
    }

    static void serverSettings(){
        System.out.println("The server is running");
    }

    void turnOnServer();

    void turnOffServer();
}
