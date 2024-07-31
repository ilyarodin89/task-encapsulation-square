public class MainApp {
    public static void main(String[] args) {
        Point point1 = new Point(1, 5);
        Square square1 = new Square(point1, 5);
        System.out.println(square1);

        square1.setPoint(new Point(2, 6));
        System.out.println(square1);

        square1.setSideLength(10);
        System.out.println(square1);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

class Square {
    private Point point;
    private int sideLength;

    public Square(Point point, int sideLength) {
        this.point = point;
        this.sideLength = sideLength;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть целым положительным цислом");
        } else {
            this.sideLength = sideLength;
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + sideLength;
    }
}