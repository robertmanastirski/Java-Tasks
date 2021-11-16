
import java.util.ArrayList;
import java.util.Date;

public class Library {
    
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowed = new ArrayList<>();
    
    public void setStartBooks()
    {
        books.add(new Book(1, "Programming with Java", "Barry Burd", 200));
        books.add(new Book(2, "Programming with C#", "Barry Burd", 200));
        books.add(new Book(3, "Programming with JavaScript", "Barry Burd", 200));
        books.add(new Book(4, "Programming with C++", "Barry Burd", 200));
        books.add(new Book(5, "Algorithms", "Barry Burd", 200));
        books.add(new Book(6, "Programming with PHP", "Barry Burd", 200));
    }
    public Boolean checkIfEmpty()
    {
        if (books.isEmpty()) {
            return true;
        }
        return false;
    }
    public ArrayList<Book> getBooks()
    {
        return books;
    }
    public void addBook(String bookName, String bookAuthor, int currentQuantity)
    {
        int lastIndex = books.size();
        books.add(new Book(lastIndex + 1, bookName, bookAuthor, currentQuantity));
    }
    public void removeQuantity()
    {
        
    }
    public void borrowBook(Student stu, int selectionBook)
    {
        Book findBook = books.get(selectionBook - 1);
        Date date = new Date();
        
        findBook.setBorrowedBy(stu);
        findBook.setBorrowedDate(date);
        findBook.setReturnDate();
        System.out.println("Book borrowed on: " + findBook.getBorrowedDate());
        System.out.println("Book should be returned on: " + findBook.getReturnDate());
        
        //TODO:
        //RETURN INFO ON WHEN THE BOOK SHOULD BE RETURNED TO THE LIBRARY
        
        borrowed.add(findBook);
    }
}
