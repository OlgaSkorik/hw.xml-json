package by.skorik.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"name", "bookList"}, name = "bookcase")
public class Bookcase {

    private String name;
    List<Book> bookList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

@XmlElement(name = "book")
@XmlElementWrapper(name = "bookList")
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
