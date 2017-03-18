package lcs.memoizing;

import lcs.memoizing.structures.Matrix;

public abstract class Lcs {

	protected static Matrix<Integer> table;
	protected static String a;
	protected static String b;
	
	public Lcs(String a, String b) {
		setUp(a, b);
	}
	
	public abstract int lcs();
	
	public static void setUp(String a, String b) {
		Lcs.a = a;
		Lcs.b = b;
		table = new Matrix<Integer>(a.length() + 1, b.length() + 1);
	}
	
	public String toString(){
		String temp = new String();
		int i = 0;
		int j = 0;
		while (i < table.getN() - 1 && j < table.getM() - 1){
			if (a.charAt(i) == b.charAt(j)){
				temp += a.charAt(i) + "";
			    i++; j++;
			}
			else if (table.get(i+1, j) >= table.get(i, j+1)) 
				i++;
			else 
				j++;
		}
		return temp;
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
	
}
