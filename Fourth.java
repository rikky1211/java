public class Fourth{
  public static void main(String[] args){

    // P157
    int[] scores = {10, 20, 30, 40, 50};
    for(int values : scores){
      System.out.println(values);
    }

    System.out.println("-----------------------------------");
    System.out.println("練習4-1");
    System.out.println("-----------------------------------");


    System.out.println("-1");
    int i = 4;
    int[] points = new int[i];

    points[0] = 10;
    points[1] = 20;
    points[2] = 30;
    points[3] = 40;
    for(int j: points){
      System.out.println(j);
    };

    System.out.println("");
    System.out.println("-2");
    double[] weights = {1.1, 2.2, 3.3, 4.4, 5.5};
    for(double value : weights){
      System.out.println(value);
    }

    System.out.println("");
    System.out.println("-3");

    boolean[] answers = {true, false, false, false, true}; 
    for(int k = 0 ; k < answers.length ; k++ ){
      System.out.println(answers[k]);
    }
  
    System.out.println("");
    System.out.println("-4");

    String[] names = {"Ann", "Brown", "Crean", "Deen"};
    for(String values : names){
      System.out.println(values);
    }

    System.out.println("-----------------------------------");
    System.out.println("練習4-2");
    System.out.println("-----------------------------------");

    System.out.println("");
    System.out.println("-1");
    int[] moneyList = {121902, 6302, 55100};

    System.out.println("");
    System.out.println("-2");
    for(int value = 0; value < moneyList.length; value++){
      System.out.println(moneyList[value]);
    }


    System.out.println("");
    System.out.println("-3");
    for(int value : moneyList){
      System.out.println(value);
    }

    System.out.println("-----------------------------------");
    System.out.println("練習4-4");
    System.out.println("-----------------------------------");

    int[] numbers = {3, 4, 9};
    System.out.print("1桁の数字を入力してください：");
    int number = new java.util.Scanner(System.in).nextInt();
    for(int value : numbers){
      if (value == number){
        System.out.println("あたり！");
      }
    }
  }
}