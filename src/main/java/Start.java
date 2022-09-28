import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

    public static void main(String[] args) throws IOException {
        System.out.println("welcome to student management app");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("press 1 to add student");
            System.out.println("press 2 to delete");
            System.out.println("press 3 to display");
            System.out.println("press 4 to exit");

            int c=Integer.parseInt(br.readLine());

            if(c==1){
                System.out.println("enter student name");
                String name=br.readLine();

                System.out.println("enter student phone");
                String phone=br.readLine();

                System.out.println("enter student city");
                String city=br.readLine();

                Student st=new Student(name, phone, city);
                boolean ans= StudentDao.insertStudentToDB(st);
                if(ans){
                    System.out.println("Successful");
                }else {
                    System.out.println("failed");
                }
            }
            else if(c==2){

            }
            else if(c==3){

            }
            else if(c==4){
                break;
            }
            else{

            }

        }
    }
}
