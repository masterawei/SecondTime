package Greedy;

/**
 * @author away
 * @date 2021-12-08 10:11
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startStation = -1;
        int totalGas = 0;
        int curGas = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas+=gas[i]-cost[i];
            curGas+=gas[i]-cost[i];
            if (curGas < 0) {
                //0->i站剩余油量都是不为负的，每减少一站，就少了一些剩余油量。所以如果从i前面的站点作为起始站，剩余油量不可能冲过i+1站。
                //综上所述,把新的初始站点设置为i+1
                startStation = i+1;
                curGas =0;
            }


        }
        return totalGas>=0?startStation:-1;
    }

}
