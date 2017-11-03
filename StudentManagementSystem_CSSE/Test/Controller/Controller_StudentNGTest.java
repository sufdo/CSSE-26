package Controller;
import Model.Model_Student;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Sewmi
 */
public class Controller_StudentNGTest {
    
    public Controller_StudentNGTest() {
    }
    public int SID = 0;
    //Test For add Student
    @Test
    public void testInsert() {
        Model_Student Student = new Model_Student("Raju", "pereraa", "923013018V", 13, 6, 75278570);
        try {
            Assert.assertTrue(Controller_Student.AddStudent(Student));
            SID = Controller_Student.retLastID();
        }catch(Exception ex){};
    }
   
    @Test
    public void testUpdate() {
        Model_Student UpStudent = new Model_Student("Vijay", "pereraa", "923013018V", 13, 6, 75278570);
           try {
            //int StuID = Controller_Student.retLastID();
            Assert.assertTrue(Controller_Student.UpdateStudent(UpStudent,Integer.toString(SID)));
        }catch(Exception ex){};
    }
    
    @Test
    public void testDelete() {
        try {
            //int StuID = Controller_Student.retLastID();
            Assert.assertTrue(Controller_Student.DeleteStudent(Integer.toString(SID)));
        }catch(Exception ex){};
    }
}
