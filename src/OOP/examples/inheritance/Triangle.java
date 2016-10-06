package OOP.examples.inheritance;

public class Triangle extends Geometry {

    private Point A,B,C;

    private Line sideAB, sideBC, sideCA;

    public Triangle(Point A, Point B, Point C){
        super();

        this.A = A;
        this.B = B;
        this.C = C;

    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }


    public Line getSideAB() {
        if(this.sideAB == null) this.sideAB = new Line(A,B);
        return sideAB;
    }

    public void setSideAB(Line sideAB) {
        this.sideAB = sideAB;
    }

    public Line getSideBC() {
        if(this.sideBC == null) this.sideBC = new Line(B,C);
        return sideBC;
    }

    public void setSideBC(Line sideBC) {
        this.sideBC = sideBC;
    }

    public Line getSideCA() {
        if(this.sideCA == null) this.sideCA = new Line(C,A);
        return sideCA;
    }

    public void setSideCA(Line sideCA) {
        this.sideCA = sideCA;
    }

    public String toString() {
        return "Triangle [A=" + A + ", B=" + B + ", C=" + C + "]";
    }
}
