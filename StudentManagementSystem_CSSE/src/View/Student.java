//@author sewmi
package View;
import Model.Model_Student;
import Controller.Controller_Student;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Student extends javax.swing.JFrame {
    static Connection dbConn=null;
    /** Creates new form Student */
    public Student(){
        initComponents();
        
        try{
        //Load the Data Table in Main Form Search For Default
        ResultSet resSet1=Controller_Student.FillStuDataTable();
        dt_Search.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        } catch (SQLException ex) {
                   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_StudentAdd = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_FilterType = new javax.swing.JComboBox();
        tf_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dt_Search = new javax.swing.JTable();
        btn_Search = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        pn_Add = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_fName = new javax.swing.JTextField();
        tf_lName = new javax.swing.JTextField();
        tf_nic = new javax.swing.JTextField();
        tf_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmb_course_add = new javax.swing.JComboBox();
        cmb_Add_department = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btn_Ad_Save = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        dt_Add = new javax.swing.JTable();
        btn_Back2 = new javax.swing.JButton();
        pn_Update = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_Ed_Search = new javax.swing.JTextField();
        btn_Edit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmb_Ed_department = new javax.swing.JComboBox();
        cmb_Ed_course = new javax.swing.JComboBox();
        tf_Ed_phone = new javax.swing.JTextField();
        tf_Ed_nic = new javax.swing.JTextField();
        tf_Ed_lName = new javax.swing.JTextField();
        tf_Ed_Name = new javax.swing.JTextField();
        tf_Ed_Sid = new javax.swing.JTextField();
        btn_Ed_Save = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        dt_editV = new javax.swing.JTable();
        btn_Back3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_del_find = new javax.swing.JButton();
        tf_del_Id = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btn_Dt_Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dt_delete = new javax.swing.JTable();
        btn_Back1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tp_StudentAdd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Filter By");

        cmb_FilterType.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cmb_FilterType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "StudentID", "FirstName", "LastName", "Nic", "Phone", "Department", "Course" }));
        cmb_FilterType.setName("cmb_FilterType"); // NOI18N

        tf_Search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_Search.setName("tf_FilterValues"); // NOI18N

        dt_Search.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dt_Search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(dt_Search);

        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.JPG"))); // NOI18N
        btn_Search.setName("btn_Search"); // NOI18N
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/clear.PNG"))); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.setName("btn_Search"); // NOI18N
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back.JPG"))); // NOI18N
        btn_Back.setName("btn_Search"); // NOI18N
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Print.JPG"))); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_FilterType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_FilterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Search)
                    .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );

        tp_StudentAdd.addTab("Search", jPanel1);

        pn_Add.setBackground(new java.awt.Color(255, 255, 255));
        pn_Add.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pn_AddComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Fill The Details");

        tf_fName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_lName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_nic.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_phone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("NIC");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Phone");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("First Name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Course");

        cmb_course_add.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cmb_Add_department.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Department");

        btn_Ad_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Save.JPG"))); // NOI18N
        btn_Ad_Save.setToolTipText("");
        btn_Ad_Save.setName("btn_Search"); // NOI18N
        btn_Ad_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ad_SaveActionPerformed(evt);
            }
        });

        dt_Add.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dt_Add.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(dt_Add);

        btn_Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back.JPG"))); // NOI18N
        btn_Back2.setName("btn_Search"); // NOI18N
        btn_Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_AddLayout = new javax.swing.GroupLayout(pn_Add);
        pn_Add.setLayout(pn_AddLayout);
        pn_AddLayout.setHorizontalGroup(
            pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_AddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_AddLayout.createSequentialGroup()
                        .addComponent(btn_Ad_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_Back2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_AddLayout.createSequentialGroup()
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pn_AddLayout.createSequentialGroup()
                                .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_course_add, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_fName)
                                    .addComponent(tf_lName, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(tf_nic, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(tf_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(cmb_Add_department, 0, 129, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        pn_AddLayout.setVerticalGroup(
            pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_AddLayout.createSequentialGroup()
                .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_AddLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_course_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Add_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(pn_AddLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(pn_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Ad_Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Back2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        tp_StudentAdd.addTab("Add Details", pn_Add);

        pn_Update.setBackground(new java.awt.Color(255, 255, 255));
        pn_Update.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pn_UpdateComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Student id");

        tf_Ed_Search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_Ed_Search.setName("tf_FilterValues"); // NOI18N

        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit.PNG"))); // NOI18N
        btn_Edit.setName("btn_Search"); // NOI18N
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Student Id");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("First Name");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Last Name");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("NIC");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("Phone");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setText("Course");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setText("Department");

        cmb_Ed_department.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cmb_Ed_course.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_Ed_phone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_Ed_nic.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_Ed_lName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_Ed_Name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tf_Ed_Sid.setEditable(false);
        tf_Ed_Sid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btn_Ed_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Update.JPG"))); // NOI18N
        btn_Ed_Save.setName("btn_Search"); // NOI18N
        btn_Ed_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ed_SaveActionPerformed(evt);
            }
        });

        dt_editV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dt_editV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(dt_editV);

        btn_Back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back.JPG"))); // NOI18N
        btn_Back3.setName("btn_Search"); // NOI18N
        btn_Back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Back3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_UpdateLayout = new javax.swing.GroupLayout(pn_Update);
        pn_Update.setLayout(pn_UpdateLayout);
        pn_UpdateLayout.setHorizontalGroup(
            pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_UpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_UpdateLayout.createSequentialGroup()
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(32, 32, 32)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_Ed_course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_Ed_Sid)
                            .addComponent(tf_Ed_Name)
                            .addComponent(tf_Ed_lName)
                            .addComponent(tf_Ed_nic)
                            .addComponent(tf_Ed_phone)
                            .addComponent(cmb_Ed_department, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addGroup(pn_UpdateLayout.createSequentialGroup()
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_UpdateLayout.createSequentialGroup()
                                .addComponent(btn_Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btn_Ed_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(pn_UpdateLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Ed_Search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pn_UpdateLayout.setVerticalGroup(
            pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_UpdateLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_UpdateLayout.createSequentialGroup()
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(tf_Ed_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_Ed_Sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Ed_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Ed_lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Ed_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Ed_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Ed_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Ed_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(30, 30, 30)
                        .addGroup(pn_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Back3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Ed_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        tp_StudentAdd.addTab("Edit Details", pn_Update);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setEnabled(false);

        btn_del_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.JPG"))); // NOI18N
        btn_del_find.setName("btn_Search"); // NOI18N
        btn_del_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_del_findActionPerformed(evt);
            }
        });

        tf_del_Id.setName("tf_FilterValues"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setText("Student id");

        btn_Dt_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Delete.JPG"))); // NOI18N
        btn_Dt_Delete.setName("btn_Search"); // NOI18N
        btn_Dt_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Dt_DeleteActionPerformed(evt);
            }
        });

        dt_delete.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dt_delete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(dt_delete);

        btn_Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Back.JPG"))); // NOI18N
        btn_Back1.setName("btn_Search"); // NOI18N
        btn_Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_del_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_del_find, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_Dt_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 158, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tf_del_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_del_find, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Dt_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        tp_StudentAdd.addTab("Delete Details", jPanel4);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/asd.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_StudentAdd)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tp_StudentAdd)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    static PreparedStatement preSt=null;
    static ResultSet resSet=null;    
    
//Search - search button
    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        String filterType = "";
        filterType = (String)cmb_FilterType.getSelectedItem();
        String filterValue = ""; 
        filterValue = tf_Search.getText();  
        try{
            ResultSet resSet=Controller_Student.FillStuDt_Ser(filterType,filterValue );
            dt_Search.setModel(DbUtils.resultSetToTableModel(resSet)); 
        }catch(SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_btn_SearchActionPerformed
//Update - edit button
    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        String Sid = tf_Ed_Search.getText();
        try{
            ResultSet resSet=Controller_Student.FillStuDt_Ser("StudentID",Sid );
            dt_editV.setModel(DbUtils.resultSetToTableModel(resSet)); 
            
            //initilize value from data table
            String id=dt_editV.getValueAt(0, 0).toString();
            String fName=dt_editV.getValueAt(0, 1).toString();
            String lName=dt_editV.getValueAt(0, 2).toString();
            String nic=dt_editV.getValueAt(0, 3).toString();
            String phone=dt_editV.getValueAt(0, 4).toString();
            String course=dt_editV.getValueAt(0, 5).toString();
            String department=dt_editV.getValueAt(0, 6).toString();
            //assighn the value to the form
            tf_Ed_Sid.setText(id);
            tf_Ed_Name.setText(fName);
            tf_Ed_lName.setText(lName);
            tf_Ed_nic.setText(nic);
            tf_Ed_phone.setText(phone);
            cmb_Ed_course.setSelectedItem(course);
            cmb_Ed_department.setSelectedItem(department);
       }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_btn_EditActionPerformed
//Update - save button
    private void btn_Ed_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ed_SaveActionPerformed
        boolean upd = true;
        if(tf_Ed_Name.getText().equals("")){
            upd=false;
        }
        if(tf_Ed_lName.getText().equals("")){
            upd=false;
        }
        if(tf_Ed_nic.getText().equals("")){
            upd=false;
        }
        if(tf_Ed_phone.getText().equals("")){
            upd=false;
        }
          
        if(upd==false){
            JOptionPane.showMessageDialog(null, "Fill the All Details");
        }else
        {
            String sId = tf_Ed_Sid.getText();
            String fName = tf_Ed_Name.getText();
            String lName = tf_Ed_lName.getText();
            String Nic = tf_Ed_nic.getText();
            int Phone =  Integer.parseInt(tf_Ed_phone.getText());
            String course = cmb_Ed_course.getSelectedItem().toString();
            String Department = cmb_Ed_department.getSelectedItem().toString();
            try
            {
                int CourseId = Controller_Student.retCourseID(course);
                int FacultyId = Controller_Student.retDepartmentID(Department);
                Model_Student Student = new Model_Student(fName, lName, Nic, CourseId, FacultyId, Phone);
                Controller_Student.UpdateStudent(Student, sId);
                JOptionPane.showMessageDialog(null, "Student Details Update Successfully.");
                ResultSet resSet1=Controller_Student.FillStuDataTable();
                dt_editV.setModel(DbUtils.resultSetToTableModel(resSet1));
                tf_Ed_Name.setText("");
                tf_Ed_lName.setText("");
                tf_Ed_nic.setText("");
                tf_Ed_phone.setText("");
            }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
        }
    }
//Add - Save button
    private void btn_Ad_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ad_SaveActionPerformed
        boolean upd = true;
        if(tf_fName.getText().equals("")){
            upd=false;
        }
        if(tf_lName.getText().equals("")){
            upd=false;
        }
        if(tf_nic.getText().equals("")){
            upd=false;
        }
        if(tf_phone.getText().equals("")){
            upd=false;
        }
            
        if(upd==false){
            JOptionPane.showMessageDialog(null, "Fill the All Details");
        }else{
           //JOptionPane.showMessageDialog(null, "work");
           
            String fName = tf_fName.getText();
            String lName = tf_lName.getText();
            String Nic = tf_nic.getText();
            int Phone =  Integer.parseInt(tf_phone.getText());
            String course = cmb_course_add.getSelectedItem().toString();
            String Department = cmb_Add_department.getSelectedItem().toString();
            
            

            try
            {
            int CourseId = Controller_Student.retCourseID(course);
            int FacultyId = Controller_Student.retDepartmentID(Department);
            if(Controller_Student.hasDupEntry(Nic)==false){
                Model_Student Student = new Model_Student(fName, lName, Nic, CourseId, FacultyId, Phone);
                Controller_Student.AddStudent(Student);
                int SaveID = Controller_Student.retLastID();
                JOptionPane.showMessageDialog(null, "Student Details Added Successfully. \n Student ID : '"+ SaveID +"'");
                tf_fName.setText("");
                tf_lName.setText("");
                tf_nic.setText("");
                tf_phone.setText("");
                    ResultSet resSet1=Controller_Student.FillStuDataTable();
                    dt_Add.setModel(DbUtils.resultSetToTableModel(resSet1)); 
            }
            else{
               JOptionPane.showMessageDialog(null, "Already Added Entry Check Again!");
            }
            }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR1 : " + exc);}
        }
    }//GEN-LAST:event_btn_Ad_SaveActionPerformed
//DELETE - find button
    private void btn_del_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_del_findActionPerformed
        String Sid = tf_del_Id.getText();
        try{
            ResultSet resSet3=Controller_Student.FillStuDt_Ser("StudentID",Sid);
            dt_delete.setModel(DbUtils.resultSetToTableModel(resSet3)); 
        }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}       
    }//GEN-LAST:event_btn_del_findActionPerformed
//DELETE - delete button
    private void btn_Dt_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Dt_DeleteActionPerformed
        String Sid = tf_del_Id.getText();
        try{
            Controller_Student.DeleteStudent(Sid);
            ResultSet resSet7=Controller_Student.FillStuDt_Ser("StudentID",Sid);
            dt_delete.setModel(DbUtils.resultSetToTableModel(resSet7)); 
            JOptionPane.showMessageDialog(null, " Sid"+ Sid+"Student Details Deleted Successfully.");
        }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}           
    }//GEN-LAST:event_btn_Dt_DeleteActionPerformed
