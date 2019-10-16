public class Main {

    public static void main(String[] args) {

        Monitor m1 = new Monitor();
        m1.color = "cyan";
        m1.diagonal = 22;
        m1.resolution = "1080p";

        System.out.println("\nFirst display preferences: " + m1.color + " " + m1.diagonal + " inches " + m1.resolution);

        Monitor m2 = new Monitor();
        m2.color = new String("cyan");
        m2.diagonal = 25;
        m2.resolution = "1080p";
        System.out.println("\nSecond display preferences: " + m2.color + " " + m2.diagonal + " inches "+ m2.resolution + "\n");

        if(m1.color.equals(m2.color)){
            System.out.println("Colors are same");
        } else System.out.println("Colors are different");


        if(m1.diagonal == m2.diagonal){
            System.out.println("Diagonals are same");
        } else System.out.println("Diagonals are different");

        if(m1.resolution == m2.resolution){
            System.out.println("Resolutions are same");
        } else System.out.println("Resolutions are different");

        if(m1.color == m2.color && m1.resolution == m2.resolution && m1.diagonal == m2.diagonal){
            System.out.println("\nDisplays are same");
        } else System.out.println("\nDisplays are different");
    }

    }




