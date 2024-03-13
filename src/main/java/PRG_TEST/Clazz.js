class Clazz {
    constructor(nazev) {
        this.nazev = nazev;
        this.studenti = [];
    }

    pridejStudenta(student) {
        student.nazevTridy = this.nazev;
        this.studenti.push(student);
    }
}

class Student {
    constructor(jmeno, prijmeni, vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.nazevTridy = null;
    }
        toString() {
            return `${this.jmeno}, ${this.prijmeni}, ${this.nazevTridy}`;
        }

}


const classA = new Clazz("ClassA");
const classB = new Clazz("ClassB");


for (let i = 0; i < 5; i++) {
    const student = new Student(`Jmeno${i}`, `Prijmeni${i}`, 17);
    classA.pridejStudenta(student);
}


for (let i = 5; i < 10; i++) {
    const student = new Student(`Jmeno${i}`, `Prijmeni${i}`, 18);
    classB.pridejStudenta(student);
}

console.log("Studenti třídy 4A:");
classA.studenti.forEach(student => console.log(student.toString()));

console.log("\nStudenti třídy 4B:");
classB.studenti.forEach(student => console.log(student.toString()));


