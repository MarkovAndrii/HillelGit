package lesson1;

public class gitlesson1 {
    public static void main(String[] args) {
        byte varByte = 10;
        short varShort = 12500;
        long varLong = 34569022;
        float varFloat = 54.55009f;
        char varChar = 'a';
        boolean varBoolean = true;
        String string1 = "Hello";
        String string2 = new String("Hello");
        int varInt1 = 1, varInt2 = 5, varInt3 = 7;
        double varDouble1 = 3.5, varDouble2 = 6.1, varDouble3 = 9.4;

        int intResult1 = varInt1 + varInt2 - varInt3;
        int intResult2 = varInt1 * varInt2 - varInt3;
        int intResult3 = varInt1 + varInt2 * varInt3;
        int intResult4 = varInt1 * varInt2 + varInt3;
        int intResult5 = (varInt1 + varInt3) * varInt2;
        System.out.println(intResult1);
        System.out.println(intResult2);
        System.out.println(intResult3);
        System.out.println(intResult4);
        System.out.println(intResult5);
        double doubleResult1 = varDouble1 + varDouble2 - varDouble3;
        double doubleResult2 = varDouble1 * varDouble2 - varDouble3;
        double doubleResult3 = varInt1 + varDouble1 * varInt2;
        double doubleResult4 = varDouble1 * varInt2 + varDouble1;
        double doubleResult5 = doubleResult1 * varInt2 / varInt1;
        System.out.println();
        System.out.println(doubleResult1);
        System.out.println(doubleResult2);
        System.out.println(doubleResult3);
        System.out.println(doubleResult4);
        System.out.println(doubleResult5);

        varInt1 += 9;
        System.out.println();
        System.out.println(varInt1);    //10
        varInt1 -= 5;
        System.out.println(varInt1);    //5
        varInt1 *= varInt2;
        System.out.println(varInt1);    //25
        varInt1 /= 5;
        System.out.println(varInt1);    //5
        varInt1 %= 2;
        System.out.println(varInt1);    //1
        varDouble1 -= 0.5;
        System.out.println(varDouble1);   //3.0
        varDouble1 += -5;
        System.out.println(varDouble1);   //-2.0
        varDouble1 *= -3;
        System.out.println(varDouble1);   //6.0
        varDouble1 /= 2;
        System.out.println(varDouble1);    //3.0
        varDouble1 %= 3;
        System.out.println(varDouble1);    //0.0

        boolean booleanResult1 = varInt1 >= varInt2;
        boolean booleanResult2 = varDouble1 <= varDouble2;
        boolean booleanResult3 = varInt2 != varInt3;
        boolean booleanResult4 = varDouble2 > varInt3;
        boolean booleanResult5 = doubleResult4 == 21;
        System.out.println();
        System.out.println(booleanResult1);
        System.out.println(booleanResult2);
        System.out.println(booleanResult3);
        System.out.println(booleanResult4);
        System.out.println(booleanResult5);

        int incDec = 1;
        System.out.println();
        System.out.println(incDec); //1
        incDec--;
        System.out.println(incDec); //0
        incDec++;
        System.out.println(incDec); //1
        System.out.println(incDec); //1
        System.out.println(incDec); //1
        incDec++;
        System.out.println(incDec); //2
        incDec--;
        System.out.println(incDec); //1
        System.out.println(incDec); //1

        int[] myArray = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
    }
}
