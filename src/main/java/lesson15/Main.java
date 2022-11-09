package lesson15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //1
        Stream.empty()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //2
        List<String> stringList = Arrays.asList("green", "blue", "yellow", "white");
        Set<String> stringSet = stringList.stream()
                .filter(string -> string.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println("Task 2 - stringSet: " + stringSet);

        //3
        Set<String> cities = Set.of("Kyiv", "Kharkiv", "Lviv");
        List<String> collectOfCities = cities.stream().toList();
        System.out.println("Task 3 - collectOfCities: " + collectOfCities);

        //4
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Tom");
        users.put(2, "Fred");
        users.put(3, "John");
        List<String> collectionNames = users.keySet().stream()
                .map(key -> {
                    System.out.println(users.get(key));
                    return users.get(key);
                })
                .toList();
        System.out.println("Task 4 - collectionNames: " + collectionNames);

        //5
        List<String> listOfNumbers = Arrays.asList("3", "5", "6", "1", "15", "8", "20", "2", "12", "6");
        Set<Integer> integerSet = listOfNumbers.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(var -> var % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Task 5 - integerSet: " + integerSet);

        //6
        Stream<Integer> integerStream = Stream.of(12, 5, 0, 22, 8, 15);
        Optional<Integer> firstElement = integerStream
                .parallel()
                .sorted()
                .filter(elem -> elem > 10)
                .findFirst();
        System.out.println("Task 6 - firstElement: " + firstElement);

        //7
        Person ted = new Person(80);

        List<Integer> integerList = Arrays.asList(5, 10, 43, 55, 91, 16, 82);
        List<String> personList = integerList.stream()
                .map(Person::new)   //ссилка на констуктор
                .filter(Person::filterOld)  //ссилка на статич.метод
                .filter(ted::comparePerson) //ссилка на нестатич.метод конкретного обьекта
                .map(Person::toString)  //ссилка на нестатич.метод любого обьекта конкр.типа
                .toList();
        System.out.println("Task 7 - personList: " + personList);

    }
}