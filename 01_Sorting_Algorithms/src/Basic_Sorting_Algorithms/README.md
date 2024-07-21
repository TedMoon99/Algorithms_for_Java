# Basic Sorting Algorithms(insertion, selection, bubble)

---
insertion sorting, selection sorting, bubble sorting은 모두 (n-1)번의 round를 거쳐 매 round마다 하나의 값을 정렬하는 방식이다. n-1 번의 라운드 후에는 나머지 하나의 수는 자동적으로 정렬된다

## Insertion Sorting

- 왼쪽부터 점진적으로 정렬하는 방식( 오른쪽부터 정렬도 가능 )

```java
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
```

1. i 번째 round에 A[i]가 A[0], ..., A[i-1]보다 작다면 `O(i)`번의 비교와 이동(교환)이 발생한다. 결국 A의 값이 내림차순으로 주어진다면 `O(1+2+ ... +i) = O(n^2)가 된다`