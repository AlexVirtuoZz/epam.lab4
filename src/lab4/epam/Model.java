package lab4.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Model {
    //Create an empty book object
    Book book = new Book();




    void check(String s){
        Pattern pattern = Pattern.compile(book.regexStreet);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()){

        }

    }

}
