// Take the details of the employees and write it in an encapsulated way.
// 
// create a student validation program in which marks must be between 0-100 considering encapsulation in mind.
/* 
class EmployeeInfo{
    private int EmployeeId;
    private String EmployeeName;
    public void getEmployeeId(){
        System.out.println("Employee Id : "+this.EmployeeId);
        System.out.println("Employee Name: "+this.EmployeeName);
    }

    public void setEmployeeId(int id,String name){
        this.EmployeeId = id;
        this.EmployeeName = name;
    }
}

public class Employee {
    public static void main(String[] args){
        int id = 1345;
        String name = "Sneha";

        EmployeeInfo emp = new EmployeeInfo();
        emp.setEmployeeId(id,name);
        emp.getEmployeeId();
        int EmployeeId = emp.getEmployeeInfo();
        System.out.println("Marks: " + stm);
    }
}
    */

class EmployeeInfo {
    private int employeeId;
    private String employeeName;

    // Setter: Controlled way to update data
    public void setDetails(int id, String name) {
        this.employeeId = id;
        this.employeeName = name;
    }

    // Getter/Display: Controlled way to read data
    public void displayDetails() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
    }
}

public class Employee {
    public static void main(String[] args) {
        // EmployeeInfo emp = new EmployeeInfo();
        // emp.setDetails(1345, "Sneha");
        // emp.displayDetails();
        int id = 1345;
        String name = "Sneha";

        EmployeeInfo emp = new EmployeeInfo();
        emp.setDetails(id, name);
        emp.displayDetails();
    }
}
