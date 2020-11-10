import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		//ArrayListの宣言
		ArrayList<String> names = new ArrayList<>();

		//箱にデータを挿入
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();

		//矢印を次に進めれるなら繰り返す
		while (it.hasNext()) {

			//矢印を次に進め、内容を取り出す
			String e = it.next();
			System.out.println(e);
		}

	}

}
