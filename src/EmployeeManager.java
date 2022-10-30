public class EmployeeManager {
    String[] inString;
    public EmployeeManager( String[] inString ){
        this.inString = inString;
    }
    public double getAverageSalary( String empLevel ) {
        int ctr=0;
        double sum=0;
        double averagesalary=0;
        for (String employees : inString) {
            String[] toks = employees.split(";");
            String read= toks[2];
            try {
                if(read.equals(empLevel)) {
                    sum += Double.parseDouble(toks[3]);
                    ctr++;
                    averagesalary=(sum/ctr);
                }

            }
            catch (Exception e) {
                System.out.printf("\n Illegal Line:%s", employees);
            }
        }
        return averagesalary;
    }
}
