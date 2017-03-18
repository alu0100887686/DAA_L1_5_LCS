package lcs.memoizing.structures;

import java.util.ArrayList;

public final class Matrix<T>{
	
	private ArrayList<ArrayList<T>> table;
	
	//(Rows, Columns) 
	@SuppressWarnings("unchecked")
	public Matrix(int m, int n){
		table = new ArrayList<ArrayList<T>>();
		for(int i = 0; i < m; i++)
			table.add(new ArrayList<T>());
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				table.get(i).add((T) new Object());
	}

	public Matrix(Matrix<T> cpy){
		table = new ArrayList<ArrayList<T>>(getTable());
	}
	
	//Row Column
	public T get(int i, int j){
		try{
			return table.get(i).get(j);
		} catch(Exception exc){
			throw new IllegalArgumentException("Indexs out of range");
		}
	}
	
	//Rows
	public Integer getN(){
		return table.size();
	}
	
	//Columns
	public Integer getM(){
		return table.get(0).size();
	}
	
	//(Row, Column, Value) 
	public T set(int i, int j, T value){
		try{
			return table.get(i).set(j, value);
		} catch(Exception exc){
			throw new IllegalArgumentException("Indexs out of range");
		}
		
	}
	
	public ArrayList<ArrayList<T>> getTable() {
		return table;
	}

	public void setTable(ArrayList<ArrayList<T>> table) {
		this.table = table;
	}
	
	public String toString(){
		String ostream = new String();
		for(ArrayList<T> temp : table)
			ostream += temp + "\n";
		return ostream;
	}
	
	public static void main(String[] args) {
		
		Matrix<Integer> a = new Matrix<Integer>(6, 32);
		for(int i = 0; i < 6; i++)
			for(int j = 0; j < 32; j++)
				a.set(i, j, 1);
		System.out.println(a);
	}
	
}
