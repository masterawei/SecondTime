package Greedy;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-08 10:40
 */
public class Candy {

    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        left[0] = 1;
        int[] right = new int[ratings.length];
        right[ratings.length-1] =1;
        for (int i = 1; i < left.length; i++) {
            if (ratings[i]>ratings[i-1]){
                left[i] = left[i-1]+1;
            }else {
                left[i] = 1;
            }
        }

        for (int i = right.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i]=right[i+1]+1;
            } else {
                right[i] = 1;
            }
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(left[i], right[i]);
        }
        return sum;
    }

    @Test
    public void test() {
        int[] ratings = {1, 0, 2};
        System.out.println(candy(ratings));
    }
}
