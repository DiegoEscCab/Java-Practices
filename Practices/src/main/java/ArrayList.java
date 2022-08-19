import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<LanguagePrograms> DB = DataUtils.loadList();

        DB.stream()
                .filter(LanguagePrograms -> LanguagePrograms.getType().equalsIgnoreCase("Scripting"))
                .forEach(System.out::println);

    }
}
