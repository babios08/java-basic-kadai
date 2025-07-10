package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区〇×です";

    // 共通の紹介
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address);
    }

    // 抽象メソッド（中身なし → 子で絶対実装）
    public abstract void eachIntroduce();

    // 紹介を実行するメソッド（子で共通処理）
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println(); // 空行
    }
}
