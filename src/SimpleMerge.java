/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] n = new int[arr1.length + arr2.length];
        int x = 0;
        int y = 0;
        for (int num = 0; num < ((arr1.length + arr2.length) - 1); num++) {
            if (x < arr1.length + 1 || y < arr2.length + 1) {
                if (arr1[x] > arr2[y]) {
                    n[num] = arr2[y];
                    y++;
                } else {
                    n[num] = arr1[x];
                    x++;
                }
            }
        }
        return n;
    }
}