//ADD - load cmb datas
    private void pn_AddComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pn_AddComponentShown
      //correct one
        dbConn=DBConnect.connect();
        cmb_course_add.removeAllItems();
        cmb_Add_department.removeAllItems();
        try{
            String query="SELECT CourseName FROM course;";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery(query);
            while (resSet.next()) {
                String pat = resSet.getString("CourseName");
                cmb_course_add.addItem(pat);
            }
            String query2="SELECT FacultyName FROM Faculty;";
            preSt=dbConn.prepareStatement(query2);
            resSet=preSt.executeQuery(query2);
            while (resSet.next()) {
                String pat = resSet.getString("FacultyName");
                cmb_Add_department.addItem(pat);
            }   
       }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_pn_AddComponentShown
//UPDATE - load cmb datas
    private void pn_UpdateComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pn_UpdateComponentShown
    dbConn=DBConnect.connect();
        cmb_Ed_course.removeAllItems();
        cmb_Ed_department.removeAllItems();
        try{
            String query="SELECT CourseName FROM course;";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery(query);
            while (resSet.next()) {
                String pat = resSet.getString("CourseName");
                cmb_Ed_course.addItem(pat);
            }
            String query2="SELECT FacultyName FROM Faculty;";
            preSt=dbConn.prepareStatement(query2);
            resSet=preSt.executeQuery(query2);
            while (resSet.next()) {
                String pat = resSet.getString("FacultyName");
                cmb_Ed_department.addItem(pat);
            }   
       }catch (SQLException exc){JOptionPane.showMessageDialog(null, "ERROR : " + exc);}
    }//GEN-LAST:event_pn_UpdateComponentShown

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
         try{
        //Load the Data Table in Main Form Search For Default
        ResultSet resSet1=Controller_Student.FillStuDataTable();
        dt_Search.setModel(DbUtils.resultSetToTableModel(resSet1)); 
        } catch (SQLException ex) {}
                   
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.dispose();
        Main adminMain = new Main();
        adminMain.setVisible(true);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Back1ActionPerformed
        this.dispose();
        Main adminMain = new Main();
        adminMain.setVisible(true);
    }//GEN-LAST:event_btn_Back1ActionPerformed

    private void btn_Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Back2ActionPerformed
         this.dispose();
        Main adminMain = new Main();
        adminMain.setVisible(true);
    }//GEN-LAST:event_btn_Back2ActionPerformed

    private void btn_Back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Back3ActionPerformed
         this.dispose();
        Main adminMain = new Main();
        adminMain.setVisible(true);
    }//GEN-LAST:event_btn_Back3ActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try{
        dt_Search.print();}
        catch(Exception ex){}        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed

