public class Employee {
    private String name;
    private String empId;
    private Address address;

    public Employee()
    {
    
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
    	System.out.println("inside setAddress setter method");
        this.address = address;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
    	System.out.println("inside setEmpId setter method");
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	System.out.println("inside setName setter method");
        this.name = name;
    }

}
