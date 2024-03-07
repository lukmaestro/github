package prg_test;

public class Student {


    private String jmeno;
    private String prijmeni;
    private int vek;
    private String nazevTridy;

    public Student(String jmeno, String prijmeni, int vek, String nazevTridy) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.nazevTridy = nazevTridy;
    }
    public String dostanJmeno() {
        return jmeno;
    }
    public void nastavJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String dostanPrijmeni() {
        return prijmeni;
    }
    public void nastavPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    public int dostanVek() {
        return vek;
    }
    public void nastavVek(int vek) {
        this.vek = vek;
    }
    public String dostanNazevTridy() {
        return nazevTridy;
    }
    public void nastavNazevTridy(String nazevTridy) {
        this.nazevTridy = nazevTridy;
    }
    public void vypisInformace() {
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Věk: " + vek);
        System.out.println("Název třídy: " + nazevTridy);
    }

    public static void main(String[] args) {
        Student student = new Student("Pepa", "Rajnis", 20, "1A");

        student.vypisInformace();
    }
}
