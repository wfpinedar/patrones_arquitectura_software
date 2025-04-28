public class ColombianOrder implements Order {
    private double orderAmount;
    private double additionalSH;

    public ColombianOrder() { }

    public ColombianOrder(double orderAmount, double additionalSH) {
        this.orderAmount   = orderAmount;
        this.additionalSH = additionalSH;
    }

    public double getOrderAmount()   { return orderAmount; }
    public double getAdditionalSH() { return additionalSH; }

    @Override
    public void accept(OrderVisitor v) {
        v.visit(this);
    }
}
