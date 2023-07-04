import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
public class thwosums {
	public static void main(String[] args) {
		thwosums two = new thwosums();
		int nums[] = {1,2,4};
		int [] result = two.twosum(6, nums);
		System.out.println(Arrays.toString(result));
		
		
	}
	public int[] twosum(int target, int nums[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] { i, map.get(target-nums[i])};
			}
			map.put(nums[i], i);
		}
		return new int[0];
	}

}
