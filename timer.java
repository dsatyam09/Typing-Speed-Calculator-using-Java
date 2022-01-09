package trialGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.GroupLayout;

public class timer extends javax.swing.JFrame {

	JFrame f= new JFrame("Schedule Manager PROFILE");
    
    
    //My variables:
    int counter ;
    Boolean isIt = false;
    
    public timer() {
    	setAlwaysOnTop(true);
    	
    	getContentPane().setBackground(Color.PINK);
        initComponents();
    }



    private void initComponents() {

        timerName = new javax.swing.JLabel();
        timeLeft = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStart.setBackground(new Color(230, 230, 250));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        timerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timerName.setText("Timer : ");

        timeLeft.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        timeLeft.setText("03:00");

        btnStart.setText("Start");
        btnStart.setActionCommand("Start");
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {    
                btnStartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(76, Short.MAX_VALUE)
        			.addComponent(timerName)
        			.addGap(20)
        			.addComponent(timeLeft, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(112))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(110)
        			.addComponent(btnStart)
        			.addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(60)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(timerName)
        				.addComponent(timeLeft))
        			.addGap(34)
        			.addComponent(btnStart)
        			.addContainerGap(71, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }         

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {  
        Timer timer = new Timer(); //new timer
        counter = 3;      
        TimerTask task = new TimerTask() {         
            public void run() {                
                timeLeft.setText(Integer.toString(counter)); 
                counter --;
                if (counter == -1){
                    timer.cancel();    
                    
                    new jc().setVisible(true);
                  
                } 
            }
                  
        }; 
    }

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timer().setVisible(true);
            } 
        });
    }

    private javax.swing.JButton btnStart;
    private javax.swing.JLabel timeLeft;
    private javax.swing.JLabel timerName;
   
}
