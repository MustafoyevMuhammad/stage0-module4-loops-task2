package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int a=multiplyByAndToInclusive,begin=0,end=0;
        if (a>=0){
            end=a;
        }else {
            begin=a;

        }

        for (int i = begin; i <= end; ) {
            System.out.println(a * i);
            i=(begin==0)?i+1:i-1;
        }
    }
}
