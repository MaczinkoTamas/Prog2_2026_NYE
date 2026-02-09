import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        System.out.println("Kerek ket szamot: ");
        Scanner szorzotabla = new Scanner(System.in);
        int a= szorzotabla.nextInt();
        int b= szorzotabla.nextInt();
        for ( int i= a ; i <= b; i++) {
            for (int j= a; j <= b; j++) {
                System.out.print("|" + i * j + "|");
            }
            System.out.println();
            }
        }
    }