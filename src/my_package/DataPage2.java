import java.util.*;
//import static java.util.Collections.list;
//import static java.util.Collections.list;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import static jdk.nashorn.internal.objects.NativeArray.map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajay-Pc
 */
public class DataPage2 extends javax.swing.JFrame {

    /**
     * Creates new form DataPage2
     */
    int iter = 1;
    String inp;
    int number;
    int count=0;
    Map<String,List<Integer>> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    List<String> teamMembers = new ArrayList<>();
    List<Integer> newMarks = new ArrayList<>();
    List<List<Integer>> marks = new ArrayList<>();
    public DataPage2() {
        initComponents();
    }

    DataPage2(String input) {
        inp = input;
        number = Integer.parseInt(input);
        list.add(1);
        list.add(2);
        list.add(3);
        teamMembers.add("Ajay Gandhi");
        teamMembers.add("Sidharth Pateriya");
        teamMembers.add("Hrishikessssssssssssssssssssssssssh");
        teamMembers.add("Ko");
        teamMembers.add("ABC");
        teamMembers.add("kBC");
        teamMembers.add("oBC");
        for(int i=0;i<number;i++)
        {
            map.put(teamMembers.get(i),list);
        }
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        teamMarks = new javax.swing.JTextField();
        teamName = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        teamMarks1 = new javax.swing.JTextField();
        teamMarks2 = new javax.swing.JTextField();
        infoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number of Team Mates = "+number);

        teamMarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teamMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamMarksActionPerformed(evt);
            }
        });

        teamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamName.setText(teamMembers.get(0));
        teamName.setMaximumSize(new java.awt.Dimension(100, 14));

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        teamMarks1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teamMarks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamMarks1ActionPerformed(evt);
            }
        });

        teamMarks2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teamMarks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamMarks2ActionPerformed(evt);
            }
        });

        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Enter Marks for Teammate "+iter++);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 200, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fetching previous submission...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamMarks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamMarks1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamMarks2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(enterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMarks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMarks2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enterButton)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamMarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamMarksActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        if(teamMarks.getText().equals("") || teamMarks1.getText().equals("") || teamMarks2.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Enter some input (between 1 & 5) ");
        else if(Integer.parseInt(teamMarks.getText())>5 || Integer.parseInt(teamMarks1.getText())>5 || Integer.parseInt(teamMarks2.getText())>5  ||Integer.parseInt(teamMarks.getText())<0 || Integer.parseInt(teamMarks1.getText())<0 || Integer.parseInt(teamMarks2.getText())<0)
            JOptionPane.showMessageDialog(this,"Enter proper input (between 0 & 5) ");    
        else
          {
        
        if(!enterButton.getText().equals("Calculate") && !enterButton.getText().equals("Calculate Pressed") && count<number)
        {
          
              System.out.println("Count " +count);
        infoLabel.setText("Enter marks for Teammate "+(count+2));
        
        
        int marks0 = Integer.parseInt(teamMarks.getText());
        int marks1 = Integer.parseInt(teamMarks1.getText());
        int marks2 = Integer.parseInt(teamMarks2.getText());
        List<Integer> list = new ArrayList<>();//(Arrays.asList(marks,marks1,marks2));
        list.add(marks0);
        list.add(marks1);
        list.add(marks2);
        map.put(teamName.getText(),new ArrayList<Integer>(Arrays.asList(marks0,marks1,marks2)));
        marks.add(list);
        System.out.println("New Marks for "+teamMembers.get(count)+": "+map.get(teamMembers.get(count)).get(0)+" "+map.get(teamMembers.get(count)).get(1)+" "+map.get(teamMembers.get(count)).get(2));
            System.out.println("Marks: "+marks);
        }
        count++;
        if(!enterButton.getText().equals("Calculate") && !enterButton.getText().equals("Calculate Pressed") && count<number)
        {
        teamName.setText(teamMembers.get(count));
        
        teamMarks.setText("");
        teamMarks1.setText("");
        teamMarks2.setText("");
        //teamMarks1.setText(String.valueOf(map.get(teamMembers.get(count)).get(1)));
        //teamMarks2.setText(String.valueOf(map.get(teamMembers.get(count)).get(2)));
        }
        
        else if(!enterButton.getText().equals("Calculate") && !enterButton.getText().equals("Calculate Pressed"))
        {
            teamName.setText("Press Calculate Button to Calculate Marks");
            //teamMarks.remove(this);
            infoLabel.setVisible(false);
            teamMarks.setVisible(false);
            teamMarks1.setVisible(false);
            teamMarks2.setVisible(false);
            //teamMarks1.remove(this);
            //teamMarks2.remove(this);
            
//            teamMarks.setText("");
//            teamMarks1.setText("");
//            teamMarks2.setText("");
            enterButton.setText("Calculate");
        }else if(enterButton.getText().equals("Calculate"))
        {
            enterButton.setText("Calculate Pressed");
            System.out.println("Calculate Pressed");
            
        }
          }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void teamMarks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamMarks1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamMarks1ActionPerformed

    private void teamMarks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamMarks2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamMarks2ActionPerformed

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
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField teamMarks;
    private javax.swing.JTextField teamMarks1;
    private javax.swing.JTextField teamMarks2;
    private javax.swing.JLabel teamName;
    // End of variables declaration//GEN-END:variables
}
