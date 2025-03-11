package com.advanced;
import javax.swing.*;
import java.awt.*;
public class SimpleAnimation
{
    int x = 5;
    int y = 5;
    public static void main (String[]args)
    {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go ()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel2 mdp2 = new MyDrawPanel2();

        frame.getContentPane().add(mdp2);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++)
        {
            x++;
            y++;
            mdp2.repaint();
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {

            }

        }
    }

        class MyDrawPanel2 extends JPanel
        {
            public void paintComponent(Graphics g)
            {
                g.setColor(Color.white);
                g.fillRect(0,0,this.getWidth(), this.getHeight());

                g.setColor(Color.green);
                g.fillOval(x,y,50,50);
            }
        }
}

