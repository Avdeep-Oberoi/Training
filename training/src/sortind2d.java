
public class sortind2d {

	public static void main(String[] args) {
		int[][] arr2D = {
				{1,12,3,4},
				{5,62,7,8},
				{9,40,11,12},
				{13,4,15,16},
				{17,1,19,20},
		};
		String[] city = {"ConfirmedCases", " ActiveCases", " Cured/Discharged", " Death"};
		for(int i=0;i<4;i++){
		    System.out.print(city[i]);
		    }
System.out.println("");
		for (int element[]:arr2D) {
			for (int innerElement:element) {
				System.out.print(innerElement+",             ");
			}
			System.out.println("");
		}
		
		/*
		System.out.println(arr2D[1]);
		System.out.println(arr2D[2]);
		int [][] swap = new int [1][4];
		swap[0] = arr2D[2];
		arr2D[1] = swap[0];
		
		System.out.println("after"+arr2D[1][1]);
		System.out.println("after"+arr2D[2][1]);
	*/

		
		for(int i=0;i<arr2D.length;i++) {
					
					for(int j=0;j<arr2D.length - i - 1; j++) {
						
						if(arr2D[j][1] > arr2D[j+1][1]) {
							int [][] swap = new int [1][4];
							swap[0] = arr2D[j];
							arr2D[j] = arr2D[j+1];
							arr2D[j+1] = swap[0];
						}
					}
				}
		
		System.out.println("");
		System.out.println("###### AFTER SORTING  Active Cases ##########");
		System.out.println("");
		
		for(int i=0;i<4;i++){
			System.out.print(city[i]);
		}
		System.out.println("");
		for (int element[]:arr2D) {
			for (int innerElement:element) {
				System.out.print(innerElement+",             ");
			}
			System.out.println("");
		}
				
		

	}

}
