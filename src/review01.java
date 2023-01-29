
public class review01 {

    public static void main(String[] args) {

        // 変数の宣言・初期化
        int num1 = 1500; // int型変数　商品価格を宣言し、１５００を代入
        int num2 = 10; // int型変数　消費税額を宣言し、10を代入
        int result1;
        result1 = tax(num1, num2);
        // int型変数result2を宣言し、商品価格とresult1の加算結果を代入
        int result2 = num1 + result1;
        // ○○円の商品の税込価格は○○円（消費税は○○円）です。
        System.out.println(num1 + "円の商品の税込価格は" + result2 + "円（消費税は" + result1 + "円）です。");
    }

    public static int tax(int num1, int num2) {
        int result4 = num1 * num2 / 100;  // int型変数result4を宣言し、消費税額を代入
        return result4;
            
    }
}