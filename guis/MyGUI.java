package guis;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Playing with GUIs.
 * 
 * @author Willow Sapphire
 * @version 02/14/2024
 */
public class MyGUI
{
    private JFrame frame;
    private JLabel label;
    private JTextField input;

    /**
     * Share ActionListener being used for multiple buttons.
     * Anonymous inner class
     */
    private ActionListener listener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String buttonLabel = ((Button) e.getSource()).getLabel();
            if(buttonLabel.equals("Uppercase"))
            {
                label.setText(input.getText().toUpperCase());
            }
            else if (buttonLabel.equals("Lowercase"))
            {
                label.setText(input.getText().toLowerCase());
            }
            else
            {
                label.setText("Invalid Button Clicked");
            }
        }
    };

    /**
     * Creates the GUI.
     * @param width the width for the window.
     * @param height the height for the window.
     * @param x the x position at which to create the GUI.
     * @param y the y position at which to create the GUI.
     */
    public MyGUI(int width, int height, int x, int y)
    {
        this.frame = new JFrame("My GUI");
        this.frame.setSize(width, height);
        this.frame.setLocation(x, y);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialize();
        this.frame.setVisible(true);
    }

    /**
     * Initializes the pieces of the GUI.
     */
    public void initialize()
    {
        JPanel panel = new JPanel();
        this.input = new JTextField(20);
        this.label = new JLabel("Hello World");
        panel.add(input);
        panel.add(label);
        this.frame.add(panel, BorderLayout.CENTER);
        addButtons();
    }

    /**
     * Adds the buttons to the GUI.
     */
    public void addButtons()
    {
        JPanel panel2 = new JPanel();
        Button button1 = new Button("Uppercase");
        Button button2 = new Button("Lowercase");
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        panel2.add(button1);
        panel2.add(button2);
        this.frame.add(panel2, BorderLayout.PAGE_END);
    }

    /**
     * Using a non-anonymous inner-class
     */
    // private class MyListener implements ActionListener
    // {
    //     @Override
    //     public void actionPerformed(ActionEvent e)
    //     {
    //         label.setText("Clicked");
    //     }
    // }
}
