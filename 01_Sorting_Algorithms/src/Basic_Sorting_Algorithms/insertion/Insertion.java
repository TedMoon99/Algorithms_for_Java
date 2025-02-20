package Basic_Sorting_Algorithms.insertion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Insertion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        int[] A = new int[]{a, b, c};
        int n = A.length;
        // function call
        insertionSorting(A, n);

        // output
        System.out.println(Arrays.toString(A));
    }

    // insertion Sort
    private static void insertionSorting(int[] A, int n){ // A[0] ~ A[n-1]까지 insertion Sort
        for (int i = 1; i < n; i++){ // round i에 i번째 작은 수를 찾음
            int j = i-1;
            while (j >= 0 && A[j] > A[j+1]){ // 왼쪽에 있는 수가 오른쪽 수보다 크다면
                // Swap
                int temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                j--;
            }
        }
    }
}
