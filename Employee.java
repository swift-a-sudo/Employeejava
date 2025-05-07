public class Employee {
    String name;
    int id;
    double salary;
    String country;
    public Employee(String name,int id,double salary,String country){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.country=country;

    } 
    public void displayInfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Country: "+country);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, "India");
        emp1.displayInfo();
    }
}