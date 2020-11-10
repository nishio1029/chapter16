import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//ArrayListの宣言
		ArrayList<Integer> points = new ArrayList<>();

		//		points.add(10);//自動的にIntegerに変換・格納される
		Integer li = Integer.valueOf(10);
		System.out.println(li);

		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		} //for
	}

}
