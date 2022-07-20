import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much line you would like to print for triangle?");
        int base = sc.nextInt();
        for (int i = 0; i <= base; i++) {
            for (int j = base; j > (base - i); j--) {
                System.out.print(" ");
            }
        for (int k = 0; k <= (2 * (base-i-1)); k++) {
            System.out.print("*");
        }
        System.out.println(" ");
        }
    }
}
