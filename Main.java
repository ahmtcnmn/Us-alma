import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a,b,c;
        out.print("Üssü alınacak sayıyı girini : ");
        a=input.nextInt();
        out.print("Üs olacak sayıyı giriniz : ");
        b=input.nextInt();
        for (int i=1;i<b;i++){
            a*=a;
        }
        out.print("Cevabınız : "+a);
    }
}
