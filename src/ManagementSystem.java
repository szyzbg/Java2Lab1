import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManagementSystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void AddEmployee(Employee e){
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).name.equals(e.name)){
                return;
            }
        }
        employees.add(e);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return CharSequence.compare(o1.name,o2.name);
            }
        });
        }

    public void RemoveEmployee(String name){
        for(Employee e: employees){
            if(e.name.equals(name)){
                employees.remove(e);
            }
        }
    }
    public void DisplayEmployees(){
        for(Employee e: employees){
            System.out.println(e);
        }
    }


}