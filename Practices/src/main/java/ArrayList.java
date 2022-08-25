import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayList {

    public static void main(String[] args) {
        String  operator, language = "", languageType = "";
        Integer index;
        Integer options = 0;

        Scanner scannerLanguage = new Scanner(System.in);
        Scanner scannerLanguageType = new Scanner(System.in);
        Scanner scannerOperation = new Scanner(System.in);
        Scanner scannerOptions = new Scanner(System.in);
        Scanner scannerIndex = new Scanner(System.in);
        List<LanguagePrograms> DB = DataUtils.loadList();
        System.out.println("What you add or remove?");
        operator = scannerOperation.next();

        System.out.println(operator);

        while (options.equals(0)) {
            if (operator.equals("add")) {
                System.out.println("Define the name of the language: ");
                language = scannerLanguage.next();
                System.out.println("Define the type of the language: ");
                languageType = scannerLanguageType.next();

                LanguagePrograms newLan = new LanguagePrograms(language, languageType);
                DB.add(newLan);

                DB.stream().forEach(System.out::println);
            } else if (operator.equals("remove")){

            }else if  {
                System.out.println("What number of the list do you want remove?");
                index = scannerIndex.nextInt();

                System.out.println(index);

                DB.remove(index.intValue());
                DB.stream().forEach(System.out::println);

            } else {
                System.out.println("no operation selected");
            }

            System.out.println("Do you want to continue? \n 0:Continue \n 9:Exit");
            options = scannerOptions.nextInt();
        }
    }




        }


      /* DB.stream()
                .filter(LanguagePrograms -> !LanguagePrograms.getType().equalsIgnoreCase("Scripting"))
                .forEach(System.out::println);

      /*
      */
