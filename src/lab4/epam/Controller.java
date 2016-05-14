package lab4.epam;

import java.util.Scanner;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Controller {
    Model model = new Model();
    View view = new View();
    private int bookCounter;

    /**
     * Main method
     * Initialize scanner to read user's input
     * print welcome and help to show available commands
     * Read user's input. Execute required command
     */
    void userProcess() {
        Scanner sc = new Scanner(System.in);
        view.print(view.WELCOME);
        view.print(view.HELP);
        readCommand(sc);
    }

    /**
     * A method to read user's command and execute it
     * Split user's input by space and switch first argument
     * case help - show user all available commands
     * case add - run  method addRecord to create a new record in current book
     * @see Controller#addRecord
     * case list - display all records in book. If book's empty - display an error
     * case show - read a second agrument as an record's ID and display full information of required record
     * case exit - shut down the program
     * other case - display an error
     * @param sc is user's Scanner
     */
    void readCommand(Scanner sc){
        while (true) {
            String input = sc.nextLine();
            String[] paramAndValue = input.split(" ");
            switch (paramAndValue[0]) {
                case ("help"): {
                    view.print(view.HELP);
                    break;
                }
                case ("add"): {
                    addRecord(sc);
                    break;
                }
                case ("list"): {
                    if (model.book.isEmpty()){
                        view.print(view.EMPTY_BOOK);
                        break;
                    }
                    view.print(model.show().toString());
                    break;
                }
                case ("show"): {
                    if (paramAndValue[1] == null){
                        view.print(view.NO_ID);
                        break;
                    }
                    try {
                        showRecord(model.getById(Integer.parseInt(paramAndValue[1])));
                        break;
                    } catch (NumberFormatException e){
                        view.print(view.ERROR);
                        view.print(view.NO_ID);
                        break;
                    }
                }
                case ("exit"): {
                    view.print(view.BYE);
                    System.exit(0);
                }
                default:
                    view.print(view.ERROR);
            }
        }
    }

    /**
     * A method to set each value into record
     * While user's input doesn't match the required pattern, repeat an attempt
     * @param regex is value's pattern
     * @param scanner is user's Scanner
     * @return value, which matches the required pattern
     */
    String addValue(String regex, Scanner scanner){
        String value = scanner.nextLine();
        while (!model.check(value, regex)){
            view.print(view.ERROR);
            value = scanner.nextLine();
        }
        return value;
    }

    /**
     * A method to create a new record
     * Create an input String to set values into book
     * Print welcome message
     * For all values in a book
     *      Print value's name
     *      Reinitialize input with addValue method
     *      @see #addValue
     *      Set a value with current input
     * Set last update with Date object
     * Set record's group by its group name
     * Create an abbreviation by first, middle and second names
     * Set full address by all address parameters
     * Set id
     * Add record into book
     * Display short info of created record
     * @param sc is user's scanner
     */
    void addRecord(Scanner sc){
        Book record = new Book();
        String input;
        view.print(view.RECORD);
        view.print(view.FIRST_NAME);
        input = addValue(record.regexAbbreviation, sc);
        record.setFirstName(input);
        view.print(view.LAST_NAME);
        input = addValue(record.regexAbbreviation, sc);
        record.setSecondName(input);
        view.print(view.THIRD_NAME);
        input = addValue(record.regexAbbreviation, sc);
        record.setThirdName(input);
        view.print(view.BIRTHDAY);
        input = addValue(record.regexDates, sc);
        record.setBirthday(input);
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
        view.print(view.GROUP);
        input = addValue(record.regexGroup, sc);
        record.setGroupName(input);
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
        record.setGroup(record.getGroupName().toUpperCase());
        record.concatAbbreviation();
        record.concatFullAddress();
        record.setId(++bookCounter);
        model.book.add(record);
        view.print(record.toString());
    }

    /**
     * A method to display full information of a record by its ID
     * After executing getById method we get required record
     * @see Model#getById
     * if getById returns null, display error and stop executing
     * Otherwise, display record's full information
     * @param record is a record, returned by getById method
     */
    void showRecord(Book record){
        if (record == null) {
            view.print(view.NO_RECORD);
            return;
        }
        view.print(view.FIRST_NAME_IS + record.getFirstName());
        view.print(view.LAST_NAME_IS + record.getSecondName());
        view.print(view.THIRD_NAME_IS + record.getThirdName());
        view.print(view.NICKNAME_IS + record.getNickName());
        view.print(view.BIRTHDAY_IS + record.getBirthday());
        view.print(view.HOMEPHONE_IS + record.getHomePhoneNumber());
        view.print(view.CELLPHONE_IS + record.getCellPhoneNumber());
        view.print(view.EMAIL_IS + record.getEmail());
        view.print(view.SKYPE_IS + record.getSkype());
        view.print(view.GROUP_IS + record.getGroupName());
        view.print(view.CITY_IS + record.getCity());
        view.print(view.STREET_IS + record.getStreet());
        view.print(view.HOUSE_IS + record.getHouseNumber());
        view.print(view.FLAT_IS + record.getFlatNumber());
        view.print(view.INDEX_IS + record.getIndex());
        view.print(view.COMMENT_IS + record.getComment());
        view.print(view.LAST_UPDATE + record.getLastUpdate());
    }

}
