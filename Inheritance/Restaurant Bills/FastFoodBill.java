public class FastFoodBill extends ResturantBill {

    public FastFoodBill(double foodTotal)
    {
        super(foodTotal);
    }

    // For a Fast Food bill, we don't want to include a tip
    // so we override the calculation.
    @Override
    public double grandTotal()
    {
        return super.getFoodTotal() * (1 + super.getTaxRate());
    }

}
