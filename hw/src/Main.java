import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static public boolean foo(int a, int b, int c, int x, int y) {
        if(a <= y && b <= x ||
           a <= x && b <= y ||
           a <= y && c <= x ||
           a <= x && c <= y ||
           c <= x && b <= y ||
           c <= y && b <= x) {
           return true;
        }

        return false;
    }


    static public void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "Введіть перше ребро цегли");
        int a = Integer.parseInt(reader.readLine());
        System.out.println( "Введіть друге ребро цегли");
        int b = Integer.parseInt(reader.readLine());
        System.out.println( "Введіть третє ребро цегли");
        int c = Integer.parseInt(reader.readLine());
        System.out.println( "Введіть першу сторону прямокутної діри");
        int x = Integer.parseInt(reader.readLine());
        System.out.println( "Введіть другу сторону прямокутної діри");
        int y = Integer.parseInt(reader.readLine());
        boolean result = foo(a, b, c, x, y);

        if (result) {
            System.out.println("Цеглина пролізе в прямокутну діру");
        } else {
            System.out.println("Цеглина не пролізе в прямокутну діру");
        }



    }
}
