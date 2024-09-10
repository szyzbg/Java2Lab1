public class Main {
    public static void main(String[] args) {
        ManagementSystem ms = new ManagementSystem();
        ms.AddEmployee(new Employee("A",30));
        ms.AddEmployee(new Employee("B",40));
        ms.AddEmployee(new Employee("C",60));
        ms.RemoveEmployee("B");
        ms.AddEmployee(new Employee("A",20));
        ms.AddEmployee(new Employee("D",40));
        ms.DisplayEmployees();
    }
}
