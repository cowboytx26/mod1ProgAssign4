/*
Short Description:  This class will create a Regular Polygon.  There are three constructors that allow a default
                    polygon to be created, or one specifying specific number of sides with a specific length, or
                    a polygon with specific number of sides and lengths, but also with a specific coordinate.
Author:  Brian Wiatrek
Date:  August 22, 2024
*/
import static java.lang.Math.*;

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n*side;
    }

    public double getArea() {
        return (n*pow(side,2))/(4*tan(PI/n));
    }
}
