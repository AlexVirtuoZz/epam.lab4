package lab4.epam;

import java.util.Scanner;

/**
 * Created by virtuoz on 12.05.16.
 */
public class Controller {
    Model model = new Model();
    View view = new View();
    Book book = new Book();

    /**
     * This method is not finished, but idea is clear
     * For each parameter, print out its name
     * Then check, if user's input matches required regex
     * If it does - setParameter with user's input
     * If not - repeat an attempt
     */
    void userProcess() {
        Scanner sc = new Scanner(System.in);
        String input;
        view.print(view.WELCOME);
        while (!book.isRecorded()) {
            view.print(view.FIRST_NAME);
            input = sc.nextLine();
            while (!model.check(input, book.regexFio)) {
                view.print(view.FIRST_NAME);
                input = sc.nextLine();
            }
            book.setFirstName(input);
            book.record();
        }
        view.print(book.firstName);
    }
}
