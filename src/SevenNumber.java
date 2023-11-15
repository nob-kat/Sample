
public class SevenNumber {

    public static void main(String[] args) {
        // iの値が1から100より小さい間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // iが7の倍数もしくは7が入っているのとき
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                // clap!と表示する
                System.out.println("clap!");
            // それ以外はiを表示する
            } else {
                System.out.println(i);
            }

        }
    }
}
