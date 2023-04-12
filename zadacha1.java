import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zadacha1{
    
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {          // используется для проверки того, отображается ли конкретный ключ в Map или нет.
            map.get(key).add(value);         // спользуется для извлечения или извлечения значения, сопоставленного с конкретным ключом, упомянутым в параметре.
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);             // используется для связывания указанного значения с указанным ключом на карте.
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Petrov", 222222, bookPhone);
        addNumber("Petrov", 585, bookPhone);
        addNumber("Sidorov", 6666666, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Sidorov", 11111111, bookPhone);
        printBook(bookPhone);
       }
}