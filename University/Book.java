
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book extends Library{
    private String bookName;
    private String bookAuthor;
    private int ISBN;
    private int currentQuantity;
    private Student borrowedBy;
    Date borrowedDate;
    Date returnDate = new Date();
    
    public Book(int ISBN, String bookName, String bookAuthor, int currentQuantity)
    {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.currentQuantity = currentQuantity;
    }
    public String getName()
    {
        return bookName;
    }
    public String getBookAuthor()
    {
        return bookAuthor;
    }
    public int getISBN()
    {
        return ISBN;
    }
    public Integer getCurrentQuantity()
    {
        return currentQuantity;
    }
    public Student getBorrowedBy()
    {
        return borrowedBy;
    }
    public void setReturnDate()
    {
        returnDate.setMonth(borrowedDate.getMonth() + 1);
        returnDate.setYear(borrowedDate.getYear() + 1);
    }
    
    public String getReturnDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/Y");
        return sdf.format(returnDate);
    }
    public void setCurrentQuantity(int currentQuantity)
    {
        this.currentQuantity = currentQuantity;
    }
    public void setBorrowedBy(Student borrowedBy)
    {
        this.borrowedBy = borrowedBy;
    }
    public void setBorrowedDate(Date date)
    {
          this.borrowedDate = date;

    }
    
}
