public class ResturantTester {

    public static void main(String[] args) {

        
        ResturantBill sitDownBill = new ResturantBill(20);
        
        // When we call the ResturantBill grand total, it includes a tip
        System.out.println("Total including a tip: " + sitDownBill.grandTotal());

        FastFoodBill fastFood = new FastFoodBill(20);
        
        // When we call a FastFood grand total, we override the resturant and
        // do not include a tip.
        System.out.println("Total not including a tip: " + fastFood.grandTotal());
    }

}