import java.util.Objects;

public class PhoneNumber {
    private final String phoneNumber;

    public static PhoneNumber parse(String phoneNumber) {
        boolean isFormatOk = phoneNumber.matches("^\\+7\\d{10}$");
        return isFormatOk ? new PhoneNumber(phoneNumber) : null;
    }

    private PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode() + Objects.hash(phoneNumber) * 31;
    }
}
