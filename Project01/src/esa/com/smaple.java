package esa.com;

public class smaple {

	public static void main(String[] args) {
		System.out.println("then out going...");
		int[] arr = {1,2,3, 2,3};
		System.out.println(is123Array(arr));
	}
	private static int is123Array(int[] arr) {
		if (arr.length == 0 || arr[arr.length-1] != 3)
			return 0;
		for ( int i = 0 ; i < arr.length-1 ; i++ ) {
			if ( arr[i] == 1 && arr[i + 1] != 2 )
				return 0;
			else if ( arr[i] == 2 && arr[i + 1] != 3 ) 
				return 0;
			else if ( arr[i] == 3 && arr[i + 1] != 1 )
				return 0;
		}
		return 1;
	}
}
