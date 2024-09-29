package menghitungNilai;
import java.util.Scanner;

public class nilaiMahasiswaMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String namaMhs = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        
        nilaiMahasiswa mahasiswa = new nilaiMahasiswa(npm, namaMhs, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        
        System.out.print("\nNPM Mahasiswa: " +mahasiswa.getNPM());
        System.out.print("\nNama Mahasiswa: " +mahasiswa.getNamaMhs());
        System.out.print("\nNilai Akhir Mahasiswa: " +mahasiswa.hitungNilaiAkhir());
        System.out.print("\nGrade: " +mahasiswa.getGrade());
        System.out.print("\nKeterangan: " +mahasiswa.getKeterangan());
        
    }
}
