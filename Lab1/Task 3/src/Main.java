public class Main {

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();

        Students s3 = new Students();
        Students s4 = new Students();
        Students s5 = new Students();

        Students s6 = new Students();
        Students s7 = new Students();
        Students s8 = new Students();
        Students s9 = new Students();

        s1.name = "John";
        s1.age = 22;
        s1.mark = 5.6f;


        s2.name = "Jerry";
        s2.age = 20;
        s2.mark = 7.1f;

        s3.name = "Ryder";
        s3.age = 25;
        s3.mark = 1.1f;


        s4.name = "Melvin";
        s4.age = 19;
        s4.mark = 7.4f;

        s5.name = "Carl";
        s5.age = 29;
        s5.mark = 2.4f;

        s6.name = "John";
        s6.age = 24;
        s6.mark = 6.6f;

        s7.name = "Rodney";
        s7.age = 26;
        s7.mark = 5.5f;

        s8.name = "Kendrick";
        s8.age = 23;
        s8.mark = 1.0f;

        s9.name = "Hugo";
        s9.age = 20;
        s9.mark = 7.77f;


        Students[] utmstdts = {s1 , s2};

        Students[] usmstdts = {s3,s4,s5};

        Students[] ulimstdts = {s6 ,s7,s8, s9};

        University u1 = new University();
        University u2 = new University();
        University u3 = new University();


        u1.name = "UTM";
        u1.fondYear = 1977;
        u1.students = utmstdts;

        float mark_u1 = 0;

        int i;

        for(i = 0 ; i< u1.students.length; i++){
            mark_u1 += u1.students[i].mark;
        }

        mark_u1 = mark_u1 / i;
        System.out.format("\nUTM middle mark is " + "%.2f%n",mark_u1);

        u2.name = "USM";
        u2.fondYear = 1956;
        u2.students = usmstdts;



        float mark_u2 = 0;

        for( i = 0; i < u2.students.length; i++){

            mark_u2 += u2.students[i].mark;
        }

        mark_u2 = mark_u2 / i;
        System.out.format("USM middle mark is "+ "%.2f%n",mark_u2);

        u3.name = "ULIM";
        u3.fondYear = 1991;
        u3.students = ulimstdts;

        float mark_u3 = 0;

        for( i = 0; i < u3.students.length; i++){

            mark_u3 += u3.students[i].mark;
        }

        mark_u3 = mark_u3 / i;
        System.out.format("USM middle mark is " + "%.2f%n",mark_u3);

    }
}

