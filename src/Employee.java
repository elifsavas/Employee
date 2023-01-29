public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String name () {
        return this.name ;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0.0 ;
    }

    public double bonus() {
        int extraHours = this.workHours - 45 ;
        if (extraHours>0) {
            return extraHours * 30;
        }
        return 0.0 ;
    }

    public double raiseSalary() {
        int year = 2023 - this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        } else if (year > 10 && year < 20) {
            return this.salary * 0.1;
        } else
            return this.salary * 0.15;

    }

    public void toString (Employee emp) {
        System.out.println("Name : " + this.name);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Raise of Salary : " + this.raiseSalary());

        double totalSalary = this.salary - this.tax() + this.bonus();
        System.out.println("Total Salary : " + totalSalary);
        System.out.println("Salary with raise : " + (this.salary + this.raiseSalary()));
    }
}
