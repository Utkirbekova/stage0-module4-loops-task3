package school.mjc.stage0.loops.task3;

public class DigitsSum {


    public void printDigitsSum(int t) {
        int sum = 0;
        while (true) {
            if (t == 0) {
                System.out.println(sum);
                return;
            }
            sum += t % 10;
            t = t / 10;
        }
    }
}
