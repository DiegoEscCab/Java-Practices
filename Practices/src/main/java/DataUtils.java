import java.util.ArrayList;

public class DataUtils {

    public static ArrayList<LanguagePrograms> loadList() {
        ArrayList<LanguagePrograms> list = new ArrayList<>();
                LanguagePrograms n01 = new LanguagePrograms("C", "Imperative");
                LanguagePrograms n02 = new LanguagePrograms("C++", "POO");
                LanguagePrograms n03 = new LanguagePrograms("Java", "POO");
                LanguagePrograms n04 = new LanguagePrograms("Kotlin", "Scripting");
                LanguagePrograms n05 = new LanguagePrograms("Python", "Multi-paradigm");
                LanguagePrograms n06 = new LanguagePrograms("Perl", "Scripting");
                LanguagePrograms n07 = new LanguagePrograms("Ruby", "Dynamic");

                list.add(n01);
                list.add(n02);
                list.add(n03);
                list.add(n04);
                list.add(n05);
                list.add(n06);
                list.add(n07);

        return (list);
    }
}
