package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
      for (int i = 2; i <= printToInclusive; i++) {
            boolean isPrime=false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    isPrime=true;
                    break;
                }
            }
            if (!isPrime){
                System.out.println(i);
            }
        }
    }
   
}
