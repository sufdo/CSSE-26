// @author Sewmi, Rishni
//testing
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_StudentsViewProfile = new javax.swing.JButton();
        btn_AdminFaculty = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_AdminStudents = new javax.swing.JButton();
        btn_AdminExam = new javax.swing.JButton();
        btn_AdminCourse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/newww.PNG"))); // NOI18N

        btn_StudentsViewProfile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_StudentsViewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/My Profile.JPG"))); // NOI18N
        btn_StudentsViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StudentsViewProfileActionPerformed(evt);
            }
        });

        btn_AdminFaculty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminFaculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Faculty.JPG"))); // NOI18N
        btn_AdminFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminFacultyActionPerformed(evt);
            }
        });



        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/NLogOut.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_AdminStudents.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/StudentNew.JPG"))); // NOI18N
        btn_AdminStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminStudentsActionPerformed(evt);
            }
        });

        btn_AdminExam.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Exams.JPG"))); // NOI18N
        btn_AdminExam.setPreferredSize(new java.awt.Dimension(233, 211));
        btn_AdminExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminExamActionPerformed(evt);
            }
        });

        btn_AdminCourse.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_AdminCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Courses.JPG"))); // NOI18N
        btn_AdminCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdminCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btn_AdminFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AdminStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AdminExam, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AdminCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_StudentsViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_AdminFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_AdminStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_AdminExam, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_AdminCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_StudentsViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1510, 770);

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
        this.dispose();
        marks marks = new marks();
        marks.setVisible(true);
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
        Students_View stu = new Students_View();
        stu.setVisible(true);
           //JOptionPane.showMessageDialog(null, "ERROR : " + nic);
        try{
        ResultSet resSet1=Controller.Controller_StudentViews.ViewProfile(nic);
        
        Students_View.dt_View_C_D_P.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        Students_View.tf_VID.setText(Students_View.dt_View_C_D_P.getValueAt(0, 0).toString());
        Students_View.tf_VFName.setText(Students_View.dt_View_C_D_P.getValueAt(0, 1).toString());
        Students_View.tf_VLName.setText(Students_View.dt_View_C_D_P.getValueAt(0, 2).toString());
        Students_View.tf_Nic.setText(Students_View.dt_View_C_D_P.getValueAt(0, 3).toString());
        Students_View.tf_Phone.setText(Students_View.dt_View_C_D_P.getValueAt(0, 4).toString());
        Students_View.tf_Course.setText(Students_View.dt_View_C_D_P.getValueAt(0, 5).toString());
        Students_View.tf_VDep.setText(Students_View.dt_View_C_D_P.getValueAt(0, 6).toString());
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
        
        try{
        ResultSet resSet1=Controller.Controller_View_DPC.ViewCourse();
        Cou_Dep_Pro.dt_View_C_D_P.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_btn_StudentsCouerseActionPerformed


//Student - View Course
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        if(Constants.LoginUserType.userName .equals("Admin")){
            btn_StudentsViewProfile.setEnabled(false);
            
        }else if(Constants.LoginUserType.userName .equals("Student")){
            btn_AdminStudents.setEnabled(false);
            btn_AdminCourse.setEnabled(false);
            btn_AdminExam.setEnabled(false);
            btn_AdminFaculty.setEnabled(false);
        }
    }//GEN-LAST:event_formComponentShown

    private void btn_AdminCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdminCourseActionPerformed
        
        this.dispose();
        Courses stu = new Courses();
        stu.setVisible(true);
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
    public javax.swing.JButton btn_StudentsViewProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
