package Snakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class End extends JFrame {

    public End() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Snake());
        
        setResizable(false);
        pack();
        
        setTitle("Amar Saap");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new End();
            ex.setVisible(true);
        });
    }
}