//GEN-FIRST:event_btn_Ed_SaveActionPerformed
 
//GEN-LAST:event_btn_Ed_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws SQLException {
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  try{
                new Student().setVisible(true);
              //  } catch (SQLException ex) {
                   
               // }
            }
        });
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ad_Save;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Back1;
    private javax.swing.JButton btn_Back2;
    private javax.swing.JButton btn_Back3;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Dt_Delete;
    private javax.swing.JButton btn_Ed_Save;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_del_find;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox cmb_Add_department;
    private javax.swing.JComboBox cmb_Ed_course;
    private javax.swing.JComboBox cmb_Ed_department;
    private javax.swing.JComboBox cmb_FilterType;
    private javax.swing.JComboBox cmb_course_add;
    private javax.swing.JTable dt_Add;
    private javax.swing.JTable dt_Search;
    private javax.swing.JTable dt_delete;
    private javax.swing.JTable dt_editV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pn_Add;
    private javax.swing.JPanel pn_Update;
    private javax.swing.JTextField tf_Ed_Name;
    private javax.swing.JTextField tf_Ed_Search;
    private javax.swing.JTextField tf_Ed_Sid;
    private javax.swing.JTextField tf_Ed_lName;
    private javax.swing.JTextField tf_Ed_nic;
    private javax.swing.JTextField tf_Ed_phone;
    private javax.swing.JTextField tf_Search;
    private javax.swing.JTextField tf_del_Id;
    private javax.swing.JTextField tf_fName;
    private javax.swing.JTextField tf_lName;
    private javax.swing.JTextField tf_nic;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTabbedPane tp_StudentAdd;
    // End of variables declaration//GEN-END:variables

}
