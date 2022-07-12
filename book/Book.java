package library.book;

import library.data.BookData;
import library.data.DataBase;
import library.service.BookService;
import library.service.BookType;

import java.util.Scanner;

public class Book extends BookData implements BookService {
Scanner scanner=new Scanner(System.in);
    @Override
    public void addBooks() {
        System.out.println("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        int n=scanner.nextInt()-1;
        BookType bookType=bookTypes[n];
        switch (bookType){
            case LITERARY_BOOKS->{
                System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
               BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
               DataBase.literaryBooks.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case POLITICAL_BOOKS->{ System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.politicalBooks.add(bookData);
                System.out.println("Successfully added!!!");}
            case ART_BOOKS->{
                System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.artBooks.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case POETRY_BOOKS->{
                System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.poetryBooks.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case DETECTIVE_BOOKS->{
                System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.detectiveBooks.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case SCIENTIFIC_BOOKS->{
                System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.scientificBooks.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case HISTORY_BOOKS->{
                System.out.print("Book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.historyBooks.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case JOURNALS->{
                System.out.print("Journal name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.journals.add(bookData);
                System.out.println("Successfully added!!!");
            }
            case NEWSPAPERS->{
                System.out.print("Newspaper name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                System.out.print("Author first name: ");
                String aFirstName=scanner.next();
                System.out.print("Author last name: ");
                String aLastName=scanner.next();
                System.out.print("Author Birthday: ");
                String aBirthday=scanner.next();
                System.out.print("Author Death Year: ");
                String aDeathYear=scanner.next();
                Book book=new Book();
                BookData bookData=new BookData(bookName,bookType,aFirstName,aLastName,aBirthday,aDeathYear);
                DataBase.newspaper.add(bookData);
                System.out.println("Successfully added!!!");
            }

        }

    }

    @Override
    public void removeBooks() {
        System.out.println("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        int n=scanner.nextInt()-1;
        BookType bookType=bookTypes[n];
        switch (bookType){
            case LITERARY_BOOKS->{
                System.out.println("Literary Books");
                for (int i = 0; i < DataBase.literaryBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.literaryBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.literaryBooks.remove(n1);
                System.out.println("Successfully removed!!!");
            }
            case POLITICAL_BOOKS->{
                System.out.println("Political Books");
                for (int i = 0; i < DataBase.politicalBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.politicalBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.politicalBooks.remove(n1);
                System.out.println("Successfully removed!!!");
             }
            case ART_BOOKS->{
                System.out.println("Art Books");
                for (int i = 0; i < DataBase.artBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.artBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.artBooks.remove(n1);
                System.out.println("Successfully removed!!!");

            }
            case POETRY_BOOKS->{
                System.out.println("Poetry Books");
                for (int i = 0; i < DataBase.poetryBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.poetryBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.poetryBooks.remove(n1);
                System.out.println("Successfully removed!!!");
            }
            case DETECTIVE_BOOKS->{
                System.out.println("Detective Books");
                for (int i = 0; i < DataBase.detectiveBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.detectiveBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.detectiveBooks.remove(n1);
                System.out.println("Successfully removed!!!");}
            case SCIENTIFIC_BOOKS->{
                System.out.println("Scientific Books");
                for (int i = 0; i < DataBase.scientificBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.scientificBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.scientificBooks.remove(n1);
                System.out.println("Successfully removed!!!");
            }
            case HISTORY_BOOKS->{
                System.out.println("History Books");
                for (int i = 0; i < DataBase.historyBooks.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.historyBooks.get(i));
                }
                System.out.print("Choose remove book: ");
                int n1=scanner.nextInt()-1;
                DataBase.historyBooks.remove(n1);
                System.out.println("Successfully removed!!!");
            }
            case JOURNALS->{
                System.out.println("Journals");
                for (int i = 0; i < DataBase.journals.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.journals.get(i));
                }
                System.out.print("Choose remove journal: ");
                int n1=scanner.nextInt()-1;
                DataBase.journals.remove(n1);
                System.out.println("Successfully removed!!!");
            }
            case NEWSPAPERS->{
                System.out.println("Newspapers");
                for (int i = 0; i < DataBase.newspaper.size(); i++) {
                    System.out.println((i+1)+" -> "+DataBase.newspaper.get(i));
                }
                System.out.print("Choose remove newspaper: ");
                int n1=scanner.nextInt()-1;
                DataBase.newspaper.remove(n1);
                System.out.println("Successfully removed!!!");
            }

        }



    }

    @Override
    public void showBooks() {
        System.out.println("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        int n=scanner.nextInt()-1;
        BookType bookType=bookTypes[n];
        switch (bookType){
            case LITERARY_BOOKS->{
                if(DataBase.literaryBooks.size()!=0){
                    for (BookData book : DataBase.literaryBooks) {
                        System.out.println(book);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case POLITICAL_BOOKS->{
                if(DataBase.politicalBooks.size()!=0){
                    for (BookData book : DataBase.politicalBooks) {
                        System.out.println(book);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case ART_BOOKS->{
                if(DataBase.artBooks.size()!=0){
                    for (BookData book : DataBase.artBooks) {
                        System.out.println(book);
                    }
                }else {
                    System.out.println("There is not books yet");
                }


            }
            case POETRY_BOOKS->{
                if(DataBase.poetryBooks.size()!=0){
                    for (BookData book : DataBase.poetryBooks) {
                        System.out.println(book);
                    }

                }else {
                    System.out.println("There is not books yet");
                }

            }
            case DETECTIVE_BOOKS-> {
                if(DataBase.detectiveBooks.size()!=0){
                    for (BookData book : DataBase.detectiveBooks) {
                        System.out.println(book);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case SCIENTIFIC_BOOKS->{
                if(DataBase.scientificBooks.size()!=0){
                    for (BookData book : DataBase.scientificBooks) {
                        System.out.println(book);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case HISTORY_BOOKS->{
                if(DataBase.historyBooks.size()!=0){
                    for (BookData book : DataBase.historyBooks) {
                        System.out.println(book);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case JOURNALS->{
                if(DataBase.journals.size()!=0){
                    for (BookData journal : DataBase.journals) {
                        System.out.println(journal);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case NEWSPAPERS->{
                if(DataBase.newspaper.size()!=0){
                    for (BookData newspaper : DataBase.newspaper) {
                        System.out.println(newspaper);
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }

        }

    }

    @Override
    public void searchBooks() {
        System.out.println("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        int n=scanner.nextInt()-1;
        BookType bookType=bookTypes[n];
        switch (bookType){
            case LITERARY_BOOKS->{
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=true;
                for (int i = 0; i <DataBase.literaryBooks.size() ; i++) {
                    if(DataBase.literaryBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.literaryBooks.get(i));
                        isHave=false;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case POLITICAL_BOOKS->{
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.politicalBooks.size() ; i++) {
                    if(DataBase.politicalBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.politicalBooks.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case ART_BOOKS->{
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.artBooks.size() ; i++) {
                    if(DataBase.artBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.artBooks.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case POETRY_BOOKS->{
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.poetryBooks.size() ; i++) {
                    if(DataBase.poetryBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.poetryBooks.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case DETECTIVE_BOOKS-> {
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.detectiveBooks.size() ; i++) {
                    if(DataBase.detectiveBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.detectiveBooks.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case SCIENTIFIC_BOOKS->{
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.scientificBooks.size() ; i++) {
                    if(DataBase.scientificBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.scientificBooks.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case HISTORY_BOOKS->{
                System.out.print("Entered searched book name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.historyBooks.size() ; i++) {
                    if(DataBase.historyBooks.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.historyBooks.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this book!!!");
                }
            }
            case JOURNALS->{
                System.out.print("Entered searched journal name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.journals.size() ; i++) {
                    if(DataBase.journals.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.journals.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this journal!!!");
                }
            }
            case NEWSPAPERS->{
                System.out.print("Entered searched newspaper name: ");
                scanner=new Scanner(System.in);
                String bookName=scanner.nextLine();
                boolean isHave=false;
                for (int i = 0; i <DataBase.newspaper.size() ; i++) {
                    if(DataBase.newspaper.get(i).getBookName().equals(bookName)){
                        System.out.println(DataBase.newspaper.get(i));
                        isHave=true;
                    }
                }
                if(isHave){
                    System.out.println("There is not found this newspaper!!!");
                }
            }
            default -> {
                System.out.println("Incorrect!!!");
            }
        }
    }
}
