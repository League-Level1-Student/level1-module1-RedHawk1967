package popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

public static void main(String[] args) {
String flavor = JOptionPane.showInputDialog("What Flavor Do You Want Your Popcorn To Be?");
String time = JOptionPane.showInputDialog("How Many Minutes Would You Like To Cook Your Popcorn");
int timmy = Integer.parseInt(time);

Popcorn pop = new Popcorn(flavor);
	Microwave micro = new Microwave();
	micro.putInMicrowave(pop);
	micro.setTime(timmy);
	micro.startMicrowave();





}



}
