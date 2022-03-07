package by.skorik.jaxb;

import by.skorik.jaxb.model.Book;
import by.skorik.jaxb.model.Bookcase;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    private static final String FILE = "./hw-bookcase.xml";

    private static Bookcase createJavaObject() {
        Bookcase bookcase = new Bookcase();
        bookcase.setName("firstBookcase");
        bookcase.getBookList().add(createBook("1A","War and Peace",1868));
        bookcase.getBookList().add(createBook("1B","The Odyssey",2010));
        bookcase.getBookList().add(createBook("1C", "The Old Man and the Sea", 1952));
        bookcase.getBookList().add(createBook("1D", "An American Tragedy", 1925));
        return bookcase;
    }

    private static Book createBook (String vendorCode, String name, int year) {
        Book book = new Book();
        book.setVendorCode(vendorCode);
        book.setName(name);
        book.setYear(year);
        return book;
    }

    private static void marshal() {
        try {
            JAXBContext context = JAXBContext.newInstance(Bookcase.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            marshaller.marshal(createJavaObject(),new File(FILE));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static Bookcase unmarshal() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Bookcase.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Bookcase) unmarshaller.unmarshal(new File(FILE));
    }

    public static void main(String[] args) throws JAXBException {
        Main.marshal();
        System.out.println(Main.unmarshal());
    }
}
