import java.awt.event.*;  //import necessary packages
import javax.swing.*; 
import java.awt.Color;
public class first
{
    public static void main(String[] args)
    {
        JFrame main_frame = new JFrame("Check for integer");  
        main_frame.setSize(1000, 500); 

        JLabel prompt = new JLabel("Enter an integer: ");
        prompt.setBounds(350, 100, 200, 25);
        main_frame.add(prompt);

        JLabel right_input = new JLabel("You entered an integer");
        right_input.setBounds(450, 250, 120, 25);
        main_frame.add(right_input);
        right_input.setVisible(false);

        JLabel wrong_input = new JLabel("Please enter an integer");
        wrong_input.setBounds(450, 250, 150, 25);
        main_frame.add(wrong_input);
        wrong_input.setVisible(false);

        JTextField user_input = new JTextField();
        user_input.setBounds(460, 100, 200, 25);

        JButton verify_button = new JButton("Verify"); 
        verify_button.setBounds(550, 150, 100, 40); 
        verify_button.setBackground(Color.GREEN);
        verify_button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String user_num_string = user_input.getText(); 
                try
                {
                    int user_num_int = Integer.parseInt(user_num_string); 
                    right_input.setText("It is an integer: " + user_num_int);
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
        exit_button.setBounds(400, 150, 100, 40);
        exit_button.setBackground(Color.RED);
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
