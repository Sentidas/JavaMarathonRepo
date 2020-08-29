package day6;

public class Professor {
  private String fio;
  private String lesson;


  public Professor(String fio, String lesson) {
    this.fio = fio;
    this.lesson = lesson;
  }

  public void grade(Student student) {
    int grade = (int) Math.ceil(Math.random() * 4 + 2);
    System.out.println(grade);
     String gradeWord = null;
    switch (grade) {
      case 2: gradeWord = "неудовлетворительно";
      break;
      case 3: gradeWord = "удовлетворительно";
      break;
      case 4: gradeWord = "хорошо";
      break;
      case 5:  gradeWord = "отлично";
      break;
      }
      System.out.println("Преподаватель " + fio + " оценил студента с именем "
              + student.fio + " по предмету '" + lesson + "' на оценку: " + gradeWord);

  }
}
