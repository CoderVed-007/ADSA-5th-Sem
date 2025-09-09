import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++){
		    int N = sc.nextInt();
		    int [] M = new int[N];
		
		    for(int j = 0; j < N; j++){
		        M[j] = sc.nextInt();
		    }
		    int max = 0;
		    for(int k = 0; k < N; k++){
		        if(M[k] > max){
		            max = M[k];
		        }
		    }
		    System.out.println(max);
		}
	}
}
