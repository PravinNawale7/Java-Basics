import java.util.Scanner;

public class AreaRectSquare {
    int side;
    float length, breadth;

    public AreaRectSquare() {
        side = 0;
        length = 0.0f;
        breadth = 0.0f;
    }
    void set(int s) {
        side = s;
    }
    void setRect(float l, float b) {
        length = l;
        breadth = b;
    }
    void getSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Square:");
        side = sc.nextInt();
    }
    void getRect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }
    void areaSquare() {
        int area = side * side;
        System.out.println("Area of Square is: " + area);
    }
    void areaRect() {
        float area = length * breadth;
        System.out.println("Area of Rectangle is: " + area);
    }
    public static void main(String[] args) {
        AreaRectSquare  s = new AreaRectSquare();
        s.getRect();
        s.areaRect();
        s.getSquare();
        s.areaSquare();
    }
}
