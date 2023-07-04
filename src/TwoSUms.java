import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


public class TwoSUms {
	public static void main(String[] args) {	
		TwoSUms two = new TwoSUms();
		int[] nums = {3,2,4};
		int [] result = two.TwoSum(nums, 6);
		System.out.println(Arrays.toString(result));
		// so you have to state that it is an array
		// then you have to transform that array into a string
		
	}
	public int[] TwoSum(int[] nums, int target ) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] {i, map.get(target-nums[i])};
				}
			map.put(nums[i], i);
			}
		return new int[0];
		}
	}


