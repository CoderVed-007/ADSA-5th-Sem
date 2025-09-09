import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int M = a[0];
            for(int i = 0; i < n; i++){
                if(M > a[i]){
                    M = a[i];
                }
            }
            int num_of_operations = 0;
            for(int i = 0; i < n; i++){
                if(a[i] > M){
                    a[i] = M;
                    num_of_operations++;
                }
            }
            System.out.println(num_of_operations);
        }
    }
}
