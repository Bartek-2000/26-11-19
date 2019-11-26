import java.util.Objects;

public class Employee {
    private String name;
    private String surename;
    private float salery;


    public Employee(String name, String surename, float salery) {
        this.name = name;
        this.surename = surename;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public float getSalery() {
        return salery;
    }

    public void setSalery(float salery) {
        this.salery = salery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salery, salery) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surename, employee.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, salery);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", salery=" + salery +
                '}';
    }
}
