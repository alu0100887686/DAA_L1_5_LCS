package lcs.memoizing;

public final class TopDown extends Lcs{

	public TopDown(String a, String b){
		super(a, b);
	}
	
	public static void setUp(String a, String b){
		Lcs.setUp(a, b);
	}
	
	public int lcs() {
		setnOperations(0);
		for (int i = 0; i < table.getN(); i++)
		    for (int j = 0; j < table.getM(); j++)
		    	table.set(i, j, -1);
		return subproblem(0, 0);
	}
	
	private static int subproblem(int i, int j) {
		setnOperations(getnOperations()+1);
		if(table.get(i, j) < 0){
			if(i == a.length() || j == b.length())
				table.set(i, j, 0);
			else if(a.charAt(i ) == b.charAt(j))
				table.set(i, j, subproblem(i + 1, j + 1) + 1);
			else
				table.set(i, j, Math.max(subproblem(i + 1, j), subproblem(i, j + 1)));
		}
		return table.get(i, j);
	}
	
}
