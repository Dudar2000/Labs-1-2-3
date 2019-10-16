public class Main {

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();

        Students s3 = new Students();
        Students s4 = new Students();
        Students s5 = new Students();

        s1.name = "John";
        s1.age = 22;
        s1.mark = 8.6f;


        s2.name = "Jerry";
        s2.age = 20;
        s2.mark = 7.1f;

        s3.name = "Ryder";
        s3.age = 25;
        s3.mark = 9.1f;


        s4.name = "Melvin";
        s4.age = 19;
        s4.mark = 7.4f;

        s5.name = "Carl";
        s5.age = 29;
        s5.mark = 7.4f;


        Students[] utmstdts = {s1 , s2};

        Students[] usmstdts = {s3,s4,s5};

        University u1 = new University();
        University u2 = new University();


        u1.name = "UTM";
        u1.fondYear = 1977;
        u1.students = utmstdts;


        for(int i = 0 ; i< u1.students.length; i++){
            System.out.println(u1.students[i].name);
        }

        System.out.println("");


        u2.name = "USM";
        u2.fondYear = 1956;
        u2.students = usmstdts;

        for(int i = 0; i < u2.students.length; i++){
            System.out.println(u2.students[i].name);
        }


    }
}

