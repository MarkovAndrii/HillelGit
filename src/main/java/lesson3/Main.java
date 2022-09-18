package lesson3;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Support support = new Support();
        Admin admin = new Admin();

        method(user);   //написать строку
        method(support);    //написать строку + проверить наличие этой строки в константе
        method(admin);  //написать строку + проверить наличие этой строки в константе + удалить константу, если такая строка найдена
    }

    public static void method(User user) {  //метод для родительского класса User и всех его наследников
        user.write();
    }
}