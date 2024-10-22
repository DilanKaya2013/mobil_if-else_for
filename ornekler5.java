import java.util.Scanner;

public class ornekler5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buyukSayilar = 0;
        int kucukSayilar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanner.nextInt();

            if (sayi > 50) {
                buyukSayilar++; // 50'den büyük sayılar için sayacı artır
            } else if (sayi < 50) {
                kucukSayilar++; // 50'den küçük sayılar için sayacı artır
            }
        }

        System.out.println("50'den büyük sayıların adedi: " + buyukSayilar);
        System.out.println("50'den küçük sayıların adedi: " + kucukSayilar);

        scanner.close();
    }
}


