import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Divide {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        System.out.println("Enter divider: ");
        String sb = reader.readLine();
        int b = Integer.parseInt(sb);
        //int b = 8;
        for (int i = a; i <= (a+b); i++)
        {
            if (i % b == 0)
            {
                for(int j = 0; j < 20; j++)
                {
                    System.out.println(i);
                    i = i + b;
                }
            }
        }
    }
}
