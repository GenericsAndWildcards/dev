package test_project;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

//Requirement:
/**

  Goal is to create a in-memory data store For an Organization.
  
  1. Organization consists of Employee, Manager, Department
  2. Each Employee belongs to one Department and reports to one Manager 
  3. Employee and Manager may not be from the same department
  4. Employee has attributes name, age, salary, manager, department
  5. Manager has attributes list of direct reports, name, age, salary, department
  6. Execute below queries on the Data Store created above
      a. findEmployeeByDeptName
      b. findEmployeeByManagerAndSalary
  7. The code should be optimized for the find/read queries and it is ok for write txn to be expensive.

**/

class AppleSolution {
  
  
  public static class Department{
    
    String name;
    
    @Override
    public int hashcode(){
      
    }
    
    @Override
    public boolean equals(){
      // check if all fields are equal logically
    }
    
  }
  
  public static class Employee{
    String name;
    int age;
    long salary;
    Employee manager;
    Department dept;
    
    public Employee(String name, Department dept, int age, long salary){
      
    }
    
    public Employee(String name, Department dept, int age, long salary){
      
    }
    
    @Override
    public int hashcode(){
      
    }
    
    @Override
    public boolean equals(Object o){
      Employee in = (Employee)o;
      // check if all fields are equal logically
    }
    
  }
  
  public static class Organization{
    
    Map<Department, Set<Employee>> orgMap = new HashMap<Department, HashSet<Employee>>();
    Map<Employee, Set<Employee>> managerMap = new HashMap<Employee, HashSet<Employee>>();
    
    public Department addDepartment(String deptName){
      
      Department d = new Department();
      d.name = deptName;
      if(!orgMap.containsKey(d)){
        orgMap.put(d, new HashSet<Employee>());
      }
      return d;      
    }
    
    public Employee addManager(String name, Department dept, int age, long salary){
      
      Employee manager = new Employee(name, dept, age, salary);
      if(!managerMap.containsKey(manager)){
        managerMap.put(manager, new HashSet<Employee>());
        if(orgMap.containsKey(dept)){
          orgMap.put(dept, orgMap.get(dept).add(manager));
        }
      }
      return manager;      
    }
    
    public void addEmployee(String name, Department dept, Employee manager, int age, long salary){
      
      Employee e = new Employee(name, dept,manager, age, salary);
      
      if(orgMap.containsKey(dept)){
          orgMap.put(dept, orgMap.get(dept).add(e));
      }
      
      if(managerMap.containsKey(manager)){
        managerMap.put(manager, managerMap.get(manager).add(e));
      }
           
      
    }
    
    public List<Employee> findEmployeeByDepartmentName(String deptName){
      
      Department d = new Department();
      d.name = deptName;
      
      if(orgMap.containsKey(d)){
        List<Employee> out = Collections.list(orgMap.get(d));
        return out;
      }
      else{
        return null;
      }      
    }
    
    public List<Employee> findEmployeeByManagerAndSalaryGreaterThan(Employee m, long salary){
      
      List<Employee> out = null;
      if(managerMap.containsKey(m)){
        out = new LinkedList<Employee>();
        for(Employee e : managerMap.get(m)){
          if(e.salary > salary){
            out.add(e);
          }
        }
      }
      return out;
    }
    
    
    
  }
  
  
  
  
  public static void main(String[] args) {
    Organization OrgDS= new Organization();
    
    Department Engineer = OrgDS.addDepartment("Engineering Department");
    Department SWTesting = OrgDS.addDepartment("Software Testing");
    Department HWTesting = OrgDS.addDepartment("Hardware  Testing");
    
    Manager Manager1 = OrgDS.addManager("Manager1",Engineer, 25, 120040); //
    Manager Manager2 = OrgDS.addManager("Manager2",SWTesting, 29, 120500);
    Manager Manager3 = OrgDS.addManager("Manager3",SWTesting, 27, 110000);
    
    OrgDS.addEmployee("Employee1",Engineer,Manager1, 29, 80672); // 
    OrgDS.addEmployee("Employee2",Engineer,Manager2, 23, 70224);
    OrgDS.addEmployee("Employee3",HWTesting,Manager3, 22, 60534);
    OrgDS.addEmployee("Employee4",HWTesting,Manager3, 22, 40234);
    OrgDS.addEmployee("Employee5",Engineer,Manager2, 24, 60234);
    OrgDS.addEmployee("Employee6",SWTesting,Manager1, 25, 90234); //
    OrgDS.addEmployee("Employee7",HWTesting,Manager3, 28, 70234);
    
    System.out.println("Employees by Department");
    
    List<Employee> employeesByDept = OrgDS.findEmployeeByDepartmentName("Software Testing");
    
    for(Employee e : employeesByDept) {
      System.out.println(e.name);
    }
    
    System.out.println("Employees by Salary and Manager");
    
    List<Employee> employeesBySalary = OrgDS.findEmployeeByManagerAndSalaryGreaterThan(Manager1,80000);
    
    for(Employee e : employeesBySalary) {
      System.out.println(e.name + " -- " + e.salary);
    }
  }
}
