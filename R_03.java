public class R_03{
  public static void main(String[] args){
    // 練習3-1
    // 1
    int weight = 60;
    String ans = weight == 60 ? "60ぴったりだ" : "60以外だ。" ;
    System.out.println(ans);

    // 2
    int age1 = 3, age2 = 5;
    ans = ( (age1 + age2) * 2 > 60 )? "60を超えている" : "60未満だ" ;
    System.out.println(ans);

    // 3
    int i = 11;
    ans = i % 2 == 1 ? "奇数" : "偶数" ;
    System.out.println(ans);

    // 4
    String name = "";
    ans = name.equals("湊")? "等しい" : "等しくない" ;
    System.out.println(ans);

    // 練習3-3
    // 1
    int isHungry = 1;
    String food = "Humberger";
    System.out.println("hello");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("腹ペコです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");

    System.out.println("-----------------------------------");
    System.out.println("練習3-5");
    System.out.println("-----------------------------------");
    // 1
    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 ＞");

    // 2
    int selected = new java.util.Scanner(System.in).nextInt();

    // 3
    switch (selected) {
      case 1 :
        System.out.println("検索します");
        break;

      case 2 :
        System.out.println("登録します");
        break;

      case 3 :
        System.out.println("削除します");
        break;

      case 4 :
        System.out.println("変更します");
        break;

      default:

    }

    System.out.println("-----------------------------------");
    System.out.println("練習3-6");
    System.out.println("-----------------------------------");
    // 1
    System.out.println("【数あてゲーム】");
    int ians = new java.util.Random().nextInt(10);
    for (i = 0; i < 5; i++){
      System.out.println("0〜9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      
      if (ians == num) {
        System.out.println("あたり！");
        break;

      } else {
        System.out.println("違います(" + ( i + 1) + "回目)");
      }
    }
    System.out.println("終了します。");
  }
}