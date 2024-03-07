package prg_test;

public class main {


    public static void main(String[] args) {
        Clazz tridaA = new Clazz("1A");

        for (int i = 0; i < 10; i++) {
            Student student = new Student("Jane" + i, "Doe" + i, 14 + i, "1A");
            tridaA.pridatStudenta(student);
        }

        tridaA.vypisInformaceOTridě();

        System.out.println();

        Clazz tridaB = new Clazz("1B");

        for (int i = 0; i < 10; i++) {
            Student student = new Student("John" + (i + 10), "Doe" + (i + 10), 18 + i, "1B");
            tridaB.pridatStudenta(student);
        }

        tridaB.vypisInformaceOTridě();
    }
}