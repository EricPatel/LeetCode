import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BinaryTreeMaximumPathSum {
	public int maxPathSum(TreeNode root) {
		return sumHelper(root, root.val);
	}

	public int sumHelper(TreeNode root, int sum) {
		if (root.left == null && root.right == null) {
			return Math.max(0, root.val);
		}
		
	}

	  public static void matchBenchmark(String input) {
		    String[] parts = input.split(":");
		    Map<String, Integer> assets = new HashMap<String, Integer>();
		    String[] first = parts[0].split("\\Q|\\E");
		    for(int i = 0; i < first.length; i++){
		      String[] currLine = first[i].split(",");
		      assets.put(currLine[0]+","+currLine[1], Integer.parseInt(currLine[2]));
		    }
		    String[] second = parts[1].split("\\Q|\\E");
		    for(int i = 0; i < second.length; i++){
		      String[] currLine = second[i].split(",");
		      if(assets.containsKey(currLine[0]+","+currLine[1])){
		        assets.put(currLine[0]+","+currLine[1], assets.get(currLine[0]+","+currLine[1])-Integer.parseInt(currLine[2]));
		      }
		      else{
		        assets.put(currLine[0]+","+currLine[1], Integer.parseInt(currLine[2]));
		      }
		    }
		    Treemap<String, Integer> sortedMap = new TreeMap<String, Integer>(assets);
		    for (Map.Entry<String, Integer> entry: sorterMap.entrySet()){
		      if(entry.getValue() < 0){
		        System.out.print("SELL,");
		      }
		      else{
		        System.out.print("BUY,");
		      }
		      System.out.print(entry.getKey()+",");
		      System.out.println(Math.abs(entry.getValue()));
		    }
		  }
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
