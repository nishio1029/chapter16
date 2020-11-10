import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {

		//HashSetの宣言
		Set<String> colors = new HashSet<>();

		//要素の追加
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		colors.add("赤");//重複して、「赤」を格納しようとしても無視される

		//格納されている要素数を返す
		System.out.println("色は" + colors.size() + "種類");
	}

}
