package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power>= 0){
            System.out.println(1);
        }
        if (power<0){
            System.out.println("too much power");
        }else{
            int count = 1, product = 1;
            while (count<=power){
                product = product * 2;
                count++;
                System.out.println(product);
            }
        }
    }
}