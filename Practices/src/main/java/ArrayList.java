import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayList {

    public static void main(String[] args) {
        String  language, languageType,type;
        Integer index, operator;
        Integer options = 0;

        Scanner scannerLanguage = new Scanner(System.in);
        Scanner scannerLanguageType = new Scanner(System.in);
        Scanner scannerOperation = new Scanner(System.in);
        Scanner scannerOptions = new Scanner(System.in);
        Scanner scannerIndex = new Scanner(System.in);
        Scanner scannerLetter = new Scanner(System.in);
        List<LanguagePrograms> DB = DataUtils.loadList();
        System.out.println("Press 0 and Enter to start");
        operator = scannerOperation.nextInt();
        //Esto funciona

        while (options.equals(0)) {
            System.out.println("Choose from this list: \n1 = Add\n2 = Remove Index\n3 = Remove Language\n4 = Remove Type\n5 = Remove Letter");
            operator = scannerOperation.nextInt();
            if (operator.equals(1)) {
                System.out.println("Define the name of the language: ");
                language = scannerLanguage.next();
                System.out.println("Define the type of the language: ");
                languageType = scannerLanguageType.next();
                LanguagePrograms newLan = new LanguagePrograms(language, languageType);
                DB.add(newLan);
                DB.forEach(System.out::println);

                //Remove by index
            } else if (operator.equals(2)){
                System.out.println("What number of the list do you want remove?");
                index = scannerIndex.nextInt();
                DB.remove((int) index);
                DB.forEach(System.out::println);

                //Remove by Language
            } else if (operator.equals(3)) {
                System.out.println("Define the name of language to remove: ");
                language = scannerLanguage.next();
                String finalLanguage = language;
                DB.stream().filter(LanguagePrograms -> !LanguagePrograms.getLanguage().equalsIgnoreCase(finalLanguage))
                        .forEach(System.out::println);

                //Remove by Type
            } else if (operator.equals(4)) {
                System.out.println("Define the type to remove language: ");
                languageType = scannerLanguageType.next();
                String finalLanguageType = languageType;
                DB.stream().filter(LanguagePrograms -> !LanguagePrograms.getType().equalsIgnoreCase(finalLanguageType))
                        .forEach(System.out::println);

                //Remove by Letter
            } else if (operator.equals(5)) {
                System.out.println("Define the letter to remove language: ");
                type = scannerLetter.next();
                String finalType = type;
                DB.stream().filter(LanguagePrograms -> !LanguagePrograms.getLanguage().contains(finalType))
                        .forEach(System.out::println);
            } else {
                System.out.println("no operation selected");
            }

            System.out.println("Do you want to continue? \n0:Continue \n9:Exit");
            options = scannerOptions.nextInt();
        }
    }




        }


      /* DB.stream()
                .filter(LanguagePrograms -> !LanguagePrograms.getType().equalsIgnoreCase("Scripting"))
                .forEach(System.out::println);

      /*
      */
