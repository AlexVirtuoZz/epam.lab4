package lab4.epam;

/**
 * Created by virtuoz on 12.05.16.
 */
public class View {
    //System messages
    public final String WELCOME = "Welcome to your phone record";
    public final String RECORD = "Let's create new record";
    public final String HELP = "Type 'help' to get command list\nType 'add' to add new record\nType 'list' to see records in your book\nType 'exit' to quit this program\nType 'show x' to see full information of record x (x = id)";
    public final String BYE = "Come back later! Bye!";

    //Values
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
    public final String GROUP = "Enter group name\n'Friends', 'Job' and 'Family' are available";
    public final String BIRTHDAY = "Enter birthday date\nExample: 10.12.2016";

    //Information
    public final String FIRST_NAME_IS = "First name\t";
    public final String LAST_NAME_IS = "Last name\t";
    public final String THIRD_NAME_IS = "Patronymic\t";
    public final String NICKNAME_IS = "Nickname\t";
    public final String COMMENT_IS = "Information\n";
    public final String HOMEPHONE_IS = "Home phone number\t";
    public final String CELLPHONE_IS = "Mobile phone number\t";
    public final String EMAIL_IS = "Email\t";
    public final String SKYPE_IS = "Skype\t";
    public final String INDEX_IS = "Index\t";
    public final String CITY_IS = "City\t";
    public final String STREET_IS = "Street\t";
    public final String HOUSE_IS = "House number\t";
    public final String FLAT_IS = "Flat number\t";
    public final String GROUP_IS = "Belongs to group\t";
    public final String BIRTHDAY_IS = "Birthday\t";
    public final String LAST_UPDATE = "Last updated on\t";

    //Errors
    public final String ERROR = "Wrong input, try again.";
    public final String EMPTY_BOOK = "Your book is empty. Try to add some records!\nType 'add' to create new record";
    public final String NO_RECORD = "Record is not found\nType 'list' to see available records";
    public final String NO_ID = "Please enter id of required record as a second argument";

    //A method to print out messages
    public void print(String s){
        System.out.println(s);
    }
}
