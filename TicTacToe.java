import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel  titlepanel=new JPanel();
    JPanel buttonpanel=new JPanel();
    JButton[]buttons=new JButton[9];
    JLabel textfield = new JLabel();
    boolean player1Turn;

    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setVisible(true);
        buttonpanel.setLayout(new GridLayout(3,3));
        buttonpanel.setBackground(new Color(150,150,150));
        frame.add(buttonpanel);
for (int i =0;i<9;i++){
    buttons[i]=new JButton();
    buttonpanel.add(buttons[i]);
    buttons[i].setFocusable(false);
buttons[i].addActionListener(this);
firstTurn();

}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i =0;i<9;i++){
            if (e.getSource()==buttons[i]){
                if (player1Turn){
                if (buttons[i].getText()==""){

                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1Turn=false;

check();
                    }
                }
                else  {
                    if (buttons[i].getText()==""){
                    buttons[i].setForeground(new Color(0,0,255));
                    buttons[i].setText("O");
                    player1Turn=true;

check();
                }
            }
            }
        }

    }
    public void firstTurn(){
if (random.nextInt(2)==0){
    player1Turn=true;
    textfield.setText("X turn");

}
else {
            player1Turn = false;
            textfield.setText("O turn");
        }
        }
    public void check() {
        if ((buttons[0].getText() == "X") &&
                (buttons[1].getText() == "X") &&
                (buttons[2].getText() == "X")
        ) {
            WinX(0, 1, 2);
        }
        if
        ((buttons[3].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X")
        ) {
            WinX(3, 4, 5);
        }

        if
        ((buttons[6].getText() == "X") &&
                (buttons[7].getText() == "X") &&
                (buttons[8].getText() == "X")
        ) {
            WinX(6, 7, 8);
        }
        if
        ((buttons[0].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X")
        ) {
            WinX(0, 4, 8);
        }
        if
        ((buttons[1].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[7].getText() == "X")
        ) {
            WinX(1, 4, 7);
        }
        if
        ((buttons[2].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[6].getText() == "X")
        ) {
            WinX(2, 4, 6);
        }
        if
        ((buttons[0].getText() == "X") &&
                (buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X")
        ) {
            WinX(0, 3, 6);
        }
        if
        ((buttons[2].getText() == "X") &&
                (buttons[5].getText() == "X") &&
                (buttons[8].getText() == "X")
        ) {
            WinX(2, 5, 8);
        }



   ///////////////////////////////////////////////////////////////////
        if
        ((buttons[0].getText() == "O") &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O")
        ) {
            WinO(0, 1, 2);
        }
        if
        ((buttons[3].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[5].getText() == "O")
        ) {
            WinO(3, 4, 5);
        }
        if
        ((buttons[6].getText() == "O") &&
                (buttons[7].getText() == "O") &&
                (buttons[8].getText() == "O")
        ) {
            WinO(6, 7, 8);
        }
        if
        ((buttons[0].getText() == "O") &&
                (buttons[3].getText() == "O") &&
                (buttons[6].getText() == "O")
        ) {
            WinO(0, 3, 6);
        }
        if
        ((buttons[1].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[7].getText() == "O")
        ) {
            WinO(1, 4, 7);
        }
        if
        ((buttons[2].getText() == "O") &&
                (buttons[5].getText() == "O") &&
                (buttons[8].getText() == "O")
        ) {
            WinO(2, 5, 8);
        }
        if
        ((buttons[0].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[8].getText() == "O")
        ) {
            WinO(0, 4, 8);
        }
        if
        ((buttons[2].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[6].getText() == "O")
        ) {
            WinO(2, 4, 6);
        }
    }


    public void WinX(int a,int b,int c){
buttons[a].setBackground(Color.orange);
        buttons[b].setBackground(Color.orange);
        buttons[c].setBackground(Color.orange);
        for (int i =0;i<9;i++){
            buttons[i].setEnabled(false);
        }
    }
    public void WinO(int a,int b,int c){
buttons[a].setBackground(Color.orange);
        buttons[b].setBackground(Color.orange);
        buttons[c].setBackground(Color.orange);
        for (int i =0;i<9;i++){
            buttons[i].setEnabled(false);
        }

    }

}
