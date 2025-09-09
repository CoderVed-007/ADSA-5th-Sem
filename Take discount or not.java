import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int old_price = 0;
            int new_price = 0;
            for(int i = 0; i < n; i++){
                old_price = old_price + a[i];
            }
            for(int i = 0; i < n; i++){
                new_price = new_price + Math.max(0, a[i] - y);
            }
            if(x + new_price < old_price){
                System.out.println("COUPON");
            }else{
                System.out.println("NO COUPON");
            }
        }
    }
}
