package lesson3;

public class Support extends User {

    protected String CONST = "ABCDE THIS IS MY FAMILY \n"
            + "GHIJ I LOVE THEM EVERY DAY \n"
            + "KLMNO MOTHER, FATHER, BABY, OH \n"
            + "PQRST BROTHER, SISTER, YUO CAN SEE \n"
            + "UVWXYZ ALL THE PEOPLE IN MY FAMILY \n";

    @Override
    public void read(String text) {
        super.read(text);
        System.out.println(stringValidation(text)); //проверяем наличие введенной строки в заранее подготовленной константе
    }

    public boolean stringValidation(String string) {    //метод-проверки строки
        boolean test;
        int value = CONST.indexOf(string);

        if (value != -1) {   //проверка наличия string в CONST
            test = true;
        } else {
            test = false;
        }

        return test;
    }
}
