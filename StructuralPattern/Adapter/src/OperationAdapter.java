/**
 * 核心适配器类
 * Author: markliu
 * Time  : 16-8-28 下午5:33
 */
public class OperationAdapter implements ScoreOperation {

	private QuickSort quickSort;
	private BinarySearch binarySearch;

	public OperationAdapter() {
		quickSort = new QuickSort();
		binarySearch = new BinarySearch();
	}

	@Override
	public int[] sort(int[] array) {
		int[] result = quickSort.quickSort(array);
		System.out.println("调用适配器 OperationAdapter 的 sort 方法");
		return result;
	}

	@Override
	public int search(int[] array, int key) {
		int result = binarySearch.binarySearch(array, key);
		System.out.println("调用适配器 OperationAdapter 的 search 方法");
		return result;
	}
}
