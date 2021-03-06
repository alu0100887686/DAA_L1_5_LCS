package lcs;

public class Recursive {
	
	private static String a, b;
	protected static int nOperations;
	
	public Recursive(){}
	
	public static int lcs(String a, String b) {
		setA(new String(a));
		setB(new String(b));
		setnOperations(0);
		return subproblem(getA().length() - 1, getB().length() - 1);
	}
	
	private static int subproblem(int i, int j) {
		Recursive.setnOperations(Recursive.getnOperations()+1);
		if(i == -1 || j == -1)
			return 0;
		if((i >= 0) && (j >= 0) && (getA().charAt(i) == getB().charAt(j)))
			return subproblem(i - 1, j - 1) + 1;
		else 
			return Math.max(subproblem(i - 1, j), subproblem(i, j - 1));
	}

	public static String getA() {
		return a;
	}
	
	public static void setA(String a) {
		Recursive.a = a;
	}
	
	public static String getB() {
		return b;
	}
	
	public static void setB(String b) {
		Recursive.b = b;
	}

	public static int getnOperations() {
		return nOperations;
	}

	public static void setnOperations(int nOperations) {
		Recursive.nOperations = nOperations;
	}
	

}
