import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyExample extends JFrame {
	 
    static MyExample myFrame;
    static int countMe = 0;
    JPanel mainPanel;
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
 
    private static void createAndShowGUI() {
        myFrame = new MyExample();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.prepareUI();
        
        myFrame.setBounds(new Rectangle(500, 500));
        //myFrame.pack();
        myFrame.setVisible(true);
          
    }
 
    private void prepareUI() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
 
        JButton buttonAdd = new JButton("Add subPanel");
        buttonAdd.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
            	for(int i = 0; i < 2; i++){
            		subPanel newSubPanel = new subPanel();
            		newSubPanel.setName("Member"+i);
            		mainPanel.add(newSubPanel);
            	}
                myFrame.pack();
            }
        });
         
        JButton buttonRemoveAll = new JButton("Remove All");
        buttonRemoveAll.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                //myFrame.pack();
            }
        });
 
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        getContentPane().add(buttonAdd, BorderLayout.PAGE_START);
        getContentPane().add(buttonRemoveAll, BorderLayout.PAGE_END);
    }
 
    private class subPanel extends JPanel { 
        subPanel me;
        public subPanel() {
            super();
            me = this;
            JLabel myLabel = new JLabel("Team Member " + countMe++);
            add(myLabel);
            
            String[] possibleMarks = { "0", "1", "2", "3","4","5" };
            JComboBox<String> markList1 = new JComboBox<>(possibleMarks);
            add(markList1);
            JComboBox<String> markList2 = new JComboBox<>(possibleMarks);
            add(markList2);
            JComboBox<String> markList3 = new JComboBox<>(possibleMarks);
            add(markList3);
        }
    }
}