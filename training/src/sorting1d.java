
public class sorting1d {

	public static void main(String[] args) {
		
		int[] data = {11, 5, 20, 8, 17, 12};

		// Reference Link: https://visualgo.net/en/sorting
		// Bubble Sort
		for(int i=0;i<data.length;i++) {
			
			for(int j=0;j<data.length - i - 1; j++) {
				
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					for(int element : data) {
						System.out.print(element+"  ");
					}
					System.out.println("");
				}
			}
			System.out.println();
		}

		System.out.println("################");

		for(int element : data) {
			System.out.print(element+"  ");
		}

	}

}
