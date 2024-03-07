

package prg_test;

public class Clazz {


    private String nazev;


    public Clazz(String nazev) {
        this.nazev = nazev;
    }


    public String getNazev() {
        return nazev;
    }


    public void setNazev(String nazev) {
        this.nazev = nazev;
    }


    public void vypisNazev() {
        System.out.println("Název: " + nazev);
    }


    public static void main(String[] args) {

        Clazz instance = new Clazz("MůjObjekt");


        instance.vypisNazev();
    }
}


