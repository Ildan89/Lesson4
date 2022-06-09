import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IllegalPhoneFormatException {
        //--------------------- ЗАДАНИЕ 1 ------------------------
        ArrayList<String> strArray = new ArrayList<>();
        Collections.addAll(strArray, "Кефир", "Картошка", "Мука", "Яйца", "Хлеб", "Молоко", "Хлеб", "Булка",
                "Сосиськи", "Молоко", "Картошка", "Бананы", "Кефир", "Хлеб", "Яблоки", "Яйца", "Гони деньги");

        HashMap<String, Integer> productList = new HashMap<>();
        strArray.stream().forEach(elem-> addToMap(elem, productList));
        printMap(productList);

        //--------------------- ЗАДАНИЕ 2 ------------------------
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+79601112233", "Васильев");
        phoneBook.add("+79112223344", "Петросян");
        phoneBook.add("+79604443322", "Сидоров");
        phoneBook.add("+79508889966", "Сидоров");
        System.out.printf("Список номеров для \"Сидоров\": %s%n", phoneBook.getPhones("Сидоров"));
    }

    private static void addToMap(String str, Map<String, Integer> map){
        if (map.containsKey(str)) {
            Integer newValue = map.get(str) + 1; 
            map.replace(str, newValue);
        } else {
            map.put(str, 1);
        }
    }

    private static <K, V> void printMap (Map<K, V> map) {
        for (K key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }


}
