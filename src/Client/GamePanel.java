package Client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Ian
 */
public class GamePanel extends JFrame implements ActionListener {
    
    Label answer1 = new Label("fråga 1", Label.CENTER);
    Label answer2 = new Label("fråga 2", Label.CENTER);
    Label answer3 = new Label("fråga 3", Label.CENTER);
    Label answer4 = new Label("fråga 3", Label.CENTER);
    JButton giveUp = new JButton("Ge upp");
    JButton startGame = new JButton("Start game yo");
    
    private final Color backgroundColor = new Color(175, 175, 255);
    
    
    GamePanel(){
        
        ResultPanel rp = new ResultPanel();
        QuestionPanel qp = new QuestionPanel(answer1, answer2, answer3, answer4, giveUp, backgroundColor);
        StartMenu sm = new StartMenu(startGame, backgroundColor);
        
        
        
        
    }
    
    public void setGameFrame(){
        setTitle("SUPERQUIZ");
        setSize(750, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        answer1.addMouseListener(ma);
        answer2.addMouseListener(ma);
        answer3.addMouseListener(ma);
        answer4.addMouseListener(ma);
                
        
        
    }

   
        MouseAdapter ma = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
           
                    if (e.getSource() == answer1) {
                        answer1.setBackground(Color.GREEN);
                    }
                    if (e.getSource() == answer2){
                        answer2.setBackground(Color.GREEN);
                    }
                    if (e.getSource() == answer3){
                        answer3.setBackground(Color.GREEN);
                    }
                    if (e.getSource() == answer4){
                        answer4.setBackground(Color.GREEN);
                    }
                     
                    
                }
            
        public void mouseReleased(MouseEvent e) {
             
                    if (e.getSource() == answer1) {
                        answer1.setBackground(Color.WHITE);
                    }
                    if (e.getSource() == answer2){
                        answer2.setBackground(Color.WHITE);
                    }
                    if (e.getSource() == answer3){
                        answer3.setBackground(Color.WHITE);
                    }
                    if (e.getSource() == answer4){
                        answer4.setBackground(Color.WHITE);
                    } 
                       
        }                 
    };
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        JButton pushed = (JButton) ae.getSource();
        
        if(pushed == giveUp){
            System.exit(0);
        }
        
        
        
    }
    
}
  
    

    

            

    
    
    


         
                 

    
    
            
    
