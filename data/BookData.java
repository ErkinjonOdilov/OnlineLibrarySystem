package library.data;

import library.service.BookType;

public class BookData {
    private String bookName;
    private BookType BookType;
    private String authorFirstName;
    private String authorLastName;
    private String authorBirthday;
    private String authorDeathYear;

    public BookData(String bookName,BookType bookType, String authorFirstName, String authorLastName, String authorBirthday, String authorDeathYear) {
        this.bookName = bookName;
        this.BookType=bookType;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.authorBirthday = authorBirthday;
        this.authorDeathYear = authorDeathYear;
    }

    public BookData() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorBirthday() {
        return authorBirthday;
    }

    public void setAuthorBirthday(String authorBirthday) {
        this.authorBirthday = authorBirthday;
    }

    public library.service.BookType getBookType() {
        return BookType;
    }

    public void setBookType(library.service.BookType bookType) {
        BookType = bookType;
    }

    public String getAuthorDeathYear() {
        return authorDeathYear;
    }

    public void setAuthorDeathYear(String authorDeathYear) {
        this.authorDeathYear = authorDeathYear;
    }

    @Override
    public String toString() {
        return "BookData: " +
                "Book Name='" + bookName + '\'' +
                ", Book Type='" + BookType + '\'' +
                ", Author First Name='" + authorFirstName + '\'' +
                ", Author Last Name='" + authorLastName + '\'' +
                ", Author Birthday='" + authorBirthday + '\'' +
                ", Author Death Year='" + authorDeathYear + '\'' +
                ';';
    }
}
