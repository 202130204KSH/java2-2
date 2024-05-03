import java.util.*;

public class ArrayListEX {
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++)
        {
            System.out.println("이름을 입력하세요>>");
            String s = scanner.next();

        }

        for(int i=0; i<a.size(); i++)
        {
            String name = a.get(i);
            System.out.println(name+" ");
        }
        int L=0;
        for (int i=0;i<a.size();i++)
        {
            if(a.get(L).length() < a.get(i).length())
            {
                L=i;
            }
            System.out.println("\n 가장 긴 이름은"+a.get(L));
            scanner.close();
        }
    }
}
