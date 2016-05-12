package lab4.epam;

import java.util.Scanner;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Controller {
    Model model = new Model();
    View view = new View();


    /**
     * This method is not finished, but idea is clear
     * For each parameter, print out its name
     * Then check, if user's input matches required regex
     * If it does - setParameter with user's input
     * If not - repeat an attempt
     */
    void userProcess() {
        Scanner sc = new Scanner(System.in);
        view.print(view.WELCOME);
        view.print(view.HELP);
        readCommand(sc);
    }

    String addValue(String regex, Scanner scanner){
        String value = scanner.nextLine();
        while (!model.check(value, regex)){
            view.print(view.ERROR);
            value = scanner.nextLine();
        }
        return value;
    }

    void addRecord(Scanner sc){
        Book record = new Book();
        String input;
        view.print(view.RECORD);
        view.print(view.FIRST_NAME);
        input = addValue(record.regexFio, sc);
        record.setFirstName(input);
        view.print(view.LAST_NAME);
        input = addValue(record.regexFio, sc);
        record.setSecondName(input);
        view.print(view.THIRD_NAME);
        input = addValue(record.regexFio, sc);
        record.setThirdName(input);
        view.print(view.NICKNAME);
        input = addValue(record.regexNickName, sc);
        record.setNickName(input);
        view.print(view.COMMENT);
        input = addValue(record.regexComment, sc);
        record.setComment(input);
        view.print(view.HOMEPHONE);
        input = addValue(record.regexPhoneNumber, sc);
        record.setHomePhoneNumber(input);
        view.print(view.CELLPHONE);
        input = addValue(record.regexPhoneNumber, sc);
        record.setCellPhoneNumber(input);
        view.print(view.EMAIL);
        input = addValue(record.regexEmail, sc);
        record.setEmail(input);
        view.print(view.SKYPE);
        input = addValue(record.regexSkype, sc);
        record.setSkype(input);
        view.print(view.CITY);
        input = addValue(record.regexCity, sc);
        record.setCity(input);
        view.print(view.STREET);
        input = addValue(record.regexStreet, sc);
        record.setStreet(input);
        view.print(view.INDEX);
        input = addValue(record.regexIndex, sc);
        record.setIndex(input);
        view.print(view.HOUSE);
        input = addValue(record.regexHouseNumber, sc);
        record.setHouseNumber(input);
        view.print(view.FLAT);
        input = addValue(record.regexFlatNumber, sc);
        record.setFlatNumber(input);
        record.setLastUpdate(new java.util.Date().toString());
        record.concatFio();
        record.concatShortAddress();
        view.print(record.toString());
        model.book.add(record);
    }

    void readCommand(Scanner sc){
        while (true) {
            String input = sc.nextLine();
            switch (input) {
                case ("add"): {
                    addRecord(sc);
                    break;
                }
                case ("show"): {
                    if (model.book.isEmpty()){
                        view.print(view.EMPTY_BOOK);
                        break;
                    }
                    view.print(model.show(model.book).toString());
                    break;
                }
                case ("exit"): {
                    System.exit(0);
                }
                default:
                    view.print(view.ERROR);
            }
        }
    }

}
