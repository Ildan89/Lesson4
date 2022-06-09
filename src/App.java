import java.util.*;

public class App {
    public static void main(String[] args) {
        //--------------------- ЗАДАНИЕ 1 ------------------------
        ArrayList<String> strArray = new ArrayList<>();
        Collections.addAll(strArray, "Кефир", "Картошка", "Мука", "Яйца", "Хлеб", "Молоко", "Хлеб", "Булка",
                "Сосиськи", "Молоко", "Картошка", "Бананы", "Кефир", "Хлеб", "Яблоки", "Яйца", "Гони деньги");
        HashMap<String, Integer> productList = new HashMap<>();
        strArray.forEach(elem -> addToProductList(elem, productList));
        printMap(productList);

        //--------------------- ЗАДАНИЕ 2 ------------------------
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(PhoneNumber.parse("+79601112233"), "Васильев");
        phoneBook.add(PhoneNumber.parse("+79112223344") , "Петросян");
        phoneBook.add(PhoneNumber.parse("+79604443322") , "Сидоров");
        phoneBook.add(PhoneNumber.parse("+79508889966") , "Сидоров");
        phoneBook.add(PhoneNumber.parse("+79521234567") , "Сидоров");
        phoneBook.add(PhoneNumber.parse("+79529876543") , "Петросян");
        phoneBook.add(PhoneNumber.parse("+795298765433") , "Петров");
        printPhones("Сидоров", phoneBook);
        printPhones("Петросян", phoneBook);
        printPhones("Васильев", phoneBook);
        printPhones("Петров", phoneBook);
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
