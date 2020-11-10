import java.util.HashSet;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {

		//HashSetの宣言
		Set<String> colors = new HashSet<>();

		//要素の追加
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		//繰り返し要素を出力
		for (String s : colors) {
			System.out.print(s + "→");
			//どのような順番で要素が取り出されるかは分からない

		} //for
	}//main

}//class
