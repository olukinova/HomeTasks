package hometask13;

public class Students {
    String name;
    int mathGrade;
    int chemistryGrade;
    int biologyGrade;

    Students(String sName, int mathGr, int chemGr, int bioGr) {
        name = sName;
        mathGrade = mathGr;
        chemistryGrade = chemGr;
        biologyGrade = bioGr;
    }

    int averageGrade() {
        int average = (mathGrade+chemistryGrade+biologyGrade) / 3;
        return average;
    }


    public static void main(String[] args) {
        Students s1 = new Students("Mark", 4, 8, 11);
        Students s2 = new Students("Zafar", 8, 4, 5);
        Students s3 = new Students("Olena", 13, 46, 22);
        Students s4 = new Students("Zahra", 46, 4, 6);
        Students s5 = new Students("Marina", 41, 6, 6);

        System.out.println(s1.averageGrade());
        System.out.println(s2.averageGrade());
        System.out.println(s3.averageGrade());
        System.out.println(s4.averageGrade());
        System.out.println(s5.averageGrade());
    }
}


