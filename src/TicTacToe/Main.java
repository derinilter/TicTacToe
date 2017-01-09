package TicTacToe;

import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) 
    {
        JFrame ticTacToe = new TicTacToe();
        ticTacToe.setTitle("TicTacToe Game!");
        ticTacToe.setSize(600, 600);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
} 