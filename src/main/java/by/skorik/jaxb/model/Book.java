package by.skorik.jaxb.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"vendorCode", "name", "year"}, name = "book")
public class Book {

    private String vendorCode;
    private String name;
    private int year;

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "vendorCode='" + vendorCode + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
