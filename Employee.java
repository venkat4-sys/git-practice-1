public class Employee {
  // Private fields to restrict direct access
  private int id;
  private String name;
  private double salary;

  // Public getter for 'id'
  public int getId() {
    return id;
  }

  // Public setter for 'id'
  public void setId(int id) {
    this.id = id;
  }

  // Public getter for 'name'
  public String getName() {
    return name;
  }

  // Public setter for 'name'
  public void setName(String name) {
    this.name = name;
  }

  // Public getter for 'salary'
  public double getSalary() {
    return salary;
  }

  // Public setter for 'salary'
  public void setSalary(double salary) {
    this.salary = salary;
  }
}