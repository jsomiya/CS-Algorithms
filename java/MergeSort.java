public class MergeSort {
	public static void mergeSort(int[] keys, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(keys, left, mid);
			mergeSort(keys, mid + 1, right);
			merge(keys, left, mid, right);
		}
	}
	
	public static void merge(int[] keys, int left, int mid, int right) {
		int sizeFieldLeft = mid - left + 2;
		int sizeFieldRight = right - mid + 1;
		int[] fieldLeft = new int[sizeFieldLeft];
		int[] fieldRight = new int[sizeFieldRight];
		for(int i = 0; i < sizeFieldLeft - 1; i++)
			fieldLeft[i] = keys[left + i - 1];
		fieldLeft[sizeFieldLeft - 1] = Integer.MAX_VALUE;
		for(int j = 0; j < sizeFieldRight - 1; j++)
			fieldRight[j] = keys[mid + j];
		fieldRight[sizeFieldRight - 1] = Integer.MAX_VALUE;
		int indexLeft = 0;
		int indexRight = 0;
		for(int i = left - 1; i < right; i++) {
			if(fieldLeft[indexLeft] <= fieldRight[indexRight]) {
				keys[i] = fieldLeft[indexLeft];
				indexLeft++;
			}
			else {
				keys[i] = fieldRight[indexRight];
				indexRight++;
			}
		}
	}
	
	public static void main(String... args) {
		int[] keys = {12, 3, 79, 41, 41, 45, 7, 0};
		mergeSort(keys, 1, keys.length);
	}
}