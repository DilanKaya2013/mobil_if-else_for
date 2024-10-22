import java.util.Scanner;

public class ornekkod1 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        int toplam =0;

        System.out.println("Lütfen");
        for (int i =0;i<10; i++){
            int sayi= oku.nextInt();
            toplam +=  sayi;
        }
    }
}
