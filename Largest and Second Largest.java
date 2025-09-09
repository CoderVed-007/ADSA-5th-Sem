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
            int max = 0;
            int second_max = -1;
            int max_sum = 0;
            for(int i = 0; i < n; i++){
                if(a[i] > max){
                    second_max = max;
                    max = a[i];
                } else if(a[i] > second_max && a[i] != max){
                    second_max = a[i];
                }
            }
            max_sum = max + second_max;
            System.out.println(max_sum);
        }
    }
}
