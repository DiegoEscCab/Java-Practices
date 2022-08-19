import java.util.ArrayList;

public class DataUtils {

    public static ArrayList<LanguagePrograms> loadList() {
        ArrayList<LanguagePrograms> list = new ArrayList<>();
                LanguagePrograms n01 = new LanguagePrograms("C", "Imperative");
                LanguagePrograms n02 = new LanguagePrograms("C++", "POO");
                LanguagePrograms n03 = new LanguagePrograms("Java", "POO");
                LanguagePrograms n04 = new LanguagePrograms("Kotlin", "Scripting");
                LanguagePrograms n05 = new LanguagePrograms("Python", "Multi-paradigm");
                LanguagePrograms n06 = new LanguagePrograms("Ruby", "Dynamic");
                LanguagePrograms n07 = new LanguagePrograms("JavaScript", "Scripting");
                LanguagePrograms n08 = new LanguagePrograms("PHP", "Scripting");
                LanguagePrograms n09 = new LanguagePrograms("Perl", "Scripting");
                LanguagePrograms n10 = new LanguagePrograms("Pascal", "Imperative");
                LanguagePrograms n11 = new LanguagePrograms("SQL", "Declarative");
                LanguagePrograms n12 = new LanguagePrograms("Go", "Concurrent");

                list.add(n01);
                list.add(n02);
                list.add(n03);
                list.add(n04);
                list.add(n05);
                list.add(n06);
                list.add(n07);
                list.add(n08);
                list.add(n09);
                list.add(n10);
                list.add(n11);
                list.add(n12);


        return (list);
    }
}
