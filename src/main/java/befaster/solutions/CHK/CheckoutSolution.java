package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if(skus != null) {

            int noOfA = 0;
            int noOfB = 0;
            int noOfC = 0;
            int noOfD = 0;


            for (int i = 0; i < skus.length(); i++) {
                if (skus.charAt(i) == 'A')
                    noOfA++;
                else if (skus.charAt(i) == 'B')
                    noOfB++;
                else if (skus.charAt(i) == 'C')
                    noOfC++;
                else if (skus.charAt(i) == 'D')
                    noOfD++;
            }
        return calculatePriceA(noOfA) + calculatePriceB(noOfB) + 20 * noOfC + 15 * noOfD;
        }
    return -1;
    }

    private int calculatePriceA(int noOfA){
        return 130 * (noOfA / 3) + 50 * (noOfA % 3);
    }

    private int calculatePriceB(int noOfB){
        return 45 * (noOfB / 2) + 30 * (noOfB % 2);
    }


}
