import javax.swing.JOptionPane;

public class Vault {

static int code = 0000;
static boolean trycode(int guess) {
	if (guess == code) {
		return true;
	}else {
	return false;}


}
public static void main(String[] args) {
trycode(0000);	
System.out.println(trycode(0000));


}

}
