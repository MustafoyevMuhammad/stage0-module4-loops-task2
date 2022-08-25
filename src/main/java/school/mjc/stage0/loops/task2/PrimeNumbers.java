package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 3;
        if(printToInclusive >= 2)
            System.out.println(2);
        while (i < printToInclusive){
            if(checkToPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean checkToPrime(int i) {
        int j = 2;
        while (j < i){
            if(i % j == 0){
                return false;
            }
            j++;
        }
        return true;
    }
}
