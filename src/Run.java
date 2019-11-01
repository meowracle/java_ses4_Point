import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao toa do cua point2D");
        System.out.println("x = ");
        float x1 = scanner.nextFloat();
        System.out.println("y = ");
        float y1 = scanner.nextFloat();
        Point2D point1 = new Point2D(x1, y1);
        System.out.println(point1.toString());
        System.out.println("----------------------------------------");
        System.out.println("moi nhap vao toa do cua point3D");
        System.out.println("x = ");
        float x2 = scanner.nextFloat();
        System.out.println("y = ");
        float y2 = scanner.nextFloat();
        System.out.println("z = ");
        float z2 = scanner.nextFloat();
        Point2D point2 = new Point3D(x2, y2, z2);
        System.out.println(point2.toString());
        System.out.println("----------------------------------------");
        System.out.println("moi nhap vao toa do cua point2D di chuyen");
        System.out.println("x = ");
        float x3 = scanner.nextFloat();
        System.out.println("y = ");
        float y3 = scanner.nextFloat();
        System.out.println("nhap vao toc do di chuyen");
        System.out.println("x speed = ");
        float xSpeed = scanner.nextFloat();
        System.out.println("y speed = ");
        float ySpeed = scanner.nextFloat();
        Point2D point3 = new MoveablePoint(x3, y3, xSpeed, ySpeed);
        System.out.println(point3.toString());

    }
}
