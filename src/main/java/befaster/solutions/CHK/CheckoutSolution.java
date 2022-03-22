package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int noOfA = 0;
        int noOfB = 0;
        int noOfC = 0;
        int noOfD = 0;

        for(int i = 0; i < skus.length(); i++){
            if(skus.charAt(i) == 'A')
                noOfA++;
            else if(skus.charAt(i) == 'B')
                noOfB++;
            else if(skus.charAt(i) == 'C')
                noOfC++;
            else if(skus.charAt(i) == 'D')
                noOfD++;
        }


    }

    private int calculatePriceA(int noOfA){
        int priceOfA = 0;

            priceOfA = 130 * (noOfA / 3) + 50 * (noOfA % 3);
        
    }
}



