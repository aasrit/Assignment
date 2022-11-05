abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    private final int length;
    int Length, breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}
    class Line extends Shape {
        int length;
        Line(int length) {
            this.length=length; }
            public void draw() {
                System.out.println("The line is drawn");
        }
    }
    class Cube extends Shape {
        int s;

        void cube(int s) {
            this.s = s;
        }

        public Cube(int i) {
            super();
        }

        public void draw() {
            System.out.println("The cube is drawn");
        }
    }
    class Shapes
    {
        public static void main(String[] args) {
            Rectangle r=new Rectangle(5,3);
            r.draw();
            Cube c=new Cube(5);
            c.draw();
            Line l=new Line(5);
            l.draw();


        }


    }
