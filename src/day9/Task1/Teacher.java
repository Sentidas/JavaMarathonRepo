package day9.Task1;

public class Teacher extends Human {

  private String nameClass;


  public Teacher(String name,String nameClass ) {
    super(name);
    this.nameClass = nameClass;
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("Этот преподаватель с именем " + name);
  }

  public String getNameClass() {
    return nameClass;
  }

  public void setNameClass(String nameClass) {
    this.nameClass = nameClass;
  }
}
