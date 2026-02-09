import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int i=0; i<1000; i++){
            if(((i/10)%10)< i/100){
                System.out.println(i);
            }
        }
    }
}



