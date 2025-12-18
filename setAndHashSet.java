// A set is used to group like objects together and form a unit
// A hashset is not indexible and thus elements can't be removed using indices like lists
import java.util.Set;
import java.util.HashSet;
public class setAndHashSet {
    public static void main(String[] args){

        Set<String> names = new HashSet<>();

        names.add("Erick");
        names.add("Mathias");
        names.add("Latasha");
        names.add("Pkiach");
        names.add("Moses");
        names.add("Steve");

        // removing an element from a set
        names.remove("Erick");

        //clearing a set
        //names.clear();

        //objects contained in the set
        System.out.println(names.contains("Erick"));

        System.out.println(names);
        //objects contained in the set
        System.out.println(names.contains("Erick"));
    }
}