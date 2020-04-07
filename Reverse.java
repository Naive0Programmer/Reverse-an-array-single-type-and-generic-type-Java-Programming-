import java.util.Arrays;

public class Reverse {
	public static <T> void Reverse (T[] data) {
		int low = 0, high = data.length-1;
		while(low < high) {
			Object swap [] = {data[low], data[high]};
			data[low++] = (T) swap[1];
			data[high--] = (T) swap[0];
		}
	}
	public static void main(String args[]) {
		Double data [] = {1.4,2.3,3.1,4.6,5.9,6.4};
		System.out.println(Arrays.toString(data));
		Reverse(data);
		System.out.println(Arrays.toString(data));
	}
}
