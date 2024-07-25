public class BMI {
    private String nama;
    private int umur;
    private double berat; // dalam kg
    private double tinggi; // dalam meter

    // Constructor  1
    public BMI(String nama, int umur, double berat, double tinggi) {
        this.nama = nama;
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    // Constructor  2
    public BMI(double berat, double tinggi) {
        this("Default Nama",  25, berat, tinggi);
    }

    // Asesor dan Mutator
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Menghitung BMI
    public double hitungBMI() {
        return berat / (tinggi * tinggi);
    }

    // Mengklasifikasikan status BMI
    public String cekStatus() {
        double bmi = hitungBMI();
        if (bmi <  18.5) {
            return "Underweight";
        } else if (bmi >=  18.5 && bmi <  25) {
            return "Normal";
        } else if (bmi >=  25 && bmi <  30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Menampilkan informasi
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi dalam meter: " + tinggi);
        System.out.println("Berat dalam kg: " + berat);
        System.out.println("BMI: " + hitungBMI());
        System.out.println("Status BMI: " + cekStatus());
    }
}