package corejava.arrays;

public class double_dimensional_arrays {

	public static void main(String[] args) {
		
		
		
String data[][]=new String[3][2];
		
		//1s Row data
		data[0][0]="Arun";
		data[0][1]="25";
		
		//2nd Row data
		data[1][0]="krishna";
		data[1][1]="26";
		
		//3rd Row data
		data[2][0]="Raj";
		data[2][1]="29";
		
		System.out.println("2nd row and firstcell value is => "+data[2][1]);
	}

}
