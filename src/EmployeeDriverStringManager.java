public class EmployeeDriverStringManager {

    public static void main(String[] args) {

        String[] employees = new String[7];
        employees[0] = "001;Jose;A;20000";
        employees[1] = "002;Jan;B;15000.24";
        employees[2] = "003;Jackie;C;12000.00";
        employees[3] = "004;Jamiey;A;10000.12";
        employees[4] = "005;Jeff;A;20000.01";
        employees[5] = "006;Jessie;A;90000.01";
        employees[6] = "007;Jefferson;C;6000.00";

        EmployeeManager sm2=new EmployeeManager(employees);
        System.out.printf("\n Average Salary of A %s ", sm2.getAverageSalary("A"));
        System.out.printf("\n Average Salary of B %s ", sm2.getAverageSalary("B"));
        System.out.printf("\n Average Salary of C %s ", sm2.getAverageSalary("C"));
        System.out.printf("\n Average Salary of D %s ", sm2.getAverageSalary("D"));
    }
}
