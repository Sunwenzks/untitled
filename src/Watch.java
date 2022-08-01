import java.util.Scanner;

public class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int x = sec % 60;
        int y = sec % 3600;
        y = y / 60;
        int z = sec % 86400;
        z = z / 3600;
        System.out.println(z / 10 + "" + z % 10 + ":" + y / 10 + "" + y % 10 + ":" + x / 10 + "" + x % 10);
    }
}
