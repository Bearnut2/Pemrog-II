package praktikum5.soal1;

public class Sphere extends Shape { 
    private double radius;
    
    public Sphere(double r) { super("Sphere"); radius = r;

    }

    Sphere(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double area() {
    return 4*Math.PI*(radius*radius);
}

    public String toString() {
    return super.toString() + " of radius " + radius;
    }
}
