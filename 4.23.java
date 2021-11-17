import java.lang.Thread;
import java.util.Scanner;

public class Prime extends Thread {
    private int N;

    public Prime(int N) {
        this.N = N;
    }

    public void SmallerPrimeNumbers() {
        for (int i = 2; i <= N; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number upto which prime numbers have to be displayed: \n");
        int num = in.nextInt();
        in.close();
        Prime p = new Prime(num);
        p.start();
        Thread.yield();
        p.SmallerPrimeNumbers();
    }
}
