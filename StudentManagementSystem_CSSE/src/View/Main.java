/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Rishni
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form mAIN
     */
//    private Timer tm,tm2;
//    private ActionListener al,al2;
    public Main() {
        initComponents();
        
//        jFacultyButton.setBackground(new Color(0, 0, 0, 0));
//        jFacultyButton.setOpaque(false);
//        
//        
//        
//        al = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                   FacultyMain fm = new FacultyMain();
//                   jDesktopPane1.add(fm);
//                
//            }
//
//        };
//        
//        tm = new Timer(100, al);
//        tm2 = new Timer(100, al2);
////        jDesktopPane1.removeAll();
////        MainInternalAdmin mia= new MainInternalAdmin();
////        jDesktopPane1.add(mia).setVisible(true);
    }
    
    public void facultyMainOpen()
    {
//        jDesktopPane1.removeAll();
//        FacultyMain fm=new FacultyMain();
//        jDesktopPane1.add(fm).setVisible(true);
    }

//    public javax.swing.JDesktopPane getDesktopPane()
//    {
////        return jDesktopPane1;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFacultyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCourseButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jFacultyButton.setText("Faculty");
        jFacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFacultyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jFacultyButton);
        jFacultyButton.setBounds(90, 160, 330, 170);

        jLabel1.setText("pic");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 90, 14);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 40, 460, 14);

        jCourseButton.setText("Course");
        getContentPane().add(jCourseButton);
        jCourseButton.setBounds(900, 170, 320, 160);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1290, 10, 65, 23);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 330, 80);

        jButton2.setText("Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(900, 470, 320, 170);

        jButton3.setText("Exam");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 460, 310, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFacultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFacultyButtonActionPerformed
        // tm.start();
        this.dispose();
        Faculty faculty = new Faculty();
        faculty.setVisible(true);
    }//GEN-LAST:event_jFacultyButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jCourseButton;
    private javax.swing.JButton jFacultyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
