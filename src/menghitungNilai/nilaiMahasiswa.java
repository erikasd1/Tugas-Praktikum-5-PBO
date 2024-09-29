package menghitungNilai;

public class nilaiMahasiswa {
    String npm;
    String namaMhs;
    double nilaiKehadiran;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    
    public nilaiMahasiswa(String npm, String namaMhs, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.npm = npm;
        this.namaMhs = namaMhs;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public double hitungNilaiAkhir(){
    return (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
    }
    
    public String getGrade(){
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100){
            return "A";
        }else if(nilaiAkhir >= 66 && nilaiAkhir <= 75){
            return "B";
        }else if(nilaiAkhir >= 56 && nilaiAkhir <= 65){
            return "C";
        }else if(nilaiAkhir >= 46 && nilaiAkhir <= 55){
            return "D";
        }else{
            return "E";
        }
    }
    
    public String getKeterangan(){
        String grade = getGrade();
        switch(grade){
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            default:
                return "KURANG SEKALI";
        }
    }
    
    public String getNPM(){
        return npm;
    }
    public String getNamaMhs(){
        return namaMhs;
    }
}
