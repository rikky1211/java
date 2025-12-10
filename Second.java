public class Second {
    public static void main(String[] args) {
        String msg = "ようこそ占いの館へ";
        System.out.println(msg);

        msg = "あなたの名前を入力してください＞";
        System.out.print(msg);

        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println(name + "さんですね");

        msg = "あなたの年齢を入力してください＞";
        System.out.print(msg);

        String ageString = new java.util.Scanner(System.in).nextLine();
        System.out.println(ageString + "歳ですね");
        int age = Integer.parseInt(ageString);

        int fortune = new java.util.Random().nextInt(4);
        fortune++;

        System.out.println("占いの結果が出ました！");
        System.out.println(name + "さん(" + age + ")の占い結果は" + fortune + "です！");
    }
}

