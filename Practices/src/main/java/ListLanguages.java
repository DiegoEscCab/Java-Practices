import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListLanguages {

    public static ArrayList<String> ListLanguages() {
        ArrayList<String> List = new ArrayList<String>();{
            List.add("C");
            List.add("C++");
            List.add("Java");
            List.add("Kotlin");
            List.add("Python");
            List.add("Perl");
            List.add("Ruby");
            System.out.println("The Initial List have the next elements: " + List.toString());
            System.out.println("-----------------------------------------");
            List.remove(5);
            System.out.println("After remove the 5th element of the List: " + List.toString());
            System.out.println("-----------------------------------------");
            List.remove("Kotlin");
            System.out.println("After remove Kotlin from the List: " + List.toString());
            System.out.println("-----------------------------------------");


        }
        return List;
    }
}