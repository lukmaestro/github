package prg_test;
import java.util.ArrayList;
import java.util.List;

public class Clazz {


    private String nazev;
    private List<Student> studenti;


    public Clazz(String nazev) {
        this.nazev = nazev;
        this.studenti = new ArrayList<>();
    }


    public String dostanNazev(String nazev){
        return nazev;
    }

    public void nastavNazev(String nazev) {
        this.nazev = nazev;
    }


    public void pridatStudenta(Student student) {
        studenti.add(student);
    }

    public List<Student> getStudenti() {
        return studenti;
    }


    public void vypisInformaceOTridě() {
        System.out.println("Název třídy: " + nazev);
        System.out.println("Seznam studentů:");
        for (Student student : studenti) {
            System.out.println("- " + student.dostanJmeno() + " " + student.dostanPrijmeni());
        }
    }

    public static void main(String[] args) {
        Clazz trida = new Clazz("1A");

        Student student1 = new Student("Jan", "Novák", 20, "1A");
        trida.pridatStudenta(student1);

        Student student2 = new Student("Eva", "Svobodová", 19, "1A");
        trida.pridatStudenta(student2);

        trida.vypisInformaceOTridě();
    }
}




