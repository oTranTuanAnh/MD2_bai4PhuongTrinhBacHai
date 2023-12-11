import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();
        System.out.print("Nhap he so c: ");
        c = sc.nextDouble();

        QuadraticEquation pt = new QuadraticEquation(a, b, c);

        double delta = b*b - 4*a*c;
        if (delta>0){
            System.out.println("Phuong trinh co hai nghiem la: ");
            System.out.println("r1 = " + pt.getRoot1());
            System.out.println("r2 = " + pt.getRoot2());
        } else if (delta ==0){
            System.out.println("Phuong trinh co nghiem la: " + pt.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
