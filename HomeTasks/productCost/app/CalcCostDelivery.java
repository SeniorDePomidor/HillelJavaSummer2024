package productCost.app;

// Клас розрахунку вартості товару,
// враховуючи вартість доставки
public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private final static double deliveryPrice = 7.0d;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()
                + deliveryPrice;
    }
}
