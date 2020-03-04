package pl.sda.dystans;

public class Main {

    public static void main(String[] args) {

        double odleglosc;

        Point point1 = new Point(3,4);
        Point point2 = new Point(5,6);


    //    System.out.println("Odegłość od punktu1 do punktu2, to: " + point1.distance(point2));

        odleglosc = point1.distance(point2);

        System.out.println(odleglosc);

    }







}
