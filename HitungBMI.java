import java.util.Scanner;

public class HitungBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan berat dalam pounds: ");
        double beratPounds = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi dalam inchi: ");
        double tinggiInchi = scanner.nextDouble();
        
        double tinggiMeter = tinggiInchi /  39.37;
        double beratKg = beratPounds /  2.20462;
        
        double bmi = beratKg / (tinggiMeter * tinggiMeter);
        
        System.out.println("Tinggi dalam meter : " + tinggiMeter);
        System.out.println("Berat dalam kg : " + beratKg);
        System.out.println("BMI : " + bmi);
        
        if (bmi <  18.5) {
            System.out.println("Kategori : Underweight");
        } else if (bmi >=  18.5 && bmi <  25) {
            System.out.println("Kategori : Normal");
        } else if (bmi >=  25 && bmi <  30) {
            System.out.println("Kategori : Overweight");
        } else {
            System.out.println("Kategori : Obesity");
        }
    }
}