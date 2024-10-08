/*
Short Description:  This program will create three polygons and calculate the area and perimeter for all three.
Author:  Brian Wiatrek
Date:  August 22, 2024
*/
public class TestPolygon {

    public static void main(String[] args) {

        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10,4,5.8, 7.8);
        System.out.printf("First Regular Polygon: Perimeter %f Area %f\n", poly1.getPerimeter(), poly1.getArea());
        System.out.printf("Second Regular Polygon: Perimeter %f Area %f\n", poly2.getPerimeter(), poly2.getArea());
        System.out.printf("Third Regular Polygon: Perimeter %f Area %f\n", poly3.getPerimeter(), poly3.getArea());
    }
}