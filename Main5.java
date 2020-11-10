//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main5 {

	public static void main(String[] args) {

		//TreeSetは自然順序付けで整列(Stringは辞書順)
		//LinkedHashSetは値を格納した順序で整列

		Set<String> words = new TreeSet<>();
//		Set<String> words = new LinkedHashSet<>();

		//要素を追加
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");

		//要素を繰り返し出力
		for (String s : words) {
			System.out.print(s + "→");

		} //for
	}//main
}//class
