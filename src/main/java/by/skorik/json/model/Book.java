package by.skorik.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    @JsonProperty("Vendor code")
    private String vendorCode;
    @JsonProperty("Name of the book")
    private String name;
    @JsonProperty("The year of publishing")
    private int year;

    public Book() {}

    public Book(String vendorCode, String name, int year) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.year = year;
    }

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
        return "Book[" +
                "vendorCode='" + vendorCode + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ']';
    }
}
