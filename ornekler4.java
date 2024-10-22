import java.util.Scanner;

public class ornekler4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli hesaplanacak pozitif bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        long faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
        scanner.close();
    }
}
