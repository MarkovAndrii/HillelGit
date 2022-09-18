package lesson3;

public class Admin extends Support {

    @Override
    public void read(String text) {
        super.read(text);
        stringDeletion(stringValidation(text)); // производим действие с константой(удаляем или оставляем)
    }

    public void stringDeletion(boolean contains) {  //метод-удаления

        if (contains == true) {
            CONST = null;
        }
    }
}
