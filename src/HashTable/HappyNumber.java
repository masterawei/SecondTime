package HashTable;

import org.junit.Test;

/**
 * @author away
 * @date 2021-11-22 9:12
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        int slow=0;
        int fast = 0;
        do {
            slow = digitSum(slow);
            fast = digitSum(digitSum(fast));
        } while (slow != fast);

        return slow==1;
    }

    public int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            int reminder = x%10;
            sum+=reminder*reminder;
            x/=10;
        }
        return sum;
    }


    @Test
    public void test() {
        System.out.println(digitSum(100));
    }
}
