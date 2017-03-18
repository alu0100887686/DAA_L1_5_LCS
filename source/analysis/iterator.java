package analysis;

import lcs.Recursive;
import lcs.memoizing.*;

//Get T(n) 
public final class iterator {
	public static void iterate(String algorithm , int size){
		int avg;
		for(int i = 1; i <= size; i++){ //Size
			avg = 0;
			for(int j = 0; j < 30; j++){ //Average (30 tests for same size)
				Timer.start();
				if(algorithm.equals("TopDown"))
					new TopDown(RandomString.get(i), RandomString.get(i)).lcs();
				else if(algorithm.equals("Recursive"))
					Recursive.lcs(RandomString.get(i), RandomString.get(i));
				else if(algorithm.equals("BottomUp"))
					new BottomUp(RandomString.get(i), RandomString.get(i)).lcs();
				Timer.stop();
				avg += Timer.elapsedTime();
			}
			// Show the experimental data analysis
			if(algorithm.equals("Recursive")){ // Recursive algorithm with out backtracking
				System.out.println("- Input size: " + i + ", Algorithm: " + algorithm + ", Time: " + avg / 30 
						+ " ms, T(" + i + "): " + Recursive.getnOperations());
			}
			else{ // Memoization algorithms with backtracking
				System.out.println("- Input size: " + i + ", Algorithm: " + algorithm + ", Time: " 
			+ avg / 30 + " ms, T(" + i + "): " + Lcs.getnOperations() + "\nA: "+ Lcs.getA() +"\nB: "+ Lcs.getB() 
			+  "\nSubsequence: " + Lcs.rebuild(algorithm.equals("TopDown") ? 2 : 1) + "\n");
			}
		}
	}
}
