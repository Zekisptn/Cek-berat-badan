public class TestBMI {
    public static void main(String[] args) {
        BMI person1 = new BMI("Zacky",  30,  70,  1.75);
        BMI person2 = new BMI(80,  1.8); 

        person1.display();
        person2.display();
    }
}