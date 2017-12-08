import static java.lang.Math.random;
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
public class DataPage extends javax.swing.JFrame {

    /**
     * Creates new form DataPage2
     */
    //int iter = 1;
    String inp;
    //int numberOfTeamMembers;
    int count=0;
    Map<String,List<Integer>> map = new HashMap<>();
    List<String> teamMembers = new ArrayList<>();
    List<Integer> newMarks = new ArrayList<>();
    List<List<Integer>> marks = new ArrayList<>();
    boolean prevData;
    List<List<Integer>> randomData;
    public DataPage() {
        initComponents();
    }
    DataPage(int teammembers,boolean f) {
        prevData = f;
        int numberOfTeamMembers = teammembers;
        randomData = generateData();
        System.out.println("Random Data = " + randomData);
        teamMembers.add("Britney Spears");
        teamMembers.add("Rihanna");
        teamMembers.add("Lady Gaga");
        teamMembers.add("Katy Perry");
        teamMembers.add("Arianna Grande");
        teamMembers.add("Miley Cyrus");
        teamMembers.add("Selena Gomez");
        for(int i=0;i<numberOfTeamMembers;i++)
        {
            map.put(teamMembers.get(i),randomData.get(i));
        }
        initComponents();
        messageLabel.setText("Number of Team Mates = "+numberOfTeamMembers);
        resultPanel.setVisible(false);
        setVisibleMembers(numberOfTeamMembers);
        if(prevData)
            setPrevData();
    }     
      private void setVisible2(){
        teamMember1.setVisible(true);teamMember2.setVisible(true);
        marks11.setVisible(true);marks12.setVisible(true);marks13.setVisible(true);
        marks21.setVisible(true);marks22.setVisible(true);marks23.setVisible(true);
      }
      private void setVisible3(){
        teamMember3.setVisible(true);marks31.setVisible(true);marks32.setVisible(true);marks33.setVisible(true);
      }
      private void setVisible4(){
        teamMember4.setVisible(true);marks41.setVisible(true);marks42.setVisible(true);marks43.setVisible(true);
      }
      private void setVisible5(){
        teamMember5.setVisible(true);marks51.setVisible(true);marks52.setVisible(true);marks53.setVisible(true);
      }
      private void setVisible6(){
        teamMember6.setVisible(true);marks61.setVisible(true);marks62.setVisible(true);marks63.setVisible(true);
      }
      private void setVisible7(){
        teamMember7.setVisible(true);marks71.setVisible(true);marks72.setVisible(true);marks73.setVisible(true);
      }

      private void setVisibleMembers(int numberOfTeamMembers)
      {
          switch(numberOfTeamMembers)
           {
               case 2:
                   setVisible2();
                   break;
               case 3:
                   setVisible2();setVisible3();
                   break;
               case 4:
                   setVisible2();setVisible3();setVisible4();
                   break;
               case 5:
                   setVisible2();setVisible3();setVisible4();setVisible5();
                   break;
               case 6:
                   setVisible2();setVisible3();setVisible4();setVisible5();setVisible6();
                   break;
               case 7:
                   setVisible2();setVisible3();setVisible3();setVisible4();setVisible5();setVisible6();setVisible7();
                   break;
          }
      }
      private List<List<Integer>> generateData()
      {
          List<List<Integer>> data = new ArrayList<>();
          
          for(int j=0;j<7;j++)
          {
            List<Integer> prevMarks = new ArrayList<>();
            for(int i=0;i<3;i++)
              prevMarks.add(new Random().nextInt(6));
            data.add(prevMarks);
          }    
        //System.out.println("Random data generated = "+data);
        return data;
      }
      private void setPrevData()
      {
        marks11.setSelectedItem(String.valueOf(randomData.get(0).get(0)));marks12.setSelectedItem(String.valueOf(randomData.get(0).get(1)));marks13.setSelectedItem(String.valueOf(randomData.get(0).get(2)));
        marks21.setSelectedItem(String.valueOf(randomData.get(1).get(0)));marks22.setSelectedItem(String.valueOf(randomData.get(1).get(1)));marks23.setSelectedItem(String.valueOf(randomData.get(1).get(2)));
        marks31.setSelectedItem(String.valueOf(randomData.get(2).get(0)));marks32.setSelectedItem(String.valueOf(randomData.get(2).get(1)));marks33.setSelectedItem(String.valueOf(randomData.get(2).get(2)));
        marks41.setSelectedItem(String.valueOf(randomData.get(3).get(0)));marks42.setSelectedItem(String.valueOf(randomData.get(3).get(1)));marks43.setSelectedItem(String.valueOf(randomData.get(3).get(2)));
        marks51.setSelectedItem(String.valueOf(randomData.get(4).get(0)));marks52.setSelectedItem(String.valueOf(randomData.get(4).get(1)));marks53.setSelectedItem(String.valueOf(randomData.get(4).get(2)));
        marks61.setSelectedItem(String.valueOf(randomData.get(5).get(0)));marks62.setSelectedItem(String.valueOf(randomData.get(5).get(1)));marks63.setSelectedItem(String.valueOf(randomData.get(5).get(2)));
        marks71.setSelectedItem(String.valueOf(randomData.get(6).get(0)));marks72.setSelectedItem(String.valueOf(randomData.get(6).get(1)));marks73.setSelectedItem(String.valueOf(randomData.get(6).get(2))); 
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
        jPanel2 = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        marksField2Label = new javax.swing.JLabel();
        marksField3Label = new javax.swing.JLabel();
        marks12 = new javax.swing.JComboBox<>();
        marks13 = new javax.swing.JComboBox<>();
        marksField1Label = new javax.swing.JLabel();
        marks11 = new javax.swing.JComboBox<>();
        nameLabel = new javax.swing.JLabel();
        teamMember1 = new javax.swing.JLabel();
        teamMember4 = new javax.swing.JLabel();
        marks41 = new javax.swing.JComboBox<>();
        marks42 = new javax.swing.JComboBox<>();
        marks43 = new javax.swing.JComboBox<>();
        teamMember2 = new javax.swing.JLabel();
        marks21 = new javax.swing.JComboBox<>();
        marks22 = new javax.swing.JComboBox<>();
        marks23 = new javax.swing.JComboBox<>();
        marks33 = new javax.swing.JComboBox<>();
        marks31 = new javax.swing.JComboBox<>();
        teamMember3 = new javax.swing.JLabel();
        marks32 = new javax.swing.JComboBox<>();
        marks53 = new javax.swing.JComboBox<>();
        marks52 = new javax.swing.JComboBox<>();
        marks51 = new javax.swing.JComboBox<>();
        teamMember5 = new javax.swing.JLabel();
        marks63 = new javax.swing.JComboBox<>();
        teamMember6 = new javax.swing.JLabel();
        marks62 = new javax.swing.JComboBox<>();
        marks61 = new javax.swing.JComboBox<>();
        marks73 = new javax.swing.JComboBox<>();
        marks72 = new javax.swing.JComboBox<>();
        marks71 = new javax.swing.JComboBox<>();
        teamMember7 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        name4 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m6 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        m5 = new javax.swing.JLabel();
        m7 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marksField2Label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        marksField2Label.setForeground(new java.awt.Color(0, 102, 102));
        marksField2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marksField2Label.setText("Meeting Participation");

        marksField3Label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        marksField3Label.setForeground(new java.awt.Color(0, 102, 102));
        marksField3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marksField3Label.setText("Work Evaluation");

        marks12.setVisible(false);
        marks12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks12ActionPerformed(evt);
            }
        });

        marks13.setVisible(false);
        marks13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks13ActionPerformed(evt);
            }
        });

        marksField1Label.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        marksField1Label.setForeground(new java.awt.Color(0, 102, 102));
        marksField1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marksField1Label.setText("Professionalism");

        marks11.setVisible(false);
        marks11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 102));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");

        teamMember1.setVisible(false);
        teamMember1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember1.setForeground(java.awt.Color.red);
        teamMember1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember1.setText(teamMembers.get(0));
        teamMember1.setMaximumSize(new java.awt.Dimension(100, 14));

        teamMember4.setVisible(false);
        teamMember4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember4.setForeground(java.awt.Color.red);
        teamMember4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember4.setText(teamMembers.get(3));
        teamMember4.setMaximumSize(new java.awt.Dimension(100, 14));

        marks41.setVisible(false);
        marks41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        marks42.setVisible(false);
        marks42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks42ActionPerformed(evt);
            }
        });

        marks43.setVisible(false);
        marks43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks43ActionPerformed(evt);
            }
        });

        teamMember2.setVisible(false);
        teamMember2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember2.setForeground(java.awt.Color.red);
        teamMember2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember2.setText(teamMembers.get(1));
        teamMember2.setMaximumSize(new java.awt.Dimension(100, 14));

        marks21.setVisible(false);
        marks21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        marks22.setVisible(false);
        marks22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks22ActionPerformed(evt);
            }
        });

        marks23.setVisible(false);
        marks23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks23ActionPerformed(evt);
            }
        });

        marks33.setVisible(false);
        marks33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks33ActionPerformed(evt);
            }
        });

        marks31.setVisible(false);
        marks31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        teamMember3.setVisible(false);
        teamMember3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember3.setForeground(java.awt.Color.red);
        teamMember3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember3.setText(teamMembers.get(2));
        teamMember3.setMaximumSize(new java.awt.Dimension(100, 14));

        marks32.setVisible(false);
        marks32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks32ActionPerformed(evt);
            }
        });

        marks53.setVisible(false);
        marks53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks53ActionPerformed(evt);
            }
        });

        marks52.setVisible(false);
        marks52.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks52ActionPerformed(evt);
            }
        });

        marks51.setVisible(false);
        marks51.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        teamMember5.setVisible(false);
        teamMember5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember5.setForeground(java.awt.Color.red);
        teamMember5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember5.setText(teamMembers.get(4));
        teamMember5.setMaximumSize(new java.awt.Dimension(100, 14));

        marks63.setVisible(false);
        marks63.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks63ActionPerformed(evt);
            }
        });

        teamMember6.setVisible(false);
        teamMember6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember6.setForeground(java.awt.Color.red);
        teamMember6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember6.setText(teamMembers.get(5));
        teamMember6.setMaximumSize(new java.awt.Dimension(100, 14));

        marks62.setVisible(false);
        marks62.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks62ActionPerformed(evt);
            }
        });

        marks61.setVisible(false);
        marks61.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        marks73.setVisible(false);
        marks73.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks73ActionPerformed(evt);
            }
        });

        marks72.setVisible(false);
        marks72.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));
        marks72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marks72ActionPerformed(evt);
            }
        });

        marks71.setVisible(false);
        marks71.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5" }));

        teamMember7.setVisible(false);
        teamMember7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teamMember7.setForeground(java.awt.Color.red);
        teamMember7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamMember7.setText(teamMembers.get(6));
        teamMember7.setMaximumSize(new java.awt.Dimension(100, 14));

        calculateButton.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(0, 102, 102));
        calculateButton.setText("Calculate");
        calculateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calculateButton.setMaximumSize(new java.awt.Dimension(100, 100));
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamMember1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamMember4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamMember2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamMember3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamMember5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamMember6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamMember7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marks11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks41, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks21, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks31, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks51, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks61, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks71, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marksField1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marks42, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks12, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks22, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks32, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks52, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks62, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks72, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marksField2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marksField3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks43, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks23, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks33, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks53, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks63, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marks73, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(303, 303, 303))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marksField2Label)
                    .addComponent(marksField3Label)
                    .addComponent(marksField1Label)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marks72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamMember7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        name4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name4.setForeground(new java.awt.Color(0, 153, 102));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("Team Member 4");

        name6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name6.setForeground(new java.awt.Color(0, 153, 102));
        name6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name6.setText("Team Member 6");

        name5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name5.setForeground(new java.awt.Color(0, 153, 102));
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("Team Member 5");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Marks Obtained");

        m1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m1.setForeground(new java.awt.Color(0, 153, 153));
        m1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m1.setText("Marks");

        m2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m2.setForeground(new java.awt.Color(0, 153, 153));
        m2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m2.setText("Marks");

        name2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name2.setForeground(new java.awt.Color(0, 153, 102));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Team Member 2");

        name3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name3.setForeground(new java.awt.Color(0, 153, 102));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Team Member 3");

        m4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m4.setForeground(new java.awt.Color(0, 153, 153));
        m4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m4.setText("Marks");

        m6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m6.setForeground(new java.awt.Color(0, 153, 153));
        m6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m6.setText("Marks");

        m3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m3.setForeground(new java.awt.Color(0, 153, 153));
        m3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m3.setText("Marks");

        name1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 153, 102));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Team Member 1");

        m5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m5.setForeground(new java.awt.Color(0, 153, 153));
        m5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m5.setText("Marks");

        m7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        m7.setForeground(new java.awt.Color(0, 153, 153));
        m7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m7.setText("Marks");

        name7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name7.setForeground(new java.awt.Color(0, 153, 102));
        name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name7.setText("Team Member 7");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Result Analysis");

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name7, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, resultPanelLayout.createSequentialGroup()
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        resultPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, m1, m2, m3, m4, m5, m6, m7, name1, name3, name4, name5, name6, name7});

        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        messageLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(0, 102, 102));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        titleLabel.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 51, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(prevData)
        titleLabel.setText("Fetching previous submission...");
        else
        titleLabel.setText("Enter Self and Peer Evaluation");

        infoLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(0, 102, 102));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(prevData)
        infoLabel.setText("Update Marks for Teammates" );
        else
        infoLabel.setText("Enter Marks for Teammates ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(260, 260, 260))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setVisibilityOfResults(double[] marks,int numberOfTeamMembers)
    {
        name1.setText(teamMembers.get(0));name7.setText(teamMembers.get(6));name6.setText(teamMembers.get(5));
        name2.setText(teamMembers.get(1));name4.setText(teamMembers.get(3));
        name3.setText(teamMembers.get(2));name5.setText(teamMembers.get(4));
        setVisibleResultMembers(marks,numberOfTeamMembers);
    }
    private void set3False(){ name3.setVisible(false);m3.setVisible(false); }
    private void set4False(){ name4.setVisible(false);m4.setVisible(false); }
    private void set5False(){ name5.setVisible(false);m5.setVisible(false); }
    private void set6False(){ name6.setVisible(false);m6.setVisible(false); }
    private void set7False(){ name7.setVisible(false);m7.setVisible(false); }

      private void setVisibleResultMembers(double[] marks,int numberOfTeamMembers)
      {
          switch(numberOfTeamMembers)
           {
               case 2:
                   m1.setText(String.valueOf(marks[0]));m2.setText(String.valueOf(marks[1]));
                   set3False();set4False();set5False();set6False();set7False();
                   break;
               case 3:
                   m1.setText(String.valueOf(marks[0]));m2.setText(String.valueOf(marks[1]));m3.setText(String.valueOf(marks[2]));
                   set4False();set5False();set6False();set7False();
                   break;
               case 4:
                   m1.setText(String.valueOf(marks[0]));m2.setText(String.valueOf(marks[1]));m3.setText(String.valueOf(marks[2]));m4.setText(String.valueOf(marks[3]));
                   set6False();set7False();set5False();
                   break;
               case 5:
                   m1.setText(String.valueOf(marks[0]));m5.setText(String.valueOf(marks[4]));m2.setText(String.valueOf(marks[1]));m3.setText(String.valueOf(marks[2]));m4.setText(String.valueOf(marks[3]));
                   set7False();set6False();
                   break;
               case 6:
                   m1.setText(String.valueOf(marks[0]));m5.setText(String.valueOf(marks[4]));m2.setText(String.valueOf(marks[1]));m6.setText(String.valueOf(marks[5]));m3.setText(String.valueOf(marks[2]));m4.setText(String.valueOf(marks[3]));
                   set7False();
                   break;
               case 7:
                   m1.setText(String.valueOf(marks[0]));m5.setText(String.valueOf(marks[4]));m2.setText(String.valueOf(marks[1]));m6.setText(String.valueOf(marks[5]));m3.setText(String.valueOf(marks[2]));m7.setText(String.valueOf(marks[6]));m4.setText(String.valueOf(marks[3]));
                   break;
          }
      }
    
    private int[][] getMarks()
    {
        int[][] marks = new int[7][3];
        marks[0][0]=Integer.parseInt((String) marks11.getSelectedItem());marks[0][1]=Integer.parseInt((String) marks12.getSelectedItem());marks[0][2]=Integer.parseInt((String) marks13.getSelectedItem());
        marks[1][0]=Integer.parseInt((String) marks21.getSelectedItem());marks[1][1]=Integer.parseInt((String) marks22.getSelectedItem());marks[1][2]=Integer.parseInt((String) marks23.getSelectedItem());
        marks[2][0]=Integer.parseInt((String) marks31.getSelectedItem());marks[2][1]=Integer.parseInt((String) marks32.getSelectedItem());marks[2][2]=Integer.parseInt((String) marks33.getSelectedItem());
        marks[3][0]=Integer.parseInt((String) marks41.getSelectedItem());marks[3][1]=Integer.parseInt((String) marks42.getSelectedItem());marks[3][2]=Integer.parseInt((String) marks43.getSelectedItem());
        marks[4][0]=Integer.parseInt((String) marks51.getSelectedItem());marks[4][1]=Integer.parseInt((String) marks52.getSelectedItem());marks[4][2]=Integer.parseInt((String) marks53.getSelectedItem());
        marks[5][0]=Integer.parseInt((String) marks61.getSelectedItem());marks[5][1]=Integer.parseInt((String) marks62.getSelectedItem());marks[5][2]=Integer.parseInt((String) marks63.getSelectedItem());
        marks[6][0]=Integer.parseInt((String) marks71.getSelectedItem());marks[6][1]=Integer.parseInt((String) marks72.getSelectedItem());marks[6][2]=Integer.parseInt((String) marks73.getSelectedItem());
        return marks;
    }
    
    public double[] calculateNormalizedMarks(int[][] marks,int numberOfTeamMembers)
    {
        double[] normMarks = new double[numberOfTeamMembers];
        double[] totalMarksPerMember = new double[numberOfTeamMembers];
        double maxScoresForTeam = 0.0;
        for(int i=0;i<numberOfTeamMembers;i++)
        {
            totalMarksPerMember[i]=marks[i][0]+marks[i][1]+marks[i][2];
            maxScoresForTeam +=totalMarksPerMember[i];
        }
        
        for(int i=0;i<numberOfTeamMembers;i++)
            normMarks[i]=(double)(totalMarksPerMember[i]/maxScoresForTeam);
        
            

            for(int i=0;i<numberOfTeamMembers;i++)
            {
                System.out.println("Marks for "+map.get(teamMembers.get(i))+" ="+normMarks[i]);
            }
        return normMarks;
    }
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed

        int numberOfTeamMembers = map.keySet().size();
        int[][] marks = getMarks();
        inputPanel.setVisible(false);
        jPanel1.setVisible(false);
        resultPanel.setVisible(true);
        
        double[] normalizedMarks = calculateNormalizedMarks(marks,numberOfTeamMembers);
        
        
        setVisibilityOfResults(normalizedMarks,numberOfTeamMembers);
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void marks13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks13ActionPerformed

    private void marks12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks12ActionPerformed

    private void marks42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks42ActionPerformed

    private void marks43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks43ActionPerformed

    private void marks22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks22ActionPerformed

    private void marks23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks23ActionPerformed

    private void marks33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks33ActionPerformed

    private void marks32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks32ActionPerformed

    private void marks53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks53ActionPerformed

    private void marks52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks52ActionPerformed

    private void marks63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks63ActionPerformed

    private void marks62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks62ActionPerformed

    private void marks73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks73ActionPerformed

    private void marks72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marks72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marks72ActionPerformed

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
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m5;
    private javax.swing.JLabel m6;
    private javax.swing.JLabel m7;
    private javax.swing.JComboBox<String> marks11;
    private javax.swing.JComboBox<String> marks12;
    private javax.swing.JComboBox<String> marks13;
    private javax.swing.JComboBox<String> marks21;
    private javax.swing.JComboBox<String> marks22;
    private javax.swing.JComboBox<String> marks23;
    private javax.swing.JComboBox<String> marks31;
    private javax.swing.JComboBox<String> marks32;
    private javax.swing.JComboBox<String> marks33;
    private javax.swing.JComboBox<String> marks41;
    private javax.swing.JComboBox<String> marks42;
    private javax.swing.JComboBox<String> marks43;
    private javax.swing.JComboBox<String> marks51;
    private javax.swing.JComboBox<String> marks52;
    private javax.swing.JComboBox<String> marks53;
    private javax.swing.JComboBox<String> marks61;
    private javax.swing.JComboBox<String> marks62;
    private javax.swing.JComboBox<String> marks63;
    private javax.swing.JComboBox<String> marks71;
    private javax.swing.JComboBox<String> marks72;
    private javax.swing.JComboBox<String> marks73;
    private javax.swing.JLabel marksField1Label;
    private javax.swing.JLabel marksField2Label;
    private javax.swing.JLabel marksField3Label;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JLabel teamMember1;
    private javax.swing.JLabel teamMember2;
    private javax.swing.JLabel teamMember3;
    private javax.swing.JLabel teamMember4;
    private javax.swing.JLabel teamMember5;
    private javax.swing.JLabel teamMember6;
    private javax.swing.JLabel teamMember7;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}