package kadai_015;

public class Car_Chapter15 {
    // フィールド（車の状態）
    private int gear = 1;   // ギア：最初は1
    private int speed = 10; // 速度：ギア1なら10km/h

    // ギアを変更するメソッド
    public void gearChange(int afterGear) {
        gear = afterGear; // ギアを変更

        // ギアに応じた速度に変える
        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10; // 想定外のギアでも10にする
                break;
        }

        // ギア変更メッセージ表示
        System.out.println("ギアを " + gear + " に切り替えました");
    }

    // 車を走らせるメソッド
    public void run() {
        System.out.println("速度は時速 " + speed + "km です");
    }
}