// @author Sewmi, Rishni
package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_AdminFaculty = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_StudentsExams = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_AdminStudents = new javax.swing.JButton();
        btn_AdminExam = new javax.swing.JButton();
        btn_AdminCourse = new javax.swing.JButton();
        btn_StudentsViewProfile = new javax.swing.JButton();
        btn_StudentsFaculty = new javax.swing.JButton();
        btn_StudentsCouerse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1499, 762));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        btn_AdminFaculty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminFaculty.setText("Faculty");
        btn_AdminFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminFacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AdminFaculty);
        btn_AdminFaculty.setBounds(20, 370, 280, 80);

        jLabel1.setText("pic");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 90, 14);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Management System Home Panels");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 460, 30);

        btn_StudentsExams.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_StudentsExams.setText("View Exams");
        getContentPane().add(btn_StudentsExams);
        btn_StudentsExams.setBounds(380, 370, 280, 80);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1050, 30, 110, 23);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 330, 80);

        btn_AdminStudents.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminStudents.setText("Student Details (Add/ Delete/ Update/ Search)");
        btn_AdminStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AdminStudents);
        btn_AdminStudents.setBounds(20, 290, 280, 80);

        btn_AdminExam.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminExam.setText("Exam");
        btn_AdminExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminExamActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AdminExam);
        btn_AdminExam.setBounds(20, 210, 280, 80);

        btn_AdminCourse.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminCourse.setText("Course");
        btn_AdminCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminCourseActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AdminCourse);
        btn_AdminCourse.setBounds(20, 130, 280, 80);

        btn_StudentsViewProfile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_StudentsViewProfile.setText("View My Profile");
        btn_StudentsViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StudentsViewProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StudentsViewProfile);
        btn_StudentsViewProfile.setBounds(380, 130, 280, 80);

        btn_StudentsFaculty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_StudentsFaculty.setText("View Faculty");
        btn_StudentsFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StudentsFacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StudentsFaculty);
        btn_StudentsFaculty.setBounds(380, 210, 280, 80);

        btn_StudentsCouerse.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_StudentsCouerse.setText("View Courses");
        btn_StudentsCouerse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StudentsCouerseActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StudentsCouerse);
        btn_StudentsCouerse.setBounds(380, 290, 280, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //rishni
    private void btn_AdminFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminFacultyActionPerformed
        // tm.start();
        this.dispose();
        FacultyMain facultymain;
        facultymain = new FacultyMain();
        facultymain.setVisible(true);
    }//GEN-LAST:event_btn_AdminFacultyActionPerformed
//logout button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login logOut = new Login();
        logOut.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_AdminExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AdminExamActionPerformed
//Admin - student add delete update    
    private void btn_AdminStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminStudentsActionPerformed
        this.dispose();
        Student stu = new Student();
        stu.setVisible(true);
    }//GEN-LAST:event_btn_AdminStudentsActionPerformed
//Student - view Profile
    public static String Nic;
    private void btn_StudentsViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StudentsViewProfileActionPerformed
        String nic = Nic;
        this.dispose();
        Cou_Dep_Pro stu = new Cou_Dep_Pro();
        stu.setVisible(true);
        try{
        ResultSet resSet1=Controller.Controller_View_DPC.ViewProfile(nic);
        Cou_Dep_Pro.dt_View_C_D_P.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_btn_StudentsViewProfileActionPerformed
//Student - View Faculty
    private void btn_StudentsFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StudentsFacultyActionPerformed
        this.dispose();
        Cou_Dep_Pro stu = new Cou_Dep_Pro();
        stu.setVisible(true);
        try{
        ResultSet resSet1=Controller.Controller_View_DPC.ViewDepartment();
        Cou_Dep_Pro.dt_View_C_D_P.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_btn_StudentsFacultyActionPerformed
//Student - View Course
    private void btn_StudentsCouerseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StudentsCouerseActionPerformed
        this.dispose();
        Cou_Dep_Pro stu = new Cou_Dep_Pro();
        stu.setVisible(true);
        try{
        ResultSet resSet1=Controller.Controller_View_DPC.ViewCourse();
        Cou_Dep_Pro.dt_View_C_D_P.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_btn_StudentsCouerseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        if(Constants.Color.userName .equals("Admin")){
            btn_StudentsViewProfile.setEnabled(false);
            btn_StudentsCouerse.setEnabled(false);
            btn_StudentsExams.setEnabled(false);
            btn_StudentsFaculty.setEnabled(false);
        }else if(Constants.Color.userName .equals("Student")){
            btn_AdminStudents.setEnabled(false);
            btn_AdminCourse.setEnabled(false);
            btn_AdminExam.setEnabled(false);
            btn_AdminFaculty.setEnabled(false);
        }
    }//GEN-LAST:event_formComponentShown

    private void btn_AdminCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AdminCourseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_AdminCourse;
    public javax.swing.JButton btn_AdminExam;
    public javax.swing.JButton btn_AdminFaculty;
    public javax.swing.JButton btn_AdminStudents;
    public javax.swing.JButton btn_StudentsCouerse;
    public javax.swing.JButton btn_StudentsExams;
    public javax.swing.JButton btn_StudentsFaculty;
    public javax.swing.JButton btn_StudentsViewProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
