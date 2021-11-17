
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Library {
    
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowed = new ArrayList<>();
    
    public void setStartBooks()
    {
        books.add(new Book(1, "Programming with Java", "Barry Burd", 200));
        books.add(new Book(2, "Programming with C#", "Barry Burd", 198));
        books.add(new Book(3, "Programming with JavaScript", "Barry Burd", 35));
        books.add(new Book(4, "Programming with C++", "Barry Burd", 150));
        books.add(new Book(5, "Algorithms", "Barry Burd", 20));
        books.add(new Book(6, "Programming with PHP", "Barry Burd", 21));
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
    public ArrayList<Book> getBorrowed()
    {
        return borrowed;
    }
    public void addBook(String bookName, String bookAuthor, int currentQuantity)
    {
        int lastIndex = books.size();
        books.add(new Book(lastIndex + 1, bookName, bookAuthor, currentQuantity));
    }
    public void borrowBook(Student stu, int selectionBook)
    {
        Book findBook = books.get(selectionBook - 1);
        Boolean foundMatch = false;
        Date date = new Date();
        
        if (borrowed.isEmpty()) {
            System.out.println("Book should be returned on: " + findBook.getReturnDateFormat());
            borrowed.add(new Book(findBook.getISBN(), findBook.getName(), findBook.getBookAuthor(), findBook.getCurrentQuantity()));
            findBook.setCurrentQuantity(findBook.getCurrentQuantity() - 1);

            Book findBorrowed = borrowed.get(borrowed.size() - 1);
            findBorrowed.setBorrowedBy(stu);
            findBorrowed.setBorrowedDate(date);
            findBorrowed.setReturnDate();
            findBorrowed.setCurrentQuantity(findBook.getCurrentQuantity() - 1);
        }else
        {
            for (Book b : borrowed ) {
                
                if (b.getBorrowedBy().getName().equals(stu.getName()) && !b.getName().equals(findBook.getName()) ) {
                    foundMatch = false;
                }else
                {
                   foundMatch = true;
                   break;
                }
            }
            if (!foundMatch) {
                System.out.println("Book should be returned on: " + findBook.getReturnDateFormat());
                borrowed.add(new Book(findBook.getISBN(), findBook.getName(), findBook.getBookAuthor(), findBook.getCurrentQuantity()));
                findBook.setCurrentQuantity(findBook.getCurrentQuantity() - 1);

                Book findBorrowed = borrowed.get(borrowed.size() - 1);
                findBorrowed.setBorrowedBy(stu);
                findBorrowed.setBorrowedDate(date);
                findBorrowed.setReturnDate();
                findBorrowed.setCurrentQuantity(findBook.getCurrentQuantity() - 1);
            }else
            {
                System.out.println("Book has been already borrowed by the student");
            }
        }
    }
    public void returnBook(int selectionBook)
    {
        Book findBook = borrowed.get(selectionBook - 1);
        borrowed.remove(selectionBook - 1);
        for (Book b : books) {
            if (findBook.getName().equals(b.getName())) {
                b.setCurrentQuantity(b.getCurrentQuantity() + 1);
                break;
            }
        }
        
        System.out.println("Book was returned."); 
    }
    public ArrayList<Book> showLowerThanOne()
    {
        ArrayList<Book> booksLowerThanOne = new ArrayList<>();
        for (Book b : books ) {
            if (b.getCurrentQuantity() <= 1) {
                booksLowerThanOne.add(b);
            }
        }
        return booksLowerThanOne;
    }
    public ArrayList<Book> sortByPopularity()
    {
        ArrayList<Book> popularitySort = new ArrayList<>();
        popularitySort.addAll(books);        
        
        Collections.sort(popularitySort, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getCurrentQuantity().compareTo(o2.getCurrentQuantity());
            }
        });
        
        return popularitySort;
    }
    public ArrayList<Book> sortBooksByStudent(Student stu)
    {
        ArrayList<Book> borrowedByStudent = new ArrayList<>();
        for (Book b : borrowed) {
            if (b.getBorrowedBy() == stu) {
                borrowedByStudent.add(b);
            }
        }
        Collections.sort(borrowedByStudent, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getReturnDateFormat().compareTo(o2.getReturnDateFormat());
            }
        });
        
        return borrowedByStudent;
    }
    public ArrayList<Book> lateReturn()
    {
        Date date = new Date();
        ArrayList<Book> lateToReturn = new ArrayList<>();
        for (Book b : borrowed ) {
            if (date.after(b.getReturnDate())) {
                lateToReturn.add(b);
            }
        }
        
        Collections.sort(lateToReturn, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getReturnDateFormat().compareTo(o2.getReturnDateFormat());
            }
        });
        
        return lateToReturn;
    }
}
