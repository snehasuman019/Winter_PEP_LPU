/* 
// create a student validation program in which marks must be between 0-100 considering encapsulation in mind.
class Validation{
    private int stu_marks;
    public int getStu_marks(){
        return this.stu_marks;
    }
    public void setStu_marks(int m){
        this.stu_marks = m;
    }
}

public class StudentValidation {
    public static void main(String[] args){
        int marks = 90;
        Validation v = new Validation();
        v.setStu_marks(marks);
        int stm = v.getStu_marks();
        System.out.println("Marks: " + stm);
    }
}
*/

// 
// create a student validation program in which marks must be between 0-100 considering encapsulation in mind.

class Student {
    private String name;
    private int marks;

    // Setter with validation logic
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("Error: Marks must be between 0 and 100. Update failed.");
        }
    }

    public int getMarks() {
        return this.marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class StudentValidation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Rahul");

        // Attempting to set valid marks
        st.setMarks(85); 
        
        // Attempting to set invalid marks
        st.setMarks(105); 

        System.out.println(st.getName() + "'s Final Marks: " + st.getMarks());
    }
}