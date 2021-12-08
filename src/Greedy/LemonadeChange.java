package Greedy;

/**
 * @author away
 * @date 2021-12-08 11:05
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int countFive = 0;
        int countTen = 0;
        for (int bill : bills) {
            if (countFive < 0) {
                return false;
            }
            if (bill == 5) {
                countFive++;
            } else if (bill == 10) {
                countFive--;

                countTen++;
            }else {
                if (countTen > 0) {
                    if (countFive > 0) {
                        countFive--;
                        countTen--;
                    }else {
                        return false;
                    }
                }else {
                    if (countFive >= 3) {
                        countFive-=3;
                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
