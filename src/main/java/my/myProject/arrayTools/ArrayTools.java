package my.myProject.arrayTools;

public class ArrayTools {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,7,8};	
//		int []arr= {8,7,6,4,3,1};
//		Arrays.bubbleSort(arr);
		Arrays.selectSort(arr);
//		Arrays.reverseSort(arr);
		Arrays.print(arr);
//		int res=Arrays.halfSearch(arr,4);
//		System.out.println(res);
	}

	

}

class Arrays{
	
	private Arrays() {
		
	}
	//1:定义一个遍历数组的函数
	public static void print(int []arr ) {
		
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
	
//	2:定义一个求数组和的功能函数  1. 遍历  2. 两两相加
	public static int getSum(int []arr ) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
//	3:定义一个获取数组最大值的功能函数
	
	public static int getMax(int []arr ) {
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
//	4:定义一个返回指定数在指定数组中包含的角标的功能函数
	public static int getIndex(int []arr,int src ) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(src==arr[i]) {
				index=i;
			}
		}	
		return index;
	}
	

//	5:定义一个可以用于排序int数组的函数
//		1:冒泡
//		2:选择	
//	    3.折半二分法查找
	public static void bubbleSort(int []arr ) {
		int temp;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}
		System.out.println("冒泡排序法:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void selectSort(int []arr) {
		int temp;
		for(int j=0;j<arr.length;j++) {
			for (int i=j+1;i<arr.length;i++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("选择排序法:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+" ");
		}
	}
//	int []arr= {2,3,4,7,8,1};
	public static int halfSearch(int []arr,int key) {
		 int start = 0;
	        int end = arr.length - 1;//8
	        while (start <= end) {
	            int middle = (start + end) / 2;//中间值:4,1,2
	            if (key < arr[middle]) {
	                end = middle - 1;
	            } else if (key > arr[middle]) {
	                start = middle + 1;
	            } else {
	                return middle;
	            }
	        }
	        return -1;
		}
		
	
//	6:定义一个可以用于反转数组顺序的函数	
	public static void reverseSort(int []arr) {
		int start=0;
		int end=arr.length-1;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(start<end) {
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
			start++;
			end--;
		}
		System.out.println("");
		System.out.println("倒序");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
//  7.数组的去重	
	public static int[] clearRepeat(int[] arr){
		//先计算出重复元素的格式:
		int count = 0; //记录重复元素的个数
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]==arr[j]){
					count++;
					break;
				}
			}
		}
		
		//新数组 的长度
		int newLength = arr.length - count;
		//创建一个新的数组
		int[] newArr = new int[newLength];

		int index = 0 ; 	//新数组的索引值

		
		//遍历旧数组
		for(int i = 0  ; i< arr.length ; i++){
			int temp = arr[i];  //旧数组中的元素 
			boolean flag = false;  //默认不是重复元素
			
			
			//拿着旧数组 的元素 与新数组的每个元素比较一次。
			for(int j = 0 ; j< newArr.length ; j++){
				if(temp==newArr[j]){
					flag = true;
					break;
				}
			}
			
			if(flag == false){
				newArr[index++] = temp;
			}
		}
		
		return newArr;
	}
	
}
