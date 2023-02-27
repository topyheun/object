package topy.object.index02;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmont;

    public AmountDiscountPolicy(Money discountAmont, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmont = discountAmont;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmont;
    }
}
