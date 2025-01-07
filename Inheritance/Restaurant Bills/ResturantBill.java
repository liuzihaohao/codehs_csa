public class ResturantBill {

    private final double TAX_RATE = 0.05;
    private final double TIP_RATE = 0.20;
    private double foodTotal;

    public ResturantBill(double foodTotal)
    {
        this.foodTotal = foodTotal;
    }

    public double getFoodTotal()
    {
        return foodTotal;
    }

    public double getTaxRate()
    {
        return TAX_RATE;
    }

    public double getTipRate()
    {
        return TIP_RATE;
    }

    // Resturant automatically adds tax and tip.
    public double grandTotal()
    {
        return foodTotal * (1 + TAX_RATE + TIP_RATE);
    }
}
