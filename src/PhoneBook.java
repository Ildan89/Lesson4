import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private HashMap<String, String> phoneList = new HashMap<>();

    public void add(String phone, String value) throws IllegalPhoneFormatException {
        if (!phone.matches("^\\+7\\d{10}$")) {
            throw new IllegalPhoneFormatException("Invalid format: " + phone);
        }
        phoneList.put(phone, value);
    }

    public List<String> getPhones(String value) {
        return phoneList.entrySet().stream()
                .filter(pair -> pair.getValue().equals(value)).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
