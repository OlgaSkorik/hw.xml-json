package by.skorik.json;

import by.skorik.json.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String FILE = "./hw-books.json";

    public static void toJSON (List<Book> bookList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE),bookList);
    }

    public static List<Book> toJavaObject () throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return (List<Book>)mapper.readValue(new File(FILE), List.class);
    }

    public static void main(String[] args) throws IOException {
        List<Book> list = new ArrayList<>();
        list.add(new Book("1A","War and Peace",1868));
        list.add(new Book("1B","The Odyssey",2010));
        list.add(new Book("1C", "The Old Man and the Sea", 1952));
        list.add(new Book("1D", "An American Tragedy", 1925));
        toJSON(list);
        List<Book> bookList = toJavaObject();
        System.out.println(bookList);
    }
}
