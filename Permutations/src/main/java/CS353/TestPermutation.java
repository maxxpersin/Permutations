package CS353;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPermutation {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		List<List<Integer>> testCaseOutput = new ArrayList();
		
		// Case 1:
		System.out.println("TEST CASE 1:");
		// input
		int[] testCase = {1};
		// build the expected output for case 1
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(1)));
		// make method call to the solution
		List<List<Integer>> res = sol.permute(testCase);
		// display the result from the algorithm
		System.out.println("Your result is:");
		printListList(res);
		// display the expected output
		System.out.println("Expected result should be:");
		printListList(testCaseOutput);
		
		System.out.println("------");
		// Case 2:
		System.out.println("TEST CASE 2:");
		// input
		testCase = new int[] {1, 2, 3};
		// build the expected output for case 1
		testCaseOutput.clear();
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(1, 3, 2)));
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(2, 1, 3)));
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(2, 3, 1)));
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(3, 1, 2)));
		testCaseOutput.add(new ArrayList<Integer>(Arrays.asList(3, 2, 1)));
		// make method call to the solution
		res = sol.permute(testCase);
		// display the result from the algorithm
		System.out.println("Your result is:");
		printListList(res);
		// display the expected output
		System.out.println("Expected result should be:");
		printListList(testCaseOutput);
	}
	
	private static void printListList(List<List<Integer>> list) {
		
		System.out.println('[');
		// traverse the list of list
		for (int i = 0; i < list.size(); i++) {
			// obtain the sublist from the list of list
			List<Integer> sublist = list.get(i);
			// print out the sublist
			System.out.print("[");
			
			// traverse the sublist
			if (sublist.size() == 0) {
				System.out.print("]");
			}
			else {
				for (int j = 0; j < sublist.size(); j++) {
					System.out.print(Integer.toString(sublist.get(j)));
					
					if (j == sublist.size() - 1) {
						System.out.print("]");
					}
					else {
						System.out.print(", ");
					}
				}
			}
			
			System.out.println();
		}
		System.out.println(']');
	}

}
