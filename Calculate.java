import jdk.nashorn.internal.objects.NativeString;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

class Calculate {

    public static void main(String[] args) {

        int a = 3;
        int b = 1;
        int c = 1;
        int g = 1;
        System.out.println("+------+------+------+------+------+------+" +
                "------+------+------+------+");

        for (int i = 1; i <= 10; i ++) {
            System.out.printf("|%6d", g);
            g++;
        }System.out.print("|");
        System.out.println();
        System.out.println("+------+------+------+------+------+------+" +
                "------+------+------+------+");
        while (c <= 10) {
            b *= a;
            System.out.printf("|%6d", b );
            c++;
        }System.out.print("|");
        System.out.println();
        System.out.println("+------+------+------+------+------+------+" +
                "------+------+------+------+");
    }
}



        /*


          for (int i = -99; i <= y; i++) {
            if (Math.abs(i % 2) == 1 && i >= x && i <= y && x != y) {
                System.out.print(i + " ");
            } else {
                a++;
            }
        }
*/
