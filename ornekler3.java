import java.util.Scanner;

public class ornekler3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int toplam = 0;
        int baslangic = Math.min(sayi1, sayi2);
        int bitis = Math.max(sayi1, sayi2);

        for (int i = baslangic; i <= bitis; i++) {
            toplam += i;
        }

        System.out.println(baslangic + " ile " + bitis + " arasındaki sayıların toplamı: " + toplam);
        scanner.close();


    }
    }

