package Greedy;

/**
 * @author away
 * @date 2021-12-10 10:34
 */
public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int n) {
       char[] arr = (n+"").toCharArray();
       int max = -1;
       int idx = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (max < arr[i]) {
                max=arr[i];
                idx=i;
            }
            if (arr[i] > arr[i + 1]) {
                arr[idx]--;
                for (int j = idx + 1; j < arr.length; j++) {
                    arr[j] = '9';
                }
                break;
            }
        }

        return Integer.parseInt(new String(arr));

    }
}
