package IMT;
import java.util.Scanner;

public class indeksMasaTubuh {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat bada (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
        
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        System.out.println("Indeks Masa Tubuh (IMT) Anda: " +imt);
        
        if(imt < 18.5){
            System.out.println("Kriteria: Berat Badan Kurang");
        }else if(imt >= 18.5  && imt <= 24.9){
            System.out.println("Kriteria: Berat Badan Ideal");
        }else if(imt >= 25 && imt <= 29.9){
            System.out.println("Kriteria: Berat Badan Lebih");
        }else if(imt >= 30 && imt <= 39.9){
            System.out.println("Kriteria: Gemuk");
        }else if(imt >= 40){
            System.out.println("Kriteria: Sangat Gemuk");
        }
    }
}
