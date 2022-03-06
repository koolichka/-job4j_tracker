package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("\"Clean code\"", 146);
        Book book2 = new Book("\"Java. The complete Reference\"", 1489);
        Book book3 = new Book("\"War and Peace\"", 1296);
        Book book4 = new Book("\"Metro 2033\"", 345);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Book title: " + bk.getName() + ", page count: " + bk.getPageCount());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Book title: " + bk.getName() + ", page count: " + bk.getPageCount());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("\"Clean code\"")) {
                System.out.println("Book title: " + bk.getName() + ", page count: " + bk.getPageCount());
            }
        }
    }
}
