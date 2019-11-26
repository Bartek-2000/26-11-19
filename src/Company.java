import java.util.HashMap;

public class Company {

    private HashMap<String, Employee> employees = new HashMap<>();

    public boolean add(Employee employee) {
        String key = employee.getName() + " " + employee.getSurename();

        if (employees.get(key) != null) return false;
        else {
            employees.put(key, employee);
            return true;
        }

    }

    public Employee get(String name, String surename) {
        String key = name + " " + surename;
        return employees.get(key);
    }


}
