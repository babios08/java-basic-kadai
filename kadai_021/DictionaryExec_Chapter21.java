package kadai_021;


public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書オブジェクトを生成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語
        String[] words = {"apple", "banana", "grape", "orange"};

        // 1つずつ検索
        for (String word : words) {
            dictionary.searchWord(word);
        }
    }
} 
  