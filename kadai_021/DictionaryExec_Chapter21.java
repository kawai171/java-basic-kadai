package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 hanako = new Dictionary_Chapter21();
		hanako.addWords();
		String[] words = {"apple", "banana", "grape", "orange"};
		
		// ② 配列ごと1回だけ search に渡す
		hanako.search(words);

}
}
