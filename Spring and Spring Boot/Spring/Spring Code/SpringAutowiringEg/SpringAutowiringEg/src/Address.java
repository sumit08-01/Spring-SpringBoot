public class Address {
    private String street;
    private String city;
    private String pincode;

    public Address()
    {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString()
    {
        return "Street->"+street+" City->"+city+" Pin->"+pincode;

    }

    }
