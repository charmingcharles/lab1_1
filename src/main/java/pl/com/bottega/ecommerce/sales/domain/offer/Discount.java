package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String cause;

    Money value;

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(Money value) {
        this.value = value;
    }
}
