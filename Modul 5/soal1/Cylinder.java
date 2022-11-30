package praktikum5.soal1;

public class Cylinder extends Shape { private double radius;
private double height;	

    /**
     *
     * @param r
     * @param h
     */
    public Cylinder(double r, double h) { super("Cylinder");
    radius = r; height = h;
    }

    Cylinder(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double area() {
    return Math.PI*radius*radius*height;
    }	

    public String toString() {
	

    public Cylinder(double r, double h) { super("Cylinder");
    radius = r; height = h;
    }

    public double area() {
    return Math.PI*radius*radius*height;
    }	

    public String toString() {
    return super.toString() + " of radius " + radius + " and height " + height;
    }
}

