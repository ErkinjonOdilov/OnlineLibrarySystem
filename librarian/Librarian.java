package library.librarian;

import library.book.Book;
import library.data.DataBase;
import library.data.LibrarianData;
import library.data.UserData;
import library.service.BookType;
import library.service.LibrarianService;

import java.util.List;
import java.util.Scanner;

public class Librarian extends LibrarianData implements LibrarianService {
    Scanner scanner=new Scanner(System.in);
    @Override
    public void showBooks() {
        boolean isTrue=true;
        while (isTrue){
            System.out.println("Choose options: ");
            System.out.println("1->List of books\n2->Add Books\n3->Remove Books\n4->Search Books\n0->Exit");
            System.out.print(" -> ");
            int n=scanner.nextInt();
            Book b1=new Book();
            switch (n){
                case 0->{isTrue=false;}
                case 1->{b1.showBooks();}
                case 2->{b1.addBooks();}
                case 3->{b1.removeBooks();}
                case 4->{b1.searchBooks();}
                default -> {
                    System.out.println("Incorrect!!!");
                }
            }
        }

    }

    @Override
    public void addUser() {
        System.out.print("First name: ");
        String fName=scanner.next();
        System.out.print("Last name: ");
        String lName=scanner.next();
        System.out.print("Birthday:  ");
        String birthday=scanner.next();
        System.out.print("Gender:  ");
        String gender=scanner.next();
        System.out.print("Phone Number:  ");
        String pNumber=scanner.next();
        System.out.print("Email:  ");
        String email=scanner.next();
        System.out.print("Login:  ");
        String login=scanner.next();
        System.out.print("Password:  ");
        String password=scanner.next();
        UserData user=new UserData(fName,lName,birthday,gender,pNumber,email,login,password);
        DataBase.users.add(user);
        System.out.println("Successfully added New User!!!");


    }

    @Override
    public void removeUser() {
        for (int i = 0; i <DataBase.users.size() ; i++) {
            System.out.println((i+1)+" -> "+DataBase.users.get(i));
        }
        System.out.print("Choose remove user: ");
        int n=scanner.nextInt()-1;
        DataBase.users.remove(n);
        System.out.println("Successfully Removed!!!");
    }

    @Override
    public void userInformation() {
        System.out.println("Choose book type: ");
        BookType[] bookTypes=BookType.values();
        for (int i = 0; i <bookTypes.length; i++) {
            System.out.println((i+1)+" -> "+bookTypes[i]);
        }
        int n=scanner.nextInt()-1;
        BookType BookType=bookTypes[n];
        switch (BookType){
            case LITERARY_BOOKS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case POLITICAL_BOOKS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case ART_BOOKS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }


            }
            case POETRY_BOOKS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case DETECTIVE_BOOKS-> {
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case SCIENTIFIC_BOOKS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case HISTORY_BOOKS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case JOURNALS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }
            case NEWSPAPERS->{
                if(DataBase.users.size()!=0) {
                    for (int i = 0; i < DataBase.takeBooks.size(); i++) {
                        if (DataBase.takeBooks.get(i).getBookType().equals(BookType)) {
                            for (int i1 = 0; i1 < DataBase.users.size(); i1++) {
                                if (DataBase.takeBooks.get(i).getFirstName().equals(DataBase.users.get(i1).getFirstName()) &&
                                        DataBase.takeBooks.get(i).getLastName().equals(DataBase.users.get(i1).getLastName())) {
                                    System.out.println(DataBase.takeBooks.get(i));
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("There is not books yet");
                }

            }

        }

    }

    @Override
    public void bookInformation() {
        System.out.println("Literary books: "+DataBase.literaryBooks.size());
        System.out.println("Political books: "+DataBase.politicalBooks.size());
        System.out.println("Art books: "+DataBase.artBooks.size());
        System.out.println("Poetry books: "+DataBase.poetryBooks.size());
        System.out.println("Detective books: "+DataBase.detectiveBooks.size());
        System.out.println("Scientific books: "+DataBase.scientificBooks.size());
        System.out.println("History books: "+DataBase.historyBooks.size());
        System.out.println("Journals: "+DataBase.journals.size());
        System.out.println("Newspapers: "+DataBase.newspaper.size());
        int sum=DataBase.literaryBooks.size()+DataBase.politicalBooks.size()+DataBase.artBooks.size()+
                DataBase.poetryBooks.size()+DataBase.detectiveBooks.size()+DataBase.scientificBooks.size()+
                DataBase.historyBooks.size()+DataBase.journals.size()+DataBase.newspaper.size();
        System.out.println("All books: "+sum);
    }

    @Override
    public void menuLibrarian() {
        boolean s=true;
        while (s){
            System.out.println("1->Books\n2->User Information\n3->Book Information\n4->Add User\n5->Remove User\n6->List Of Users\n0-Exit");
            int n3=scanner.nextInt();
            switch (n3){
                case 0->{s=false;}
                case 1->{showBooks();}
                case 2->{userInformation();}
                case 3->{bookInformation();}
                case 4->{addUser();}
                case 5->{removeUser();}
                case 6->{listOfUsers();}
                default -> {
                    System.out.println("Incorrect!!!");
                }
            }
        }
    }

    @Override
    public void listOfUsers() {
        for (UserData user : DataBase.users) {
            System.out.println(user);
        }
    }

    @Override
    public void signIn() {
        System.out.print("Enterd Login: ");
        String Login=scanner.next();
        System.out.print("Entered Password: ");
        String Password=scanner.next();
        if(getLogin().equals(Login)){
            if (getPassword().equals(Password)){
                menuLibrarian();
            }else {
                System.out.println("Password is Incorrect!!!");
            }
        }else {
            System.out.println("Login is Incorrect!!!");
        }
    }
}
