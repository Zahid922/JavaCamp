package HomeWork;

public class StudentManager  {

   
    public void Login(User user) {
        System.out.println(user.getUserName() + " adlı öğrenci oturum açtı.");

    }

    public void TakeCourse() {
        System.out.println("Kurs kurslarıma eklendi.");
    }

    public void RemoveCourse() {
        System.out.println("Kurs kurslarımdan kaldırıldı");
    }
}
