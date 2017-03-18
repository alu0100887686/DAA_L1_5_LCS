package testingbench;

import analysis.*;

public class TestBench {

	public static void main(String[] args) {
		try{
			switch (Integer.parseInt(args[0])){
				case 1: 
					iterator.iterate("BottomUp", Integer.parseInt(args[1]));
				case 2: 
					iterator.iterate("TopDown", Integer.parseInt(args[1]));
				case 3: 
					iterator.iterate("Recursive", Integer.parseInt(args[1]));
			}
		} catch(Exception e){
			throw new IllegalArgumentException("Illegal Argument");
		}
	}

}
