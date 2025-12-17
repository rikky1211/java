 public class R_05{
  public static void introduceOneself(){
    // 練習5-1
    String name = "湊雄輔";
    int age = 22;
    double height = 169.9;
    char zodiac = '辰';

    System.out.print("私の名前は" + name + "です。");
    System.out.print("歳は" + age + "です。");
    System.out.println("身長は" + height + "cmです。");
    System.out.println("十二支" + zodiac + "です。");
  }

  public static void email(String title, String address, String text){
    // 練習5-2
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }

  public static void email(String address, String text){
    // 練習5-3
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }

  public static double calcTriangleArea(double bottom, double height){
    // 練習5-4
    return bottom * height / 2;
  }

  public static double calcTriangleArea(double radius){
    // 練習5-4
    return 3.14 * radius * radius ;
  }

  public static void main(String[] args){
    System.out.println("");
    System.out.println("-----------------------------------");
    System.out.println("練習5-1");
    System.out.println("-----------------------------------");
    introduceOneself();

    System.out.println("");
    System.out.println("-----------------------------------");
    System.out.println("練習5-2");
    System.out.println("-----------------------------------");

    String title = "メールのタイトル";
    String address = "メールの宛先アドレス";
    String text = "メールの本文";
    email(title, address, text);

    System.out.println("");
    System.out.println("-----------------------------------");
    System.out.println("練習5-3");
    System.out.println("-----------------------------------");
    email(address, text);

    System.out.println("");
    System.out.println("-----------------------------------");
    System.out.println("練習5-4");
    System.out.println("-----------------------------------");

    double bottom = 10.0, height = 5.0;
    double triangleArea = calcTriangleArea(bottom, height);
    
    double radius = 5.0;
    double circleArea = calcTriangleArea(radius);

    System.out.print("・三角形の底辺の長さが" + bottom + "cm、");
    System.out.print("高さが" + height + "cmの場合、");
    System.out.println("面積は" + triangleArea + "平方cm");

    System.out.print("・円の半径が" + radius + "cmの場合、");
    System.out.println("面積は" + circleArea + "平方cm");

  }
 }