
public class BubbleSort {

	public static void main(String[] args) {
		
		int nums[]= {6,5,2,8,9,4};
		int size = nums.length;
		int temp=0;
		
		System.out.println("Before Sorting");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
		for(int i=0;i<size;i++) 
		{
			for(int j=0;j<size-i-1;j++) 
			{
				if(nums[j] > nums[j+1])
				{
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
//			System.out.println();
//			for(int num : nums) {
//				System.out.print(num +" ");
//			}
		}
		
		
		System.out.println();
		System.out.println("After Sorting");
		for(int num : nums) {
			System.out.print(num +" ");
		}
		
	}

}
