package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
       int i = 2;
        while (i <= printToInclusive){
            boolean prime = true;
            int j = 2;
            while(j < i){
                if(i % j == 0 && i != 2){
                    prime = false;
                    break;
                }
                j++;
            }
            if(prime) System.out.println(i);
            i++;
        }
    }
   
}
