package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if(skus != null) {

            int noOfA = 0;
            int noOfB = 0;
            int noOfC = 0;
            int noOfD = 0;
            int noOfE = 0;
            int noOfF = 0;
            int noOfH = 0;
            int noOfK = 0;
            int noOfP = 0;
            int noOfQ = 0;
            int noOfV = 0;


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
                else if (skus.charAt(i) == 'F')
                    noOfF++;
                else if (skus.charAt(i) == 'H')
                    noOfH++;
                else if (skus.charAt(i) == 'K')
                    noOfK++;
                else if (skus.charAt(i) == 'P')
                    noOfP++;
                else if (skus.charAt(i) == 'Q')
                    noOfQ++;
                else if (skus.charAt(i) == 'V')
                    noOfV++;
            }
            // TO BE COMPLETED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            if(noOfA + noOfB + noOfC + noOfD + noOfE + noOfF != skus.length())
                return -1;

            // Calculate price of A
            int priceOfA = getPriceOfPromotionalProduct(noOfA, 5, 200);
            priceOfA = priceOfA + calculatePriceAUnderFiveProducts(noOfA);

            // Calculate number of B
            if(noOfB >= noOfE / 2)
                noOfB = noOfB - noOfE / 2;

            // Calculate price of H
            int priceOfH = getPriceOfPromotionalProduct(noOfH, 10, 80);
            priceOfH = priceOfH + calculatePriceHUnderTenProducts(noOfH);

            // Calculate price of V
            int priceOfV = getPriceOfPromotionalProduct(noOfV, 3, 130);
            priceOfV = priceOfV + calculatePriceHUnderThreeProducts(noOfV);




        return priceOfA
                + calculatePricePromotionMultipleProduct(noOfB, 30, 45, 2)
                + 20 * noOfC
                + 15 * noOfD
                + 40 * noOfE
                + calculatePriceF(noOfF)
                + calculatePricePromotionMultipleProduct(noOfK, 80, 150, 2)
                + calculatePricePromotionMultipleProduct(noOfP, 50, 200, 5)
                + calculatePricePromotionMultipleProduct(noOfQ, 30, 80, 3);

        }
    return -1;
    }

    private int calculatePriceHUnderThreeProducts(int remainingNoOfV) {
        return 90 * (remainingNoOfV / 2) + 50 * (remainingNoOfV % 2);
    }

    private int getPriceOfPromotionalProduct(int noOfProduct, int bestMultipleNumber, int bestPromoPrice) {
        int priceOfProduct = 0;
        while (noOfProduct >= bestMultipleNumber) {
            priceOfProduct = priceOfProduct + bestPromoPrice;
            noOfProduct = noOfProduct - bestMultipleNumber;
        }
        return priceOfProduct;
    }

    private int calculatePriceAUnderFiveProducts(int remainingNoOfA){
        return 130 * (remainingNoOfA / 3) + 50 * (remainingNoOfA % 3);
    }


    private int calculatePriceB(int noOfB) {
        return 45 * (noOfB / 2) + 30 * (noOfB % 2);
    }

    private int calculatePricePromotionMultipleProduct(int noOfProduct, int productPrice, int multiplePromoProductPrice, int multipleNumber) {
        return multiplePromoProductPrice * (noOfProduct / multipleNumber) + productPrice * (noOfProduct % multipleNumber);
    }

    private int calculatePriceF(int noOfF){
        if(noOfF >= 3){
            noOfF = noOfF - noOfF / 3;
        }
        return 10 * noOfF;
    }

    private int calculatePriceHUnderTenProducts(int remainingNoOfH){
        return 45 * (remainingNoOfH / 5) + 10 * (remainingNoOfH % 5);
    }


}

