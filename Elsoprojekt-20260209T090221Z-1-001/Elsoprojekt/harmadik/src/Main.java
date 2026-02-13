import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner szamesbetu = new Scanner(System.in);
        String[] a = new String[4];
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Kerek egy karaktert: ");
            a[i] = szamesbetu.next();
        }
        for (int j = 0; j < b.length; j++) {
            System.out.print("Kerek egy szamot: ");
            b[j] = szamesbetu.nextInt();
        }
        System.out.println("A megadott karakterek: ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("A megadott szamok: ");
        for (int j = 0; j < b.length; j++) {

            System.out.print(b[j]);
        }
    }
}

                                                         