/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public final class Management extends javax.swing.JFrame {

    /**
     * Creates new form login2
     */
    public Management(){ //throws SQLException, ClassNotFoundException {
        initComponents();
        connect();
        Loadlist();
        Loadlist2();
       
       
    }
 Connection conn;
 PreparedStatement pst;
 ResultSet rst;
 DefaultTableModel table_model;
 DefaultTableModel table_model2;
public void connect() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn= DriverManager.getConnection("jdbc:mysql://localhost/management", "root","");
        System.out.println("connected");
    }   catch (ClassNotFoundException | SQLException ex) {
         Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
}

   public void ClearFrom(){
      idfiled.setText(""); 
      namefield.setText("");
      phonefiled.setText("");
      deptfield.setText("");

   }
   public void ClearFrom2(){
      Idfield2.setText(""); 
      Trimesterfield2.setText("");
      Cgpafield2.setText("");

   }


   public void Loadlist() {
       try{
            pst=conn.prepareStatement("select * from student");
            rst=pst.executeQuery();
            
            table_model=(DefaultTableModel)ListTable.getModel();
            table_model.setRowCount(0);
             
            while(rst.next()){
                Vector v = new Vector();
                
                v.add(rst.getString("id"));
                v.add(rst.getString("name"));
                v.add(rst.getString("Phone"));
                v.add(rst.getString("Dept"));
                System.out.println(v);
                table_model.addRow(v);
            }
            
       } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void Loadlist2() {
       try{
            pst=conn.prepareStatement("select * from student2");
            rst=pst.executeQuery();
            
            table_model2=(DefaultTableModel)ListTable2.getModel();
            table_model2.setRowCount(0);
             
            while(rst.next()){
                Vector v = new Vector();
                
                v.add(rst.getString("Id"));
                v.add(rst.getString("Trimester"));
                v.add(rst.getString("CGPA"));
                System.out.println(v);
                table_model2.addRow(v);
           
            }
            
       } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public void CreateTable() {
     table_model=(DefaultTableModel)ListTable.getModel();
     table_model.getDataVector().removeAllElements();
     table_model.fireTableDataChanged();
     table_model.setRowCount(0);  
       
   }
   public void CreateTable2() {
     table_model2=(DefaultTableModel)ListTable2.getModel();
     table_model2.getDataVector().removeAllElements();
     table_model2.fireTableDataChanged();
     table_model2.setRowCount(0);  
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Searchdata = new javax.swing.JTextField();
        Searchbtn2 = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        idfiled = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        phonefiled = new javax.swing.JTextField();
        deptfield = new javax.swing.JTextField();
        LOGOUT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Trimesterfield2 = new javax.swing.JTextField();
        Idfield2 = new javax.swing.JTextField();
        Cgpafield2 = new javax.swing.JTextField();
        Addbtn2 = new javax.swing.JButton();
        Updatebtn2 = new javax.swing.JButton();
        Deletebtn2 = new javax.swing.JButton();
        Clearbtn2 = new javax.swing.JButton();
        Searchbtn3 = new javax.swing.JButton();
        Exitbtn2 = new javax.swing.JButton();
        Logoutbtn2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListTable2 = new javax.swing.JTable();
        combobox2 = new javax.swing.JComboBox<>();
        Searchfield3 = new javax.swing.JTextField();
        Searchbtn4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Searchdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchdataActionPerformed(evt);
            }
        });

        Searchbtn2.setText("Search");
        Searchbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn2ActionPerformed(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "name", "Dept" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("StudentList");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ID");

        idfiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfiledActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Phone No");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Department");

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        dltbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dltbtn.setText("Delete");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(255, 255, 255));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        LOGOUT.setBackground(new java.awt.Color(0, 255, 255));
        LOGOUT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        LOGOUT.setText("LOGOUT");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(updatebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namefield)
                            .addComponent(idfiled)
                            .addComponent(phonefiled)
                            .addComponent(deptfield))))
                .addGap(512, 512, 512))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(searchbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phonefiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(deptfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(updatebtn)
                    .addComponent(dltbtn)
                    .addComponent(clearbtn))
                .addGap(18, 18, 18)
                .addComponent(searchbtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitbtn)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LOGOUT)
                        .addGap(3, 3, 3)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        ListTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 0));
        ListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone No", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Searchdata, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Searchbtn2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2112, 2112, 2112)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn2)
                    .addComponent(Searchdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("StudentList", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Trimester");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CGPA");

        Idfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Idfield2ActionPerformed(evt);
            }
        });

        Addbtn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Addbtn2.setText("Add");
        Addbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addbtn2ActionPerformed(evt);
            }
        });

        Updatebtn2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Updatebtn2.setText("update");
        Updatebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Updatebtn2ActionPerformed(evt);
            }
        });

        Deletebtn2.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        Deletebtn2.setText("Delete");
        Deletebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deletebtn2ActionPerformed(evt);
            }
        });

        Clearbtn2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Clearbtn2.setText("Clear");
        Clearbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clearbtn2ActionPerformed(evt);
            }
        });

        Searchbtn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Searchbtn3.setText("Search");
        Searchbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn3ActionPerformed(evt);
            }
        });

        Exitbtn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Exitbtn2.setText("Exit");
        Exitbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exitbtn2ActionPerformed(evt);
            }
        });

        Logoutbtn2.setBackground(new java.awt.Color(0, 255, 255));
        Logoutbtn2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Logoutbtn2.setText("LOGOUT");
        Logoutbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logoutbtn2MouseClicked(evt);
            }
        });
        Logoutbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logoutbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Addbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Idfield2)
                        .addComponent(Trimesterfield2)
                        .addComponent(Cgpafield2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Updatebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Deletebtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clearbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Logoutbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(Searchbtn3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Idfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Trimesterfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cgpafield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn2)
                    .addComponent(Updatebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn2)
                    .addComponent(Clearbtn2))
                .addGap(18, 18, 18)
                .addComponent(Searchbtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exitbtn2)
                    .addComponent(Logoutbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setText("StudentInfo");

        ListTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ListTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Trimester", "CGPA"
            }
        ));
        ListTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListTable2);

        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Trimester", "CGPA" }));

        Searchbtn4.setText("Search");
        Searchbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Searchbtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Searchfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Searchbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(468, 468, 468))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Searchbtn4)
                                    .addComponent(Searchfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("studentInfo", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListTableMouseClicked
        table_model=(DefaultTableModel)ListTable.getModel();
        int selectedIndex=ListTable.getSelectedRow();
        idfiled.setText(ListTable.getValueAt(selectedIndex,0).toString());
        namefield.setText(ListTable.getValueAt(selectedIndex,1).toString());
        phonefiled.setText(ListTable.getValueAt(selectedIndex,2).toString());
        deptfield.setText(ListTable.getValueAt(selectedIndex,3).toString());
        addbtn.setEnabled(false);
        updatebtn.setEnabled(true);
        dltbtn.setEnabled(true);
    }//GEN-LAST:event_ListTableMouseClicked

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        LOGOUT.setText("LOGOUT");
        Login m=new Login();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        updatebtn.setEnabled(false);
        dltbtn.setEnabled(false);
        String id=idfiled.getText();
        System.out.println(id);
        try {
            pst=conn.prepareStatement("select * from student where id=?");
            pst.setString(1, id);
            rst=pst.executeQuery();

            table_model=(DefaultTableModel)ListTable.getModel();
            table_model.setRowCount(0);
            clearTable();
            
            while(rst.next()){
                Vector v = new Vector();
                v.add(rst.getString("id"));
                v.add(rst.getString("name"));
                v.add(rst.getString("Phone"));
                v.add(rst.getString("Dept"));
                System.out.println(v);
                table_model.addRow(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        addbtn.setEnabled(true);
        //ClearFrom();
        //Loadlist();
        JOptionPane.showMessageDialog(this,"data search successfully");

    }//GEN-LAST:event_searchbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        ClearFrom();
        addbtn.setEnabled(true);
        updatebtn.setEnabled(false);
        dltbtn.setEnabled(false);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        try {
            String id= idfiled.getText();

            pst=conn.prepareStatement("delete from student where id = ?");
            pst.setString(1, id);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        addbtn.setEnabled(true);
        ClearFrom();
        Loadlist();
        JOptionPane.showMessageDialog(this,"data deleted successfully");

    }//GEN-LAST:event_dltbtnActionPerformed

//jOptionPane.showMessageDialog(this,"data added successfully");
    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        addbtn.setEnabled(true);
        try {
            String id= idfiled.getText();
            String name= namefield.getText();
            String Phone = phonefiled.getText();
            String dept=deptfield.getText();
            System.out.println(id+" "+name+" "+Phone+" "+dept);
            pst=conn.prepareStatement("update student set id=?,name=?,"+"Phone=?,"+"Dept=? where id =?");
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, Phone );
            pst.setString(4, dept);
            pst.setString(5, id);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClearFrom();
        Loadlist();
        //addbtn.setEnabled(true);
        JOptionPane.showMessageDialog(this,"data Update successfully");

    }//GEN-LAST:event_updatebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try {
            String id= idfiled.getText();
            String name= namefield.getText();
            String Phone = phonefiled.getText();
            String dept=deptfield.getText();
            System.out.println(id+" "+name+" "+Phone+" "+dept);
            pst=conn.prepareStatement("insert into student values(?,?,?,?)");
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, Phone );
            pst.setString(4, dept);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClearFrom();
        Loadlist();
        JOptionPane.showMessageDialog(this,"data added successfully");
    }//GEN-LAST:event_addbtnActionPerformed

    private void idfiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfiledActionPerformed

    private void Searchbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn2ActionPerformed
        updatebtn.setEnabled(false);
        dltbtn.setEnabled(false);
        //Searchdata.setText(" Search by id... ");
        //Searchdata.setForeground(Color.lightGray);
        String searchData =Searchdata.getText();
        System.out.println(searchData);
        String searchType=(String) combobox.getSelectedItem();
        try {

            pst=conn.prepareStatement("select * from student where "+searchType+"=?");
            pst.setString(1,searchData );
            rst=pst.executeQuery();

            table_model=(DefaultTableModel)ListTable.getModel();
            table_model.setRowCount(0);
            clearTable();
            while(rst.next()){
                Vector v = new Vector();
                v.add(rst.getString("id"));
                v.add(rst.getString("name"));
                v.add(rst.getString("Phone"));
                v.add(rst.getString("Dept"));
                System.out.println(v);
                table_model.addRow(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Searchdata.setText(" Search by id... ");
        //Searchdata.setForeground(Color.lightGray);
        addbtn.setEnabled(true);
        //ClearFrom();
        //Loadlist();
        JOptionPane.showMessageDialog(this,"data search successfully");
        Searchdata.setText(" Search by id... ");
        Searchdata.setForeground(Color.lightGray);
    }//GEN-LAST:event_Searchbtn2ActionPerformed

    private void SearchdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchdataActionPerformed

    private void Searchbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn4ActionPerformed
        Updatebtn2.setEnabled(false);
        Deletebtn2.setEnabled(false);
        //Searchdata.setText(" Search by id... ");
        //Searchdata.setForeground(Color.lightGray);
        String Searchdata2 =Searchfield3.getText();
        System.out.println(Searchdata2);
        String searchType2=(String) combobox2.getSelectedItem();
        try {

            pst=conn.prepareStatement("select * from student2 where "+searchType2+"=?");
            pst.setString(1,Searchdata2 );
            rst=pst.executeQuery();

            table_model2=(DefaultTableModel)ListTable2.getModel();
            table_model2.setRowCount(0);
            clearTable();
            while(rst.next()){
                Vector v = new Vector();
                v.add(rst.getString("Id"));
                v.add(rst.getString("Trimester"));
                v.add(rst.getString("CGPA"));
                System.out.println(v);
                table_model2.addRow(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Searchdata.setText(" Search by id... ");
        //Searchdata.setForeground(Color.lightGray);
        Addbtn2.setEnabled(true);
        //ClearFrom();
        //Loadlist();
        JOptionPane.showMessageDialog(this,"data search successfully");
        Searchfield3.setText(" Search by id... ");
        Searchfield3.setForeground(Color.lightGray);
    }//GEN-LAST:event_Searchbtn4ActionPerformed

    private void ListTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListTable2MouseClicked
        table_model2=(DefaultTableModel)ListTable2.getModel();
        int selectedIndex2=ListTable2.getSelectedRow();
        Idfield2.setText(ListTable2.getValueAt(selectedIndex2,0).toString());
        Trimesterfield2.setText(ListTable2.getValueAt(selectedIndex2,1).toString());
        Cgpafield2.setText(ListTable2.getValueAt(selectedIndex2,2).toString());

        Addbtn2.setEnabled(false);
        Updatebtn2.setEnabled(true);
        Deletebtn2.setEnabled(true);
    }//GEN-LAST:event_ListTable2MouseClicked

    private void Logoutbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logoutbtn2ActionPerformed

    }//GEN-LAST:event_Logoutbtn2ActionPerformed

    private void Logoutbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logoutbtn2MouseClicked
        Logoutbtn2.setText("Logoutbtn2");
        Login p=new Login();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logoutbtn2MouseClicked

    private void Exitbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exitbtn2ActionPerformed

    private void Searchbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Searchbtn3ActionPerformed
        Updatebtn2.setEnabled(false);
        Deletebtn2.setEnabled(false);
        String Id=Idfield2.getText();
        System.out.println(Id);
        try {
            pst=conn.prepareStatement("select * from student2 where Id = ?");
            pst.setString(1, Id);
            rst=pst.executeQuery();

            table_model2=(DefaultTableModel)ListTable2.getModel();
            table_model2.setRowCount(0);
            clearTable();
            while(rst.next()){
                Vector v = new Vector();
                v.add(rst.getString("Id"));
                v.add(rst.getString("Trimester"));
                v.add(rst.getString("CGPA"));
                System.out.println(v);
                table_model2.addRow(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        Addbtn2.setEnabled(true);
        //ClearFrom();
        //Loadlist();
        JOptionPane.showMessageDialog(this,"data search successfully");
    }//GEN-LAST:event_Searchbtn3ActionPerformed

    private void Clearbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clearbtn2ActionPerformed
        ClearFrom2();
        Addbtn2.setEnabled(true);
        Updatebtn2.setEnabled(false);
        Deletebtn2.setEnabled(false);
    }//GEN-LAST:event_Clearbtn2ActionPerformed

    private void Deletebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletebtn2ActionPerformed
        try {
            String Id= Idfield2.getText();

            pst=conn.prepareStatement("delete from student2 where Id = ?");
            pst.setString(1, Id);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        Addbtn2.setEnabled(true);
        ClearFrom2();
        Loadlist2();
        JOptionPane.showMessageDialog(this,"data deleted successfully");

    }//GEN-LAST:event_Deletebtn2ActionPerformed

    private void Updatebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Updatebtn2ActionPerformed
        Addbtn2.setEnabled(true);
        try {
            String Id= Idfield2.getText();
            String Trimester= Trimesterfield2.getText();
            String Cgpa = Cgpafield2.getText();
            System.out.println(Id+" "+Trimester+" "+Cgpa);
            pst=conn.prepareStatement("update student2 set Id=?,Trimester=?,"+"CGPA=? where Id =?");
            pst.setString(1, Id);
            pst.setString(2, Trimester);
            pst.setString(3, Cgpa );
            pst.setString(4, Id);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Updatebtn2.setEnabled(true);
        ClearFrom2();
        Loadlist2();
        //Updatebtn2.setEnabled(true);
        JOptionPane.showMessageDialog(this,"data Update successfully");
    }//GEN-LAST:event_Updatebtn2ActionPerformed

    private void Addbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addbtn2ActionPerformed
        try {
            String Id= Idfield2.getText();
            String Trimester= Trimesterfield2.getText();
            String Cgpa = Cgpafield2.getText();
            System.out.println(Id+" "+Trimester+" "+Cgpa);
            pst=conn.prepareStatement("insert into student2 values(?,?,?)");
            pst.setString(1, Id);
            pst.setString(2, Trimester);
            pst.setString(3, Cgpa );
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClearFrom2();
        Loadlist2();
        JOptionPane.showMessageDialog(this,"data added successfully");
    }//GEN-LAST:event_Addbtn2ActionPerformed

    private void Idfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Idfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Idfield2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn2;
    private javax.swing.JTextField Cgpafield2;
    private javax.swing.JButton Clearbtn2;
    private javax.swing.JButton Deletebtn2;
    private javax.swing.JButton Exitbtn2;
    private javax.swing.JTextField Idfield2;
    private javax.swing.JTextField LOGOUT;
    private javax.swing.JTable ListTable;
    private javax.swing.JTable ListTable2;
    private javax.swing.JTextField Logoutbtn2;
    private javax.swing.JButton Searchbtn2;
    private javax.swing.JButton Searchbtn3;
    private javax.swing.JButton Searchbtn4;
    private javax.swing.JTextField Searchdata;
    private javax.swing.JTextField Searchfield3;
    private javax.swing.JTextField Trimesterfield2;
    private javax.swing.JButton Updatebtn2;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> combobox2;
    private javax.swing.JTextField deptfield;
    private javax.swing.JButton dltbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextField idfiled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField phonefiled;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void clearTable() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //private void clearTable() {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

  // private void Loadlist(){
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  // }

  // private void Loadlist2() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

//    private void ListTable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void ListTable2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

  
