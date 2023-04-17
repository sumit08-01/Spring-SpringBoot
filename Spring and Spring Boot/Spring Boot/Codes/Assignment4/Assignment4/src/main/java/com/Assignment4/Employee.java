package com.Assignment4;

public class Employee {
			
		private String EmpID, Ename, Eemail, Elocation;
		
		public Employee() {
			super();
			
		}

		public Employee(String empID, String ename, String eemail, String elocation) {
			super();
			EmpID = empID;
			Ename = ename;
			Eemail = eemail;
			Elocation = elocation;
		}

		public String getEmpID() {
			return EmpID;
		}

		public void setEmpID(String empID) {
			EmpID = empID;
		}

		@Override
		public String toString() {
			return "Employee [EmpID=" + EmpID + ", Ename=" + Ename + ", Eemail=" + Eemail + ", Elocation=" + Elocation
					+ "]";
		}

		public String getEname() {
			return Ename;
		}

		public void setEname(String ename) {
			Ename = ename;
		}

		public String getEemail() {
			return Eemail;
		}

		public void setEemail(String eemail) {
			Eemail = eemail;
		}

		public String getElocation() {
			return Elocation;
		}

		public void setElocation(String elocation) {
			Elocation = elocation;
		}

		
		
}
