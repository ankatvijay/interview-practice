package com.ankat.interitance.company;

// Employee Class with type, name attributes
class Employee {
    private String type;
    private String name;

    Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

// Company has two static fields, and two methods which increment
// the fields.  Leaving them public for demonstration purposes
class Company {
    public static int branchCount;
    public static int employeeCount;

    public void addEmployee(Employee e) {
        employeeCount++;
    }

    public void addBranch(Branch b) {
        branchCount++;
    }

    static {
        System.out.println("Company Static Initializer");
        branchCount = 10;
    }
}

// Company is a subclass of Branch
class Branch extends Company {
    private String branchName = "unspecified";
    public int branchCount;
    public int employeeCount;

    Branch(String branchName) {
        this.branchName = branchName;
    }

    {
        System.out.println("Branch Static Initializer");
        employeeCount = 200;
    }

    public void addEmployee(Employee e) {
        employeeCount++;
    }
}

public class OnBoardBranch {
    public static void main(String[] args) {

        // Create some objects
        Branch b = new Branch("RedBranch");
        Employee e1 = new Employee("Carol", "President");
        Employee e2 = new Employee("Ralph", "Vice President");
        Company main = new Company();

        // Execute the methods that should effect the static fields.
        main.addBranch(b);
        b.addEmployee(e1);
        b.addEmployee(e2);

        // The static variable defined on Company accessed here
        System.out.println("Number of Branches = " + Company.branchCount);
        System.out.println("Number of Employees = " + Company.employeeCount);

        // What does it mean to access the static variables from Branch?
        System.out.println("Call from Branch: Number of Branches = " +
                b.branchCount);
        System.out.println("Call from Branch: Number of Employees = " +
                b.employeeCount);
    }
}
