import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements MouseListener {
public static void main(String[] args) {
	
Binary_Converter binary = new Binary_Converter();
binary.Ui();





}

String convert(String input) {
    if(input.length() != 20){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + asciiValue;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
JLabel answer = new JLabel();
JTextField text = new JTextField(20);
void Ui() {

	JFrame frame = new JFrame("Convert 8 Bits Of Binary To ASCII");
JPanel panel = new JPanel();
JButton button = new JButton("Convert");


frame.setVisible(true);
frame.add(panel);
panel.add(text);
panel.add(button);
panel.add(answer);
button.addMouseListener(this);
frame.setPreferredSize(new Dimension(1000,300));
frame.pack();
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
answer.setText(convert(text.getText()));	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
