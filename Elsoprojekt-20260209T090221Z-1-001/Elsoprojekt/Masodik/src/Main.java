import java.util.Scanner;
public class Main {
    public static void main(String atgs[]) {
        Scanner szamok= new Scanner(System.in);
        System.out.println("Kerek harom szamot: ");
        int a = szamok.nextInt();
        int b = szamok.nextInt();
        int c = szamok.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
        System.out.print("A haromszog megszerkesztheto");
        }
        else{
        System.out.print("A haromszog nem megszerkesztheto");
        }
        }
        }

