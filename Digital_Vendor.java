
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author NandiniCreations
 */
public class Digital_Vendor extends javax.swing.JFrame {

    /**
     * Creates new form Digital_Vendor
     */
    double sum = 0;
    String address = "";

    public Digital_Vendor() {
        initComponents();
        choose_label.setVisible(true);
        choose_combo.setVisible(true);
        display_ta.setVisible(true);
        reset_button.setVisible(false);
        submit_button.setVisible(false);
        add_another_button.setVisible(false);
        exit_button.setVisible(true);

        paper_label.setVisible(false);
        select_combo.setVisible(false);
        book_name_label.setVisible(false);
        book_name_tf.setVisible(false);
        book_check_button.setVisible(false);

        address_label.setVisible(false);
        address_tf.setVisible(false);
        state_combo.setVisible(false);
        city_combo.setVisible(false);
        pincode_label.setVisible(false);
        pincode_tf.setVisible(false);
        vendor_button.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choose_combo = new javax.swing.JComboBox<>();
        reset_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        select_combo = new javax.swing.JComboBox<>();
        book_name_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_ta = new javax.swing.JTextArea();
        book_name_label = new javax.swing.JLabel();
        paper_label = new javax.swing.JLabel();
        choose_label = new javax.swing.JLabel();
        book_check_button = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        address_label = new javax.swing.JLabel();
        state_combo = new javax.swing.JComboBox<>();
        city_combo = new javax.swing.JComboBox<>();
        address_tf = new javax.swing.JTextField();
        vendor_button = new javax.swing.JButton();
        pincode_label = new javax.swing.JLabel();
        pincode_tf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        add_another_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        choose_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:-", "1. Paper/Newspaper", "2. Books", "3. Metal", "4. Aluminium", "5. Plastic" }));
        choose_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_comboActionPerformed(evt);
            }
        });

        reset_button.setText("RESET");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        exit_button.setText("EXIT");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        select_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one:-" }));
        select_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_comboActionPerformed(evt);
            }
        });

        display_ta.setColumns(20);
        display_ta.setRows(5);
        jScrollPane1.setViewportView(display_ta);

        book_name_label.setText("Enter Book Name:");

        paper_label.setText("Select one:");

        choose_label.setText("Choose one:");

        book_check_button.setText("CHECK BOOK");
        book_check_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_check_buttonActionPerformed(evt);
            }
        });

        submit_button.setText("SUBMIT");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        address_label.setText("Enter Address :");

        state_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State:", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        state_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state_comboActionPerformed(evt);
            }
        });

        city_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City:", "Agartala", "Ahmedabad", "Aizawl", "Amaravati", "Bengaluru", "Bhopal", "Bhubaneswar", "Chandigarh", "Chandigarh", "Chennai", "Dehradun", "Delhi", "Dharamshala", "Dispur", "Gairsain", "Gandhinagar", "Gangtok", "Gurgaon", "Hyderabad", "Imphal", "Itanagar", "Jaipur", "Kohima", "Kolkata", "Lucknow", "Mumbai", "Panaji", "Patna", "Raipur", "Ranchi", "Rohtak", "Shillong", "Shimla ", "Thiruvananthapuram", "Vishakapatnam" }));

        vendor_button.setText("Find Vendor");
        vendor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendor_buttonActionPerformed(evt);
            }
        });

        pincode_label.setText("Enter Pincode:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Want to be a Vendor ? ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("REGISTER HERE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add_another_button.setText("ADD ANOTHER");
        add_another_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_another_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_another_button)
                                .addGap(18, 18, 18)
                                .addComponent(submit_button))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(address_label)
                                .addGap(18, 18, 18)
                                .addComponent(address_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(city_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(state_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pincode_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pincode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reset_button)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(book_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(paper_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(choose_label))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(select_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choose_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(book_name_tf))
                                .addGap(41, 41, 41)
                                .addComponent(book_check_button))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vendor_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_button)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choose_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choose_label))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paper_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(book_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(book_check_button))
                    .addComponent(book_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_button)
                    .addComponent(submit_button)
                    .addComponent(add_another_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address_label)
                    .addComponent(address_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pincode_label)
                    .addComponent(pincode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(vendor_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void choose_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_comboActionPerformed
        // TODO add your handling code here:
        int k = choose_combo.getSelectedIndex();
        add_another_button.setVisible(true);
        reset_button.setVisible(true);
        submit_button.setVisible(true);
        switch (k) {
            case 1:
                select_combo.setVisible(true);
                paper_label.setVisible(true);

                book_name_label.setVisible(false);
                book_name_tf.setVisible(false);
                book_check_button.setVisible(false);

                select_combo.addItem("Less than 15 sets");
                select_combo.addItem("More than equal to 15 sets");
                break;
            case 2:
                book_name_label.setVisible(true);
                book_name_tf.setVisible(true);
                book_check_button.setVisible(true);

                select_combo.setVisible(false);
                paper_label.setVisible(false);

                break;
            case 3:
                book_name_label.setVisible(false);
                book_name_tf.setVisible(false);
                book_check_button.setVisible(false);
                select_combo.setVisible(false);
                paper_label.setVisible(false);
                display_ta.append("\nPrice for Metal is : Rs. 85/kg");
                break;
            case 4:
                book_name_label.setVisible(false);
                book_name_tf.setVisible(false);
                book_check_button.setVisible(false);
                select_combo.setVisible(false);
                paper_label.setVisible(false);
                display_ta.append("\nPrice for Aluminium is : Rs. 100/kg");
                break;
            case 5:
                book_name_label.setVisible(false);
                book_name_tf.setVisible(false);
                book_check_button.setVisible(false);
                select_combo.setVisible(false);
                paper_label.setVisible(false);
                display_ta.append("\nPrice for Plastic is : Rs.30/kg");
                break;
            default:
                display_ta.append("\nPlease choose any one option");
        }

    }//GEN-LAST:event_choose_comboActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        // TODO add your handling code here:
        choose_combo.setSelectedIndex(0);
        select_combo.setSelectedIndex(0);
        display_ta.setText("");
        book_name_tf.setText("");
        address_tf.setText("");
        city_combo.setSelectedIndex(0);
        state_combo.setSelectedIndex(0);
        pincode_tf.setText("");


    }//GEN-LAST:event_reset_buttonActionPerformed

    private void select_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_comboActionPerformed
        // TODO add your handling code here:
        int k = select_combo.getSelectedIndex();
        switch (k) {
            case 1:
                display_ta.append("\nPrice for paper/newspaper for less than 15 sets = Rs. 10/kg");
                break;
            case 2:
                display_ta.append("\nPrice for paper/newspaper for more/equal than 15 sets = Rs. 15/kg");
                break;
            default:
                display_ta.append("\nPlease select any one.\n");
        }

    }//GEN-LAST:event_select_comboActionPerformed

    private void book_check_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_check_buttonActionPerformed
        // TODO add your handling code here:
        String name = book_name_tf.getText();
        Connection conn;
        Statement stmt;
        ResultSet rs;
        try {
            String userName = "root";
            String password = "aryan7";
            String url = "jdbc:mysql://localhost:3306/power2fly";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("select * from books");
            rs = stmt.getResultSet();
            String book_name;
            int rating = 0;
            int price;
            boolean flag = false;
            while (rs.next()) {
                book_name = rs.getString(2);
                rating = rs.getInt(3);
                if (book_name.equals(name)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                display_ta.append("\nPrice for Book : Rs. 17/kg");

                if (rating < 7) {
                    price = (rating / 2) * 7;
                } else {
                    price = (rating / 2) * 10;
                }

                display_ta.append("\nSpecial Price for Book : " + name + " will be added = Rs." + price);
            } else {
                price = 10;
                display_ta.append("\nPrice for Book : Rs. 17/kg");
                display_ta.append("\nBook " + name + " is not Rated. Special Price will be : Rs." + price);
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_book_check_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        address_label.setVisible(true);
        address_tf.setVisible(true);
        state_combo.setVisible(true);
        city_combo.setVisible(true);
        pincode_label.setVisible(true);
        pincode_tf.setVisible(true);
        vendor_button.setVisible(true);

    }//GEN-LAST:event_submit_buttonActionPerformed

    private void state_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state_comboActionPerformed

    private void vendor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendor_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String client_postcode = address_tf.getText() + ", " + city_combo.getSelectedItem() + ", " + state_combo.getSelectedItem() + ", " + pincode_tf.getText();
            Connection conn;
            Statement stmt;
            ResultSet rs;
            String pincode = pincode_tf.getText();
            String userName = "root";
            String password = "aryan7";
            String url = "jdbc:mysql://localhost:3306/power2fly";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            if (pincode.length() == 6) {
                String sub_c = "";
                String sub_c_2 = "";
                for (int i = 0; i < 3; i++) {
                    sub_c += pincode.charAt(i);
                    sub_c_2 += pincode.charAt(i + 3);
                }
                int sub_c_int = Integer.parseInt(sub_c_2);
                
                stmt.execute("select pincode from vendor_location where city = '" + city_combo.getSelectedItem() + "' and state = '" + state_combo.getSelectedItem() + "' and pincode like '" + sub_c + "%';");
                rs = stmt.getResultSet();
                String pincode_v = "";
                int min = 10;
                String temp = "";
                while (rs.next()) {
                    pincode_v = rs.getString(1);
                    String sub_v = "";
                    for (int i = 3; i < 6; i++) {
                        sub_v += pincode_v.charAt(i);
                    }
                    int sub_v_int = Integer.parseInt(sub_v);
                    int diff = Math.abs(sub_c_int - sub_v_int);
                    if (diff <= min) {
                        min = diff;
                        temp = pincode_v;
                    }
                }

                display_ta.append("\n\nVendor Found.");
                stmt.execute("Select * from vendor_location where pincode = '" + temp + "';");
                rs = stmt.getResultSet();
                while (rs.next()) {
                    display_ta.append("\n\nName : " + rs.getString(1) + "\nAge : " + rs.getInt(2) + "\nPhone : " + rs.getString(3) + "\nAddress : " + rs.getString(4) + ", "
                            + rs.getString(5) + ", " + rs.getString(6) + ", " + rs.getString(7));
                    stmt.execute("insert into orders values(\"" + client_postcode + "\",\"" + rs.getString(1) + "\",\"" + rs.getString(3) + "\",\"" + rs.getString(7) + "\");");
                    display_ta.append("\nVendor will reach shortly");
                    break;
                }

            } else {
                display_ta.append("Pincode must be exactly 6 digits.");
                pincode_tf.setText("");
            }
        } catch (Exception e) {
            System.out.println("Error in find vendor button : " + e.getMessage());
        }


    }//GEN-LAST:event_vendor_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new vendor_register().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void add_another_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_another_buttonActionPerformed
        // TODO add your handling code here:
        choose_label.setVisible(true);
        choose_combo.setVisible(true);
        display_ta.setVisible(true);
        reset_button.setVisible(true);
        exit_button.setVisible(true);

        paper_label.setVisible(false);
        select_combo.setVisible(false);
        book_name_label.setVisible(false);
        book_name_tf.setVisible(false);
        book_check_button.setVisible(false);

        address_label.setVisible(false);
        address_tf.setVisible(false);
        state_combo.setVisible(false);
        city_combo.setVisible(false);
        pincode_tf.setVisible(false);
        vendor_button.setVisible(false);
        
        choose_combo.setSelectedIndex(0);
        add_another_button.setVisible(false);
        reset_button.setVisible(true);
        submit_button.setVisible(false);
        
    }//GEN-LAST:event_add_another_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Digital_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digital_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digital_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digital_Vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Digital_Vendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_another_button;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_tf;
    private javax.swing.JButton book_check_button;
    private javax.swing.JLabel book_name_label;
    private javax.swing.JTextField book_name_tf;
    private javax.swing.JComboBox<String> choose_combo;
    private javax.swing.JLabel choose_label;
    private javax.swing.JComboBox<String> city_combo;
    private javax.swing.JTextArea display_ta;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paper_label;
    private javax.swing.JLabel pincode_label;
    private javax.swing.JTextField pincode_tf;
    private javax.swing.JButton reset_button;
    private javax.swing.JComboBox<String> select_combo;
    private javax.swing.JComboBox<String> state_combo;
    private javax.swing.JButton submit_button;
    private javax.swing.JButton vendor_button;
    // End of variables declaration//GEN-END:variables
}
