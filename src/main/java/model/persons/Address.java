package model.persons;

public class Address {
    private int postcode;
    private String houseNumber;
    private String city;
    private String street;

    public Address(int postcode, String houseNumber, String city, String street) {
        this.postcode = postcode;
        this.houseNumber = houseNumber;
        this.city = city;
        this.street = street;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
