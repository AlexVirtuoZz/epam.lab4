package lab4.epam;


import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Model {

    LinkedList<Book> book = new LinkedList<>();

    //A method to check if input matches its pattern
    boolean check(String s, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()){
            return true;
        }
        return false;
    }

    StringBuilder show (LinkedList<Book> book) {
        StringBuilder bookList = new StringBuilder();
        for (Book record : book){
            bookList.append(record.getFio()+"\n");
        }
        return bookList;
    }

}
