package day9.Task1;

public class Student extends Human {

  private String nameGroup;


  public Student(String name, String nameGroup) {
    super(name);
    this.nameGroup = nameGroup;
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("Этот студент с именем " + name);
  }
  public String getNameGroup() {
    return nameGroup;
  }

  public void setNameGroup(String nameGroup) {
    this.nameGroup = nameGroup;
  }
}
