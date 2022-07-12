package library;

import library.librarian.Librarian;
import library.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        boolean is=true;
        Librarian l1=new Librarian();
        User u1=new User();
        while (is){
            System.out.println("----------------------- Welcome To Online Library ------------------------");
            System.out.println("1->Enter As A Librarian\n2->Enter As A User\n3->Guide to use\n0->Exit");
            System.out.print(" -> ");
            int n=scanner.nextInt();
            switch (n){
                case 0->{is=false;}
                case 1->{l1.signIn();}
                case 2->{u1.signIn();}
                case 3->{
                    System.out.println("             UZB            ");
                    System.out.println("1.Kutubxonachi bo'lib kiring\n" +
                            "2.Kitoblar bo'limidan kitob qo'shing\n" +
                            "3.foydalanuvchi qo'shish bo'limidan foydalanuvchi qo'shig\n" +
                            "4.foydalanuvchi nomidan kiring kitob tanlash bolimidan kitob tanlang \n" +
                            "5.Tanlagan kitobni ko'rishingiz mumkun\n" +
                            "6.bu kitob Kutubxonada chiqmaydi chunki siz uni oldiz\n" +
                            "7.topshirsez yana joyiga borib tushadi \n" +
                            "\n" +
                            "kutubxonachi" +
                            " login=123;\n" +
                            "password=123;");
                    System.out.println("             Eng            ");
                    System.out.println("1. Log in as a librarian\n" +
                            "2. Add a book from the Books section\n" +
                            "3.add user from add user section\n" +
                            "4. Log in as a user and select a book from the book selection section\n" +
                            "5. You can see the book of your choice\n" +
                            "6. This book will not be published in the library because you have taken it\n" +
                            "7. It goes back to its place without a task\n" +
                            "\n" +
                            "librarian" +
                            " login=123;\n" +
                            "password=123;");
                }


                default -> {
                    System.out.println("There is not this option");
                }
            }
        }
    }
}
