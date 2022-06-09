import java.util.*;

public class App {
    public static void main(String[] args) throws IllegalPhoneFormatException {
        //--------------------- ЗАДАНИЕ 1 ------------------------
        ArrayList<String> strArray = new ArrayList<>();
        Collections.addAll(strArray, "Кефир", "Картошка", "Мука", "Яйца", "Хлеб", "Молоко", "Хлеб", "Булка",
                "Сосиськи", "Молоко", "Картошка", "Бананы", "Кефир", "Хлеб", "Яблоки", "Яйца", "Гони деньги");
        HashMap<String, Integer> productList = new HashMap<>();
        strArray.forEach(elem -> addToProductList(elem, productList));
        printMap(productList);

        //--------------------- ЗАДАНИЕ 2 ------------------------
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+79601112233", "Васильев");
        phoneBook.add("+79112223344", "Петросян");
        phoneBook.add("+79604443322", "Сидоров");
        phoneBook.add("+79508889966", "Сидоров");
        phoneBook.add("+79521234567", "Сидоров");
        phoneBook.add("+79529876543", "Петросян");
        printPhones("Сидоров", phoneBook);
        printPhones("Петросян", phoneBook);
        printPhones("Васильев", phoneBook);
    }

    private static void addToProductList(String str, Map<String, Integer> productList) {
        if (productList.containsKey(str)) {
            Integer counter = productList.get(str) + 1;
            productList.replace(str, counter);
        } else {
            productList.put(str, 1);
        }
    }

    private static <K, V> void printMap(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    private static void printPhones(String name, PhoneBook phoneBook) {
        System.out.printf("Список номеров для \"%s\": %s%n", name, phoneBook.getPhones(name));
    }


}
