package pluralsight.com;

import java.util.Scanner;

public class Book {

    private int bookId;
    private String bookIsbn, bookTitle, checkOutTo;
    private boolean isCheckedOut;

    Scanner input = new Scanner(System.in);

    public Book(int bookId, String bookIsbn, String bookTitle){

        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn){
        this.bookIsbn = bookIsbn;
    }

    public String getbookTitle(){
        return bookTitle;
    }

    public void setBookTitle(){
        this.bookTitle = bookTitle;
    }

    public static book[] books = new book[];


    public static void bookLibrary(){
        books[0] = new book(1011111111121, 1010101011, "Diary of a wimpy kid");
        books[1] = new book(1011111111122, 1010101012, "Scary stories to tell in the dark");
        books[2] = new book(1011111111123, 1010101013, "The Bernstain Bears");
        books[3] = new book(1011111111124, 1010101014, "Where the wild things are");
        books[4] = new book(1011111111125, 1010101015, "Curious George");
        books[5] = new book(1011111111126, 1010101016, "Five little monkeys jumping on the bed");
        books[6] = new book(1011111111127, 1010101017, "The giving tree");
        books[7] = new book(1011111111128, 1010101018, "Goodnight Moon");
        books[8] = new book(1011111111129, 1010101019, "No, David!");
        books[9] = new book(1011111111221, 1010101021, "Corduroy");
        books[10] = new book(1011111111222, 1010101022, "Click Clack Moo Cows That Type");
        books[11] = new book(1011111111223, 1010101023, "The Cat In The hat");
        books[12] = new book(1011111111224, 1010101024, "Diary of a wimpy kid");
        books[13] = new book(1011111111225, 1010101025, "Scary stories to tell in the dark");
        books[14] = new book(1011111111226, 1010101026, "The Bernstain Bears");
        books[15] = new book(1011111111227, 1010101027, "Are You My Mother?");
        books[16] = new book(1011111111228, 1010101028, "If You Give A Mouse A Cookie");
        books[17] = new book(1011111111229, 1010101029, "Brown Bear, Brown Bear, What Do You See?");
        books[18] = new book(1011111111231, 1010101031, "The Very Hungry Caterpillar");
        books[19] = new book(1011111111232, 1010101032, "Goodnight Moon");
        books[20] = new book(1011111111233, 1010101033, "A Bad Case Of Stripes");


    }






       /* if (isCheckedOut == true){
            System.out.println("Book is already checked out.");
        } else{
            System.out.println("book is available for check out.");
        } */

    }






