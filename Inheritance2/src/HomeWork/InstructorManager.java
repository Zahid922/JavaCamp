package HomeWork;

public class InstructorManager {

    public void GiveCourse(){
        System.out.println("Kurs sisteme yüklendi");
    }
    public void Login(User user){
        System.out.println(user.getUserName() + " adlı eğitmen oturum açtı.");
 
    }
    public void DeleteCourse(){
        System.out.println("Kurs sistemden kaldırıldı.");

    }
}
