import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSumRedo {
	public static void main(String[] args) {
		int [] nums = { 3,2,4} ;
		TwoSumRedo two = new TwoSumRedo();
		System.out.println(Arrays.toString(two.TwoSum(nums, 6)));
		
		
	}
	
	public int[] TwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<nums.length; i++){
			//so since the target-nums[i] is the key
			// this means that when we call the map.contains key
			// we look just at the keys 
			// we also keep track of these keys by starting the values
			//so, when we use the map.get function
			// the map.get function returns the value
			// in this case, the value is the position of the number
			// which complements the other number
			// these numbers are complements because
			// we have our code set up in such a way that
			// the value is returned when the key matches the difference 
			// between target-nums[i]
			// which will add up to the target 
			if(map.containsKey(target - nums[i])) {
				return new int [] {map.get(target-nums[i]), i};
			}
			map.put(nums[i], i);
		}
		return new int[0];
		
	}

}
