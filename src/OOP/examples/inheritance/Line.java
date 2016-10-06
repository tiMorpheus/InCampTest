package OOP.examples.inheritance;

public class Line extends Geometry{

    //aggregation
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        super();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    public Line(int x1, int y1, int x2, int y2){

        this.startPoint = new Point(x1,y1);
        this.endPoint = new Point(x2,y2);

    }


    public Point getStartPoint() {
        return startPoint;
    }


    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }


    public Point getEndPoint() {
        return endPoint;
    }


    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }


    public String toString() {
        return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
    }

}
