import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
       Scanner obj = new Scanner(System.in);
        int a =obj.nextInt();
        double area = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        area = Math.round(area * 100.0) / 100.0;



        System.out.println(area);
    }
}