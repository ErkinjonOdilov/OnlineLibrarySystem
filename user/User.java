package library.user;

import library.book.Book;
import library.data.BookData;
import library.data.DataBase;
import library.data.TakeBooks;
import library.data.UserData;
import library.librarian.Librarian;
import library.service.BookType;
import library.service.UserService;

import java.util.Scanner;

public class User extends UserData implements UserService {
    public String Fname;
    public String Lname;
    Scanner scanner=new Scanner(System.in);
    @Override
    public void books() {
    boolean isTrue=true;
    while (isTrue){
        System.out.println("1->List of Books\n2->Search Book\n0->Exit");
        int n=scanner.nextInt();
        Book book=new Book();
        switch (n){
            case 0->{isTrue=false;}
            case 1->{book.showBooks();}
            case 2->{book.searchBooks();}
        }
    }
    }

    @Override
    public void takeBooks() {
        if(DataBase.takeBooks.size()!=0){
            System.out.println("You have these books:  ");
                for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                    if(DataBase.users.get(i1).getFirstName().equals(Fname) && DataBase.users.get(i1).getLastName().equals(Lname)){
                        for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if(DataBase.takeBooks.get(i).equals(Fname) && DataBase.takeBooks.get(i).getLastName().equals(Lname)){
                            System.out.println(DataBase.takeBooks.get(i));
                        }
                    }
                }
            }
        }else {
            System.out.println("have not books Yet!!!");
        }

    }

    @Override
    public void submitBooks() {
        System.out.println("Entered submitted book name: ");
        scanner=new Scanner(System.in);
        String submitBookName=scanner.nextLine();
        System.out.print("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        System.out.print(" -> ");
        int n=scanner.nextInt()-1;
        BookType bookType=bookTypes[n];
        switch (bookType) {
            case LITERARY_BOOKS -> {
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.literaryBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case POLITICAL_BOOKS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.politicalBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case ART_BOOKS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.artBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case POETRY_BOOKS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.poetryBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case DETECTIVE_BOOKS-> {
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.detectiveBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case SCIENTIFIC_BOOKS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.scientificBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case HISTORY_BOOKS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.historyBooks.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case JOURNALS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.journals.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            case NEWSPAPERS->{
                boolean isHava=true;
                for (int i = 0; i <DataBase.takeBooks.size() ; i++) {
                    if(DataBase.takeBooks.get(i).getBookName().equals(submitBookName)){
                        DataBase.newspaper.add(DataBase.takeBooks.get(i).getBookInfo());
                        DataBase.takeBooks.remove(i);
                        isHava=false;
                    }
                }
                if(isHava){
                    System.out.println("Incorrect book name!!!\n" +
                            "Please try again later");
                }else {
                    System.out.println("Successfully Submitted!!!");
                }

            }
            default -> {
                System.out.println("Incorrect!!!");
            }

        }
    }

    @Override
    public void getBooks() {
        System.out.println("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        int n=scanner.nextInt()-1;
        BookType bookType=bookTypes[n];
        switch (bookType){
            case LITERARY_BOOKS->{
                for (int i = 0; i < DataBase.literaryBooks.size(); i++) {
                    if(DataBase.literaryBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.literaryBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.literaryBooks.get(n2);
                String bookName=DataBase.literaryBooks.get(n2).getBookName();
                DataBase.literaryBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case POLITICAL_BOOKS->{
                for (int i = 0; i < DataBase.politicalBooks.size(); i++) {
                    if(DataBase.politicalBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.politicalBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.politicalBooks.get(n2);
                String bookName=DataBase.politicalBooks.get(n2).getBookName();
                DataBase.politicalBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case ART_BOOKS->{
                for (int i = 0; i < DataBase.artBooks.size(); i++) {
                    if(DataBase.artBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.artBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.artBooks.get(n2);
                String bookName=DataBase.artBooks.get(n2).getBookName();
                DataBase.artBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case POETRY_BOOKS->{
                for (int i = 0; i < DataBase.poetryBooks.size(); i++) {
                    if(DataBase.poetryBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.poetryBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.poetryBooks.get(n2);
                String bookName=DataBase.poetryBooks.get(n2).getBookName();
                DataBase.poetryBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case DETECTIVE_BOOKS-> {
                for (int i = 0; i < DataBase.detectiveBooks.size(); i++) {
                    if(DataBase.detectiveBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.detectiveBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.detectiveBooks.get(n2);
                String bookName=DataBase.detectiveBooks.get(n2).getBookName();
                DataBase.detectiveBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case SCIENTIFIC_BOOKS->{
                for (int i = 0; i < DataBase.scientificBooks.size(); i++) {
                    if(DataBase.scientificBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.scientificBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.scientificBooks.get(n2);
                String bookName=DataBase.scientificBooks.get(n2).getBookName();
                DataBase.scientificBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case HISTORY_BOOKS->{
                for (int i = 0; i < DataBase.historyBooks.size(); i++) {
                    if(DataBase.historyBooks.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.historyBooks.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.historyBooks.get(n2);
                String bookName=DataBase.historyBooks.get(n2).getBookName();
                DataBase.historyBooks.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case JOURNALS->{
                for (int i = 0; i < DataBase.journals.size(); i++) {
                    if(DataBase.journals.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.journals.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.journals.get(n2);
                String bookName=DataBase.journals.get(n2).getBookName();
                DataBase.journals.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            case NEWSPAPERS->{
                for (int i = 0; i < DataBase.newspaper.size(); i++) {
                    if(DataBase.newspaper.size()==0){
                        System.out.println("There is not books yet!!!");
                    }else {
                        System.out.println((i+1)+" -> "+DataBase.newspaper.get(i));
                    }
                }
                System.out.print("Choose book: ");
                int n2=scanner.nextInt()-1;
                BookData bookInfo=DataBase.newspaper.get(n2);
                String bookName=DataBase.newspaper.get(n2).getBookName();
                DataBase.newspaper.remove(n2);
                System.out.print("Entered First name: ");
                String fName=scanner.next();
                System.out.print("Last Name: ");
                String lName=scanner.next();
                TakeBooks takeBook=new TakeBooks(fName,lName,bookName,bookType,bookInfo);
                DataBase.takeBooks.add(takeBook);
                System.out.println("Successfully Get book!!!");
            }
            default -> {
                System.out.println("Incorrect!!!");
            }
        }
    }

    @Override
    public void userMenu() {
        boolean a=true;
        while (a){
            System.out.println("1->Books\n2->Have Books\n3->Submit Book\n4->Get Books\n5->About Librarian\n0->Exit");
            int n3=scanner.nextInt();
            switch (n3){
                case 0->{a=false;}
                case 1->{books();}
                case 2->{takeBooks();}
                case 3->{submitBooks();}
                case 4->{getBooks();}
                case 5->{librarianInformation();}
            }
        }
    }

    @Override
    public  void signIn() {
        boolean b=true;
        System.out.print("Enterd login: ");
         String login=scanner.next();
        System.out.print("Entered password: ");
        String password=scanner.next();
        for (int i = 0; i < DataBase.users.size(); i++) {
            if(DataBase.users.get(i).getLogin().equals(login)&&DataBase.users.get(i).getPassword().equals(password)){
                Fname=DataBase.users.get(i).getFirstName();
                Lname=DataBase.users.get(i).getLastName();
                userMenu();
                b=false;
            }
        }
        if(b){
            System.out.println("Login or Password Incorrect!!!\n" +
                    "    Please Try again!!!");
        }
    }

    @Override
    public void librarianInformation() {
        Librarian l1=new Librarian();
        System.out.println(l1);
    }
}
