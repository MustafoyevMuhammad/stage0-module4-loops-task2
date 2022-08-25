package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0) {
            System.out.println("too much power");
            return;
        }
        int i = 1, a = 1;
        System.out.println(1);
        while (i <= power){
            System.out.println(a *= 2);
            i++;
        }
    }
}
