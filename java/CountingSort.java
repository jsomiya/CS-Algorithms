public class CountingSort {
	public static int[] countingSort(int[] keys, int k) throws Exception {
		int[] sortedKeys = new int[keys.length];
		int[] counts = new int[k + 1];
		for(int i = 0; i < keys.length; i++) {
			if(keys[i] > k)
				throw new Exception("key out of range");
			counts[keys[i]]++;
		}
		for(int j = 1; j < counts.length; j++)
			counts[j] += counts[j - 1];
		for(int i = keys.length - 1; i >= 0; i--) {
			sortedKeys[counts[keys[i]] - 1] = keys[i];
			counts[keys[i]]--;
		}
		return sortedKeys;
	}
	
	public static void main(String... args) throws Exception {
		int[] keys = {12, 3, 79, 41, 41, 45, 7, 0};
		countingSort(keys, 79);
	}
}