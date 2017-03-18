package testingbench;

import analysis.*;

public class TestBench {

	public static void main(String[] args) {
		try{
			// Choose the algorithm
			switch (Integer.parseInt(args[0])){
				case 1: 
					iterator.iterate("BottomUp", Integer.parseInt(args[1]));
					break;
				case 2: 
					iterator.iterate("TopDown", Integer.parseInt(args[1]));
					break;
				case 3: 
					iterator.iterate("Recursive", Integer.parseInt(args[1]));
					break;
				default:
					break;
			}
		} catch(Exception e){
			throw new IllegalArgumentException("Illegal Argument");
		}
	}

}
