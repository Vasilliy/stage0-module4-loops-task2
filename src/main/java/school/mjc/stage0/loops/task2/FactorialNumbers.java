package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive >= 0){
            System.out.println(1);
        }

        int num1 = 1, num = 1, factorial = 1;

        while (num1 <= printToInclusive) {

            while (num <= num1) {

                factorial = factorial * num;

                num++;
            }
            System.out.println(factorial);
            num1++;
        }
    }
}