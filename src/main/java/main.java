import exampleDate.GeneratorDate;
import model.ClassSchool;
import java.util.Scanner;

/**
 * Created by Andrzej on 2017-04-16.
 */
public class main {

    public static void main(String[] args) {

        ClassSchool classSchool = new GeneratorDate().getClassschool();
        Scanner scanner = new Scanner(System.in);
        String controlSwitch ;
        do {
                    System.out.println("1 Wywietlanie danych");
                    System.out.println("2 Dodaj");
                    System.out.println("3 Usuń");
                    System.out.println("Wyjście z pentli e");
            controlSwitch = scanner.nextLine();
            switch(controlSwitch) {
                case "1":
                    System.out.println(classSchool);
                    break;
                case "2":break;
                case "3":break;
                case "e":break;
                default:
                    System.out.println(controlSwitch);
            }
        } while (!controlSwitch.equals("e"));
    }
}
