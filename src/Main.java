import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= 2; i++) {

            if (i == 1) {
                System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri: ");
                for (int k = 1; k <= number; k *= 4) {
                    System.out.println(k);
                }
            } else {
                System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri: ");
                for (int l = 1; l <= number; l *= 5) {
                    System.out.println(l);
                }
            }

        }
    }
}
