package HomeWork;

public class Main {

    public static void main(String[] args) {
        User a = new Instructor("Zahid", "12345");
        User b = new Student("Ali" ,"465");
        User c = new Student("Ayşe" ,"987");
        User[] users = {a,b,c};
        for (User user : users) {
            System.out.println(user.getUserName());
            System.out.println(user.getPassword());
        }
        InstructorManager ınstructorManager = new InstructorManager();
        ınstructorManager.Login(a);
        StudentManager studentManager= new StudentManager();
        studentManager.Login(b);
        UserManager userManager = new UserManager();
        userManager.Login(c);
        studentManager.TakeCourse();
        studentManager.RemoveCourse();
        ınstructorManager.DeleteCourse();
        ınstructorManager.GiveCourse();
        
    }

}
