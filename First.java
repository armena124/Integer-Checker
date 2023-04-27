//import necessary packages
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class first
{
    public static void main(String[] args)
    {
        //set up frame
        JFrame main_frame = new JFrame("Check for integer");  
        main_frame.setSize(500, 500); 
        
        //GUI elements 
        JLabel prompt = new JLabel("Enter an integer: ");
        prompt.setBounds(100, 100, 200, 25);
        main_frame.add(prompt);

        JLabel right_input = new JLabel("You entered an integer");
        right_input.setBounds(210, 250, 120, 25);
        main_frame.add(right_input);
        right_input.setVisible(false);

        JLabel wrong_input = new JLabel("Please Enter an integer");
        wrong_input.setBounds(190, 250, 150, 25);
        main_frame.add(wrong_input);
        wrong_input.setVisible(false);

        JTextField user_input = new JTextField();
        user_input.setBounds(200, 100, 200, 25);

        JButton verify_button = new JButton("Verify"); 
        verify_button.setBounds(100, 150, 100, 40); 
        
        verify_button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Verify if input is integer
                String user_string = user_input.getText(); 
                try
                {
                    int user_int = Integer.parseInt(user_string); 
                    right_input.setText("It is an integer: " + user_int);
                    wrong_input.setVisible(false);
                    right_input.setVisible(true);
                }
                catch(NumberFormatException err)
                {
                    right_input.setVisible(false);
                    wrong_input.setVisible(true);
                }
                finally 
                {
                    main_frame.revalidate();
                    main_frame.repaint();
                }
            }
        });
        JButton exit_button = new JButton("Exit");
        exit_button.setBounds(300, 150, 100, 40);
        exit_button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                main_frame.dispose();
            }
        });

        main_frame.add(user_input);
        main_frame.add(verify_button); 
        main_frame.add(exit_button);
        main_frame.setLayout(null); 
        main_frame.setResizable(false);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        main_frame.setVisible(true); 
    }
}
