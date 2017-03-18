package lcs.memoizing;

public final class BottomUp extends Lcs{

	public BottomUp(String a, String b){
		super(a, b);
	}
	
	public static void setUp(String a, String b){
		Lcs.setUp(a, b);
	}
	
	public int lcs() {
		for (int i = 0; i < super.getTable().getN(); i++)
			for (int j = 0; j < super.getTable().getM(); j++)
				if(i == 0 || j == 0) 
					table.set(i, j, 0);
		for (int i = 0; i < super.getA().length(); i++){
			for (int j = 0; j < super.getB().length(); j++){
				if(super.getA().charAt(i) == super.getB().charAt(j))
					table.set(i + 1, j + 1, table.get(i, j) + 1);
				else 
					table.set(i + 1, j + 1, Math.max(table.get(i + 1, j), table.get(i, j + 1)));
			}
		}
		return table.get(super.getA().length(), super.getB().length());
	}
	
	public String toString(){
		return super.toString();
	}
	
}
