import java.util.Scanner;

class Rectangle{
    int w;
    int h;
    public int getArea(){
        return w*h;
    }
}

public class Ex4_2{
    public static void main(String[]args){
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        rect.w = scanner.nextInt();
        rect.h = scanner.nextInt();
        System.out.println("사각형의 면적은"+ rect.getArea());
        scanner.close();
    }
}