package lab4.epam;

/**
 * Created by virtuoz on 12.05.16.
 */
public class View {
    public final String WELCOME = "Welcome to your phone record";
    public final String RECORD = "Let's create new record";
    public final String FIRST_NAME = "Enter first name\nFirst letter should be uppercase";
    public final String LAST_NAME = "Enter last name\nFirst letter should be uppercase";
    public final String THIRD_NAME = "Enter patronymic\nFirst letter should be uppercase";
    public final String NICKNAME = "Enter nickname\nMay contain '.' , '_' or '-'";
    public final String COMMENT = "Type some comment (not necessary)";
    public final String HOMEPHONE = "Enter home phone number\nShould start with +380";
    public final String CELLPHONE = "Enter cellphone number\nShould start with +380";
    public final String EMAIL = "Enter email";
    public final String SKYPE = "Enter skype login";
    public final String INDEX = "Enter post index\nShould contain 5 digits";
    public final String CITY = "Enter city name\nFirst letter should be uppercase";
    public final String STREET = "Enter street name with 3 letters description\nFirst letter should be uppercase\nExample: Kreschyatic str \\ Trafalgar sqr";
    public final String FLAT = "Enter flat number";
    public final String HOUSE = "Enter house number";
    public final String ERROR = "Wrong input, try again.";
    public final String HELP = "Type 'add' to add new record\nType 'show' to see records in your book\nType 'exit' to quit this program";
    public final String EMPTY_BOOK = "Your book is empty. Try to add some records!\nType 'add' to create new record";

    //A method to print out messages
    public void print(String s){
        System.out.println(s);
    }
}
