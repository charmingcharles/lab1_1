package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

    private BigDecimal amount;

    private String currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return prime * result + (amount == null ? 0 : amount.hashCode());
    }

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Money() {
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass())
            return false;
        Money money = (Money) obj;
        return (this.amount.equals(money.amount) && this.currency.equals(money.currency));
    }
}
