import java.util.Scanner;

public class ornekler2 {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'ya kadar olan sayıların toplamı: " + toplam);
        scanner.close();
    }
    }

