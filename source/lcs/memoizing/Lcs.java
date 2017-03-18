package lcs.memoizing;

import lcs.memoizing.structures.Matrix;
import java.lang.StringBuilder;

public abstract class Lcs {

	protected static Matrix<Integer> table;
	protected static String a;
	protected static String b;
	protected static int nOperations;

	public Lcs(String a, String b) {
		setUp(a, b);
	}
	
	public abstract int lcs();
	
	/** Build table */
	public static void setUp(String a, String b) {
		Lcs.a = a;
		Lcs.b = b;
	    setnOperations(0);
		table = new Matrix<Integer>(a.length() + 1, b.length() + 1);
	}
	
	/** Backtracking*/
	public static String rebuild(int algorithm){
	if(algorithm == 2){ // TopDown
		String s = new String();
		int i = 0;
		int j = 0;
		while (i < table.getN()-1 && j < table.getM()-1){
			if (getA().charAt(i)==getB().charAt(j)){
			    s += getA().charAt(i) + "";
			    i++; j++;
			}
			else if (table.get(i+1, j) > table.get(i, j+1)) {
				i++;
			}
			else {
				j++;
			}
		}
		    return s;
	}
	else{ // Bottom Up
		StringBuffer sb = new StringBuffer();
		for (int x = getA().length()-1, y = getB().length()-1;x != 0 && y != 0; ) {
			if (table.get(x, y) == table.get(x - 1, y))
				x--;
			else if (table.get(x, y) == table.get(x, y - 1))
				y--;				else {
				assert a.charAt(x-1) == b.charAt(y-1);
				sb.append(a.charAt(x-1));
				x--;
				y--;
			}
		}
		return new StringBuilder(sb.toString()).reverse().toString();
	}
}

	public static Matrix<Integer> getTable() {
		return table;
	}

	public static void setTable(Matrix<Integer> table) {
		Lcs.table = table;
	}

	public static String getA() {
		return a;
	}

	public static void setA(String a) {
		Lcs.a = a;
	}

	public static String getB() {
		return b;
	}

	public static void setB(String b) {
		Lcs.b = b;
	}
	
	public static int getnOperations() {
		return nOperations;
	}

	public static void setnOperations(int nOperations) {
		Lcs.nOperations = nOperations;
	}
	
}
