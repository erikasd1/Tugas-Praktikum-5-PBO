package diskon;
import java.util.Scanner;

public class diskonBarang { 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Total Pembelian Anda Rp = ");
        double totalBeli= input.nextDouble();
        
        double diskon;
        double totalBayar;
        
        if(totalBeli < 50000){
            diskon = 0.05 * totalBeli;
        }else{
            diskon = 0.2 * totalBeli;
        }
        
        totalBayar = totalBeli - diskon;
        
        System.out.println("Besarnya potongan Rp. " +diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp." +totalBayar);
    }
}     
        
