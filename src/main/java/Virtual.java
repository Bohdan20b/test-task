import java.time.LocalDate;

public class Virtual extends Product {
    private String code;
    private LocalDate expirationDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Virtual{"
                + "name='" + getName()
                + ", price=" + getPrice()
                + ", code='" + code + '\''
                + ", expirationDate=" + expirationDate
                + '}';
    }
}
