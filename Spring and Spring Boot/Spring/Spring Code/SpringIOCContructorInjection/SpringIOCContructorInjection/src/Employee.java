public class Employee {
    private String name;
    private int empId;
    private Address address;

    public Employee() {
    	System.out.println("Default Constructor called");
    }

  
    public Employee(String name,int empId,Address address)
    {
    	System.out.println("Parameterized Constructor called");
        this.name=name;
        this.empId=empId;
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
