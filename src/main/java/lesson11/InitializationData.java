package lesson11;

import java.util.*;

public class InitializationData {

    public static Information DataProcess() {
        List<String> name = new ArrayList<>();
        Set<String> mail = new HashSet<>();
        Map<String, String> map = new HashMap<>();
        String emailDomain = "@mail.ua";

        for (Integer i = 1; i <= 30; i++) { //add 30 unique values
            String newString = i.toString();
            name.add(newString);
            mail.add(newString + emailDomain);
            map.put(newString + emailDomain, newString);
        }
        for (int i = 0; i < 10; i++) {  //add 10 identical values
            String addValue = "value";
            name.add(addValue);
            mail.add(addValue + emailDomain);
            map.put(addValue + emailDomain, addValue);
        }

        List<String> uniqueName = listWithUniqueValues(name);

        return userWithUniqueValues(mail, map, uniqueName);
    }

    private static List<String> listWithUniqueValues(List<String> name) {
        Set<String> nameToSet = Set.copyOf(name);
        List<String> uniqueName = new ArrayList<>(nameToSet);
        return uniqueName;
    }

    private static Information userWithUniqueValues(Set<String> mail, Map<String, String> map, List<String> uniqueName) {
        if (uniqueName.size() == mail.size() && uniqueName.size() == map.size()) {
            Information user = new Information(uniqueName, mail, map);
            return user;
        }
        return null;
    }
}
