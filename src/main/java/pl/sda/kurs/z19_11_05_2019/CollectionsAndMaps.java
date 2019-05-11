package pl.sda.kurs.z19_11_05_2019;

import java.util.*;
import java.util.stream.Collectors;
import com.google.common.collect.Lists;

public class CollectionsAndMaps {
    public static void main(String[] args) {
        //Stwórz listę imion, i dodaj do niej 5 elementów (Marek, Aleksandra, Marta, Jakub, Bartosz).
        List<String> names = new ArrayList<>(Arrays.asList("Marek", "Aleksandra", "Marta", "Jakub", "Bartosz"));

        //Wyświetl całą listę.
        System.out.println(names);

        //Wyświetl rozmiar listy.
        System.out.println("Size of list: " + names.size());

        //Dodaj imię Paulina do listy za pomocą odpowiedniej metody.
        names.add("Paulina");

        //Wyświetl trzeci element.
        System.out.println(names.get(3));

        //Wyświetl pierwsze imię z listy od ostatniego do pierwszego znaku. „marek” -> „keram”
        printNameReversed(names, 0);

        //Wyświetl pierwsze imię z listy od ostatniego do pierwszego znaku. „marek” -> „keram” bez StringBuildera.
        printNameReversedWithoutStringBuilder(names, 0);

        //Wyświetl na którym miejscu w liście jest Jakub.
        System.out.println(names.indexOf("Jakub"));

        // Wyświetl informacje o tym czy lista zawiera imię Sylwia.
        System.out.println("Czy Sylwia jest w liscie: " + isNameInList(names, "Sylwia"));

        //Wyświetl informacje o tym czy lista zawiera imię Marta.
        System.out.println("Czy Marta jest w liscie: " + isNameInList(names, "Marta"));

        //Wyświetl pierwsze 2 elementy.
        printFirstTwoElements(names);

        //Zamień w liście imię Marek na Sebastian.
        int indexOfMarek = names.indexOf("Marek");
        names.set(indexOfMarek, "Sebastian"); //DONE skad wiesze ze Marek jest na pierwszym?

        //Wyświetl ostatnie 2 elementy.
        for (int i = names.size() - 1; i > names.size() - 3; i--) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        //Połącz wszystkie imiona z listy w jednego stringa i wyświetl.
        printAllNamesTogether(names);
        System.out.println();

        //Połącz wszystkie imiona z listy, które zawierają literę „s” w jednego stringa i wyświetl.
        printAllNamesWithSCharacter(names);
        System.out.println();

        //Wyświetl drugą i trzecią literę każdego imienia z listy.
        printSecondAndThirdCharOfEachName(names);
        System.out.println();

        //Wyświetl listę w odwrotnej kolejności.
        printReversedList(names);
        System.out.println();

        //Wyświetl imiona z listy, które zaczynają się na „M” lub kończą na „A”.
        printNamesThatStartsWithMOrEndsWithA(names);
        System.out.println();

        //Wyświetl wszystkie imiona łącznie z ilością znaków, z których się składają.
        printNamesAndLenght(names);
        System.out.println();

        //Stwórz nową listę zawierającą 2 imiona (Anna, Maciej) i dodaj tę listę do naszej pierwszej listy
        List<String> names2 = Arrays.asList("Anna", "Maciej");
        names.addAll(names2);

        //Wyświetl informacje o tym czy lista zawiera imiona Aleksandra, Marta i Jakub.
        System.out.println((isNameInList(names,"Aleksandra")&&(isNameInList(names,"Marta"))&&(isNameInList(names,"Jakub"))));
        System.out.println();

        //Wyświetl wszystkie imiona z listy w formacie „indeks listy: imię” np. 3: Marta.
        printIndexesAndNames(names);
        System.out.println();

        //Usuń z listy pierwszy element i go wyświetl.
        System.out.println(names.remove(0));
        System.out.println();

        //Usuń imię „Jakub” z listy.
        names.remove("Jakub");

        //Posortuj listę alfabetycznie rosnąco. (*)
        Collections.sort(names);
        System.out.println(names);
        System.out.println();

        //Posortuj listę alfabetycznie malejąco. (*)
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);
        System.out.println();

        //Sprawdź czy lista jest pusta i wyświetl tę informację.
        System.out.println(names.isEmpty());
        System.out.println();

        //Wyczyść listę i wyświetl jej zawartość.
        names.removeAll(names);
        System.out.println(names);
        System.out.println();

        //Ponownie sprawdź czy lista jest pusta.
        System.out.println(names.isEmpty());
        System.out.println();

        //Stwórz Set imion, i dodaj do niego 5 elementów (Marek, Aleksandra, Marta, Jakub, Bartosz).
        Set<String> namesSet = new HashSet<>(Arrays.asList("Marek", "aleksandra", "Marta", "Jakub", "Bratosz"));
        System.out.println(namesSet);




    }

    public static void printNameReversed(List<String> list, int index) {
        StringBuilder sb = new StringBuilder();
        String name = list.get(index);
        for (int i = name.length() - 1; i >= 0; i--) {
            sb.append(name.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static void printNameReversedWithoutStringBuilder(List<String> list, int index) {
       /* String rev = "";
        String name = list.get(index);
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev); //TODO gotowa metoda*/

        System.out.println(new StringBuilder(list.get(index)).reverse().toString());
    }

    public static boolean isNameInList(List<String> list, String name) {
        return list.contains(name); //DONE sam return
    }

    public static void printFirstTwoElements(List<String> name) {
        for (int i = 0; i < 2; i++) {
            System.out.print(name.get(i) + " ");
        }
        System.out.println();
    }

    public static void printAllNamesTogether(List<String> list) {
        String res = list.stream().reduce((x, y) -> x + y).orElse("brak");
        String collect = list.stream().collect(Collectors.joining(" ")); //TODO
        System.out.println(res);
    }
    public static void printAllNamesWithSCharacter(List<String> list){
        System.out.println(list.stream().filter(s -> s.contains("s"))
                .reduce((x, y) -> x + y).orElse("Brak"));
    }

    public static void printSecondAndThirdCharOfEachName(List<String> list){
       list.stream().map(s -> s.substring(1, 3)).forEach(System.out::println);

    }
    public static void printReversedList(List<String> list){
        System.out.println(Lists.reverse(list));
    }

    public static void printNamesThatStartsWithMOrEndsWithA(List<String> list){
        list.stream().filter(n -> (n.charAt(0) == 'M') ||(n.charAt(n.length()-1) == 'a')).forEach(System.out::println);
    }

    public static void printNamesAndLenght(List<String> list){
        list.stream().map(name -> name+" "+name.length()).forEach(System.out::println);
    }

    public static void printIndexesAndNames(List<String> list){
        list.stream().map(name -> list.indexOf(name) + ": " + name).forEach(System.out::println);
    }

}
