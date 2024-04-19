import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월(1~12)를 입력하세요");
        int mot = scanner.nextInt();

        if(mot <= 0)
        {
            System.out.println("잘못된 입력입니다.");
        }else if(mot <= 2)
        {  
            System.out.println("겨울입니다");
        }else if(mot <= 5)
        {
            System.out.println("봄입니다");
        }else if(mot <= 8)
        {
            System.out.println("여름입니다");
        }else if(mot <= 11)
        {
            System.out.println("가을입니다");
        }else if(mot == 12)
        {
            System.out.println("겨울입니다");
        }else if(mot > 12)
        {
            System.out.println("잘못된 입력입니다.");
        }
        scanner.close();
    }
}
