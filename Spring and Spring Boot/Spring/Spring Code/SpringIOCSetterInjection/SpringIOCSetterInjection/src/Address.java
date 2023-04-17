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
    	System.out.println("inside setCity setter method");
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
    	System.out.println("inside setPincode setter method");
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
    	System.out.println("inside setStreet setter method");
        this.street = street;
    }

    }
