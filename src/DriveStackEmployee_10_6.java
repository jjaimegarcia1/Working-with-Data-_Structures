import java.util.ArrayDeque;
import java.util.Deque;

public class DriveStackEmployee_10_6 {
    public static void main(String[] args) {
        Deque<Employee> employees = getEmployees();
        showEmployees(employees);
        //Lets fire the last employee added
        Employee last= employees.pop();
        System.out.printf("\n Sorry %s youre gone:%s", last.getName(),last.toString());
        showEmployees(employees);
        Double totSal=getTotalSalary(employees);
        //Output employee that would be fired next but dont fire yet
        Employee top= employees.peek();
        System.out.printf("\n Next person to fire:%s",top.toString());

        String s = reverseThisString("lastClassOfWeek");
    }

    private static String reverseThisString(String lastClassOfWeek) {
        //Write this using a stack (deque) instead of other ways
        String retString = "";
        Deque<Character> theStack=new ArrayDeque<>();
//        for(int i=0; i<lastClassOfWeek.length();i++){
//            //push each character on the stack
//        }
        //reloop and pop each character and append to retString
        return retString;
    }

    private static Double getTotalSalary(Deque<Employee> employees) {
        Double retSal=0.0;
        for (Employee e:employees){
            retSal+=e.getSalary();
        }
        return retSal;
    }

    private static void showEmployees(Deque<Employee> employees) {
        for(Employee e:employees){
            System.out.printf("\n e:%s", e.toString());
        }
    }

    private static Deque<Employee> getEmployees() {
        Deque<Employee> employees = new ArrayDeque<>();
        employees.push( new Employee(1, "Abby", 100000.00));
        employees.push( new Employee(2, "Baker", 50000.00));
        employees.push( new Employee(3, "Cathy", 60000.00));
        employees.push( new Employee(4, "Dwithe", 150000.00));
        return employees;
    }

}
