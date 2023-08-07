package test1;

public class Employee extends Person2{
    private int employee_id;
    private String department;

    public Employee(){};
    public Employee(String name, int age, char sex, int employee_id, String department) {
        super(name, age, sex);
        this.employee_id = employee_id;
        this.department = department;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String departament) {
        this.department = departament;
    }

    @Override
    public void printMessage(){
        System.out.println("I am a employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", department='" + department + '\'' +
                '}';
    }
}
