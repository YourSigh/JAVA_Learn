import com.learn.service.BookService;
import com.learn.service.impl.BookServiceImpl;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}