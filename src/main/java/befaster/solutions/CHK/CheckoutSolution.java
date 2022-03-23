package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if(skus != null) {

            int noOfA = 0;
            int noOfB = 0;
            int noOfC = 0;
            int noOfD = 0;
            int noOfE = 0;
            int noOfF = 0;
            int noOfG = 0;
            int noOfH = 0;
            int noOfI = 0;
            int noOfJ = 0;
            int noOfK = 0;
            int noOfL = 0;
            int noOfM = 0;
            int noOfN = 0;
            int noOfO = 0;
            int noOfP = 0;
            int noOfQ = 0;
            int noOfR = 0;
            int noOfS = 0;
            int noOfT = 0;
            int noOfU = 0;
            int noOfV = 0;
            int noOfW = 0;
            int noOfX = 0;
            int noOfY = 0;
            int noOfZ = 0;

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
                else if (skus.charAt(i) == 'G')
                    noOfG++;
                else if (skus.charAt(i) == 'H')
                    noOfH++;
                else if (skus.charAt(i) == 'I')
                    noOfI++;
                else if (skus.charAt(i) == 'J')
                    noOfJ++;
                else if (skus.charAt(i) == 'K')
                    noOfK++;
                else if (skus.charAt(i) == 'L')
                    noOfL++;
                else if (skus.charAt(i) == 'M')
                    noOfM++;
                else if (skus.charAt(i) == 'N')
                    noOfN++;
                else if (skus.charAt(i) == 'O')
                    noOfO++;
                else if (skus.charAt(i) == 'P')
                    noOfP++;
                else if (skus.charAt(i) == 'Q')
                    noOfQ++;
                else if (skus.charAt(i) == 'R')
                    noOfR++;
                else if (skus.charAt(i) == 'S')
                    noOfS++;
                else if (skus.charAt(i) == 'T')
                    noOfT++;
                else if (skus.charAt(i) == 'U')
                    noOfU++;
                else if (skus.charAt(i) == 'V')
                    noOfV++;
                else if (skus.charAt(i) == 'W')
                    noOfW++;
                else if (skus.charAt(i) == 'X')
                    noOfX++;
                else if (skus.charAt(i) == 'Y')
                    noOfY++;
                else if (skus.charAt(i) == 'Z')
                    noOfZ++;
            }

            if(noOfA + noOfB + noOfC + noOfD + noOfE + noOfF + noOfG + noOfH + noOfI + noOfJ +
                    noOfK + noOfL + noOfM + noOfN + noOfO + noOfP + noOfQ + noOfR + noOfS + noOfT + noOfU +
                    noOfV + noOfW + noOfX + noOfY + noOfZ != skus.length())
                return -1;


            // Calculate number of B
            noOfB = oneFree(noOfE, 2, noOfB);

            // Calculate number of F
            noOfF = oneFree(noOfF, 3, noOfF);

            // Calculate number of M
            noOfM = oneFree(noOfN, 3, noOfM);

            // Calculate number of Q
            noOfQ = oneFree(noOfR, 3, noOfQ);

            // Calculate number of U
            noOfU = oneFree(noOfU, 4, noOfU);

            // Calculate price of A
            int priceOfA = getPriceOfPromotionalProduct(noOfA, 5, 200);
            noOfA = noOfA - priceOfA / 40;
            priceOfA = priceOfA + calculatePriceAUnderFiveProducts(noOfA);

            // Calculate price of H
            int priceOfH = getPriceOfPromotionalProduct(noOfH, 10, 80);
            noOfH = noOfH - priceOfH / 8;
            priceOfH = priceOfH + calculatePriceHUnderTenProducts(noOfH);

            // Calculate price of V
            int priceOfV = getPriceOfPromotionalProduct(noOfV, 3, 130);
            noOfV = noOfV - priceOfV / 43;
            priceOfV = priceOfV + calculatePriceHUnderThreeProducts(noOfV);

            // buy any 3 of (Z,T,Y,S,X) for 45


            return priceOfA
                + calculatePricePromotionMultipleProduct(noOfB, 30, 45, 2)
                + 20 * (noOfC + noOfG + noOfW)
                + 15 * (noOfD + noOfM)
                + 40 * (noOfE + noOfN + noOfU)
                + 10 * (noOfF + noOfO)
                + priceOfH
                + 35 * noOfI
                + 60 * noOfJ
                + calculatePricePromotionMultipleProduct(noOfK, 70, 120, 2)
                + 90 * (noOfL)
                + calculatePricePromotionMultipleProduct(noOfP, 50, 200, 5)
                + calculatePricePromotionMultipleProduct(noOfQ, 30, 80, 3)
                + 50 * (noOfR)
                + priceOfV
                + groupPrice(noOfZ, noOfT, noOfY, noOfS, noOfX);

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

    private int calculatePricePromotionMultipleProduct(int noOfProduct, int productPrice, int multiplePromoProductPrice, int multipleNumber) {
        return multiplePromoProductPrice * (noOfProduct / multipleNumber) + productPrice * (noOfProduct % multipleNumber);
    }

    private int calculatePriceHUnderTenProducts(int remainingNoOfH){
        return 45 * (remainingNoOfH / 5) + 10 * (remainingNoOfH % 5);
    }

    private int oneFree(int noOfPromoProducts, int minimumNumberOfPromoProducts, int numberOfFreeDifferentProducts){
        if(numberOfFreeDifferentProducts >= noOfPromoProducts / minimumNumberOfPromoProducts)
            numberOfFreeDifferentProducts = numberOfFreeDifferentProducts - noOfPromoProducts / minimumNumberOfPromoProducts;
        return numberOfFreeDifferentProducts;

    }

    // buy any 3 of (Z,T,Y,S,X) for 45
    private int groupPrice(int noOfZ, int noOfT, int noOfY, int noOfS, int noOfX){
        List<String> orderedArrayOfProducts = new ArrayList<>();
        int totalPrice = 0;
        while(noOfZ != 0) {
            orderedArrayOfProducts.add("Z");
            noOfZ--;
        }
        while(noOfT != 0) {
            orderedArrayOfProducts.add("T");
            noOfT--;
        }
        while(noOfY != 0) {
            orderedArrayOfProducts.add("Y");
            noOfY--;
        }
        while(noOfS != 0) {
            orderedArrayOfProducts.add("S");
            noOfS--;
        }
        while(noOfX != 0) {
            orderedArrayOfProducts.add("X");
            noOfX--;
        }

        while(orderedArrayOfProducts.size() > 3)
        {
            totalPrice = totalPrice + 45;
            orderedArrayOfProducts = orderedArrayOfProducts.subList(3, orderedArrayOfProducts.size());
        }
        if(orderedArrayOfProducts.size() > 0) {
            if (orderedArrayOfProducts.get(0).equals("Z"))
                totalPrice = totalPrice + 21;
            else if (orderedArrayOfProducts.get(0).equals("T"))
                totalPrice = totalPrice + 20;
            else if (orderedArrayOfProducts.get(0).equals("Y"))
                totalPrice = totalPrice + 20;
            else if (orderedArrayOfProducts.get(0).equals("S"))
                totalPrice = totalPrice + 20;
            else if (orderedArrayOfProducts.get(0).equals("X"))
                totalPrice = totalPrice + 17;
        }

        if(orderedArrayOfProducts.size() > 1) {
            if (orderedArrayOfProducts.get(1).equals("Z"))
                totalPrice = totalPrice + 21;
            else if (orderedArrayOfProducts.get(1).equals("T"))
                totalPrice = totalPrice + 20;
            else if (orderedArrayOfProducts.get(1).equals("Y"))
                totalPrice = totalPrice + 20;
            else if (orderedArrayOfProducts.get(1).equals("S"))
                totalPrice = totalPrice + 20;
            else if (orderedArrayOfProducts.get(1).equals("X"))
                totalPrice = totalPrice + 17;
        }

    return totalPrice;
    }
}



