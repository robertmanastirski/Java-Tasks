public class Book extends Library{
    private String bookName;
    private String bookAuthor;
    private int ISBN;
    private int currentQuantity;
    
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
    public int getCurrentQuantity()
    {
        return currentQuantity;
    }
    
}
