
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilo;
        double boy,endeks;

        Scanner input =new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Girin: ");
        boy=input.nextDouble();

        System.out.print("Lütfen Kilonuzu Girin: ");
        kilo=input.nextInt();

        endeks=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: " + endeks);

    }
}
