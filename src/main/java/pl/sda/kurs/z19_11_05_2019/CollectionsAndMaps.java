package pl.sda.kurs.z19_11_05_2019;



import java.util.ArrayList;
import java.util.List;

public class CollectionsAndMaps {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Aleksandra");
        names.add("Marta");
        names.add("Jakub");
        names.add("Bartosz");

        System.out.println(names);
        System.out.println("Size of list: " + names.size());
        addName(names, "Paulina");
        System.out.println(names.get(3));
        printNameReversed(names, 0);
        System.out.println(names.indexOf("Jakub"));
        System.out.println("Czy Sylwia jest w liscie: " + isNameInList(names, "Sylwia"));
        System.out.println("Czy Marta jest w liscie: " + isNameInList(names, "Marta"));
        printFirstTwoElements(names);



    }
    public static void addName(List<String> list, String name){
        list.add(name);
    }
    public static void printNameReversed(List<String> list, int index){
        StringBuilder sb = new StringBuilder();
        String name = list.get(index);
        for (int i = name.length()-1; i >= 0; i--){
            sb.append(name.charAt(i));
        }
        System.out.println(sb.toString());
    }
    public static boolean isNameInList(List<String> list, String name){
        if (list.contains(name))
            return true;
        return false;
    }

    public static void printFirstTwoElements(List<String> name){
        for (int i = 0; i < 2; i++){
            System.out.print(name.get(i) + " ");
        }
    }

}
