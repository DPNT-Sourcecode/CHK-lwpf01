package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int noOfA = 0;
        int noOfB = 0;
        int noOfC = 0;
        int noOfD = 0;
        int noOfE = 0;
        if(skus != null && noOfA + noOfB + noOfC + noOfD + noOfE != skus.length()) {



            for (int i = 0; i < skus.length(); i++) {

                if (skus.charAt(i) == 'A')
                    noOfA++;
                else if (skus.charAt(i) == 'B')
                    noOfB++;
                else if (skus.charAt(i) == 'C')
                    noOfC++;
                else if (skus.charAt(i) == 'D')
                    noOfD++;
                else if (skus.charAt(i) == 'E')
                    noOfE++;
            }

            int priceOfA = 0;
            while(noOfA >= 5){
                priceOfA = priceOfA + 200;
                noOfA = noOfA - 5;
            }
            priceOfA = priceOfA + calculatePriceAUnderFiveProducts(noOfA);

            if(noOfB > noOfE / 2)
                noOfB = noOfB - noOfE / 2;

            if()
                return -1;
        return calculatePriceA(noOfA) + calculatePriceB(noOfB) + 20 * noOfC + 15 * noOfD;
        }
    return -1;
    }

    private int calculatePriceAUnderFiveProducts(int remainingNoOfA){
        return 130 * (remainingNoOfA / 3) + 50 * (remainingNoOfA % 3);
    }


    private int calculatePriceB(int noOfB) {
        return 45 * (noOfB / 2) + 30 * (noOfB % 2);
    }


}


