import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private HashMap<PhoneNumber, String> phoneList = new HashMap<>();

    public void add(PhoneNumber phone, String value) {
        if (phone != null){
            phoneList.put(phone, value);
        }
    }

    public List<PhoneNumber> getPhones(String name) {
        return phoneList.entrySet().stream()
                .filter(pair -> pair.getValue().equals(name)).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}