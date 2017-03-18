package lcs.memoizing;

public final class BottomUp extends Lcs{

	public BottomUp(String a, String b){
		super(a, b);
	}
	
	public static void setUp(String a, String b){
		Lcs.setUp(a, b);
	}
	
	public int lcs() {
		setnOperations(0);
		for (int i = 0; i < super.getTable().getN(); i++)
			for (int j = 0; j < super.getTable().getM(); j++){
				if(i == 0 || j == 0) 
					table.set(i, j, 0);
			}
				
		for (int i = 1; i <= super.getA().length(); i++){
			for (int j = 1; j <= super.getB().length(); j++){
				if(super.getA().charAt(i-1) == super.getB().charAt(j-1))
					table.set(i, j, table.get(i - 1, j - 1) + 1);
				else 
					table.set(i, j, Math.max(table.get(i - 1, j), table.get(i, j - 1)));
				setnOperations(getnOperations()+1);
			}
		}
		return table.get(super.getA().length(), super.getB().length());
	}
	
}
