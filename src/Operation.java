
public class Operation {

	private int a,b;

	public Operation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	} 
	
	public int somme() {
		return a+b;
	}
	
	public int produit() {
		return a*b;
	}
	
	public int division() {
		return a/b;
	}
	
	public int soustraction() {
		return a-b;
	}
	
	public int maximum() {
		if(a>b)
			return a;
		else 
			return b; 
	}
}
