import java.util.Random;

public class James_Bond {
static Vault vault = new Vault(new Random().nextInt(1_000_001));




int findcode(Vault vault) {
	
	for (int i = 0; i < 1000001; i++) {
		
	if (vault.trycode(i)== true ) {
		return i; 
	}
	}  
	
	
	return -1;
	






}
public static void main(String[] args) {
	James_Bond james = new James_Bond();
	 System.out.println(james.findcode(vault));
}

}







