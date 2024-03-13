class Student {
    constructor(jmeno, prijmeni, vek, nazevTridy) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.nazevTridy = nazevTridy;
    }
}


const student = new Student("Jan", "Novák", 20, "4A");

console.log(student.jmeno);
console.log(student.prijmeni);
console.log(student.vek);
console.log(student.nazevTridy);
