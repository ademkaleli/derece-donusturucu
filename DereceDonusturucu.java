package derecedonusturucu;

import java.util.Scanner;
import java.util.InputMismatchException;

/* =========================================================
 * Ders: Algoritma ve Programlamaya Giriş
 * Konu: Derece - Radyan - Grad Dönüştürücü
 * Öğrenci: Adem Kaleli (2615501083)
 * Açıklama: Klavyeden derece cinsinden girilen bir açıyı 
 *           Radyan ve Grad (Gradyan) birimlerine çevirir.
 * =========================================================
 */

public class DereceDonusturucu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DERECE - RADYAN - GRAD DONUSTURUCU (JAVA) ===\n");

        try {
            // 1. GİRDİ (INPUT)
            System.out.print("Aci degerini derece cinsinden giriniz: ");
            double derece = scanner.nextDouble();

            // 2. İŞLEM (PROCESS)
            double radyan = derece * (Math.PI / 180.0);
            double grad = derece * (200.0 / 180.0);

            // 3. ÇIKTI (OUTPUT)
            System.out.println("\n-----------------------------------");
            System.out.printf("Girilen Derece  : %.2f deg\n", derece);
            System.out.printf("Radyan Karsiligi: %.4f rad\n", radyan);
            System.out.printf("Grad Karsiligi  : %.2f grad\n", grad);
            System.out.println("-----------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("\n[HATA] Lutfen gecerli sayisal bir deger giriniz!");
        } finally {
            scanner.close();
        }
    }
}