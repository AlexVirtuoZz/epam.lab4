package lab4.epam;


import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Model {
    //A list to keep records
    LinkedList<Book> book = new LinkedList<>();

    /**
     * A method to check if input matches its pattern
     * Initialize pattern with required regex
     * Initialize matcher with current pattern
     * @return true is matcher matches its pattern
     * @return false if matcher doesn't match its pattern
     */
    boolean check(String s, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()){
            return true;
        }
        return false;
    }

    /**
     * A method to return list of records
     * Initialize string builder to iterate records from current book
     * Append record's ID and abbreviation
     * @return list of records
     */
    StringBuilder show () {
        StringBuilder bookList = new StringBuilder();
        for (Book record : book){
            bookList.append(record.getId()+"  "+record.getAbbreviation()+"\n");
        }
        return bookList;
    }

    /**
     * A method to detect record by its ID
     * @param id is ID of required record
     * @return required record, if such one was found
     * @return null of no such record was found
     */
    Book getById(int id){
        for (Book record : book){
            if (record.getId() == id) return record;
        }
        return null;
    }

}
