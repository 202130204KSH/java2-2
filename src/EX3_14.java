import java.util.Scanner;
public class EX3_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int end;
        int sor;
        
        System.out.println("나뉨수를 입력하세요");
        end = scanner.nextInt();
        System.out.println("나눔수를 입력하세요");
        sor = scanner.nextInt();
        try{
            System.out.println(end+"를"+sor+"로 나누면 몫은"+end/sor+"입니다");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        }
        finally{
            scanner.close();
        }

    }
}