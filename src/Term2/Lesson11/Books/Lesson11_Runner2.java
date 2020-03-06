package Term2.Lesson11.Books;

import java.io.*;

import java.util.*;

class Lesson11_Runner2 {


    public static void main(String str[]) throws IOException {

        ArrayList<Book> bookshelf = new ArrayList<Book>();
        bookshelf.add(new Book("James and the Giant Peach", "Roald Dahl", 1961));
        bookshelf.add(new Book("Matilda", "Roald Dahl", 1988));
        System.out.println("Comparing: " + bookshelf.get(0).compareTo(bookshelf.get(1)));
        for (Book b : bookshelf) {
            System.out.println(b);
        }

    }
}
