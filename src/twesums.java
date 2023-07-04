import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class twesums {
	public static void main(String[] args) {
		twesums two = new twesums();
		int [] nums = { 3, 2 ,4};
		int [] result = two.twosums(6, nums);
		System.out.println(Arrays.toString(result));
		
	}
	
	public int[] twosums(int target, int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] { i, map.get(target - nums[i])};
			}
			map.put(nums[i], i);
		}
		return new int[0];
		
	}

}

