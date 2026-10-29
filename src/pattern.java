import java.util.Scanner;
public class pattern {

      static String repeat(String s, int n){
          String result ="";
          for (int i=0; i < n; i++){
              result += s;
          }
          return result;
      }
      // методы для паттернов
    static void printRightTriangle (int n){
          for (int i =1; i <= n; i++){
              System.out.println(repeat("*",i));
          }
    }
    static void printInvertedRightTriangle( int n){
          for (int i = n; i>=1; i--){
              System.out.println(repeat("*", i));
          }
    }
    static void printPyramid(int n){
          for (int i = 1; i<=n; i++){
              System.out.println(repeat("", n-i) + repeat("*", 2*i-1));
          }
    }
    static void printInvertedPyramid(int n){
          for (int i = n; i>=1; i--){
              System.out.println(repeat("",n-i) + repeat("*",2*i-1));
          }
    }
    static void printDiamond(int n){
          printPyramid(n);
          for (int i = n-1; i>=1; i--) {
              System.out.println(repeat("", n - i) + repeat("*", 2 * i - 1));
          }
    }
    static void showMenu(){
          System.out.println("Choose the pattern type:");
          System.out.println("1- Right Triangle");
          System.out.println("2- Inverted Right Triangle");
          System.out.println("3- Pyramid");
          System.out.println("4-Inverted Pyramid");
          System.out.println("5- Diamond");
          System.out.println("Your choice:");
    }
    static String getPatternName(int choice){
          switch(choice){
              case 1: return "Right Triangle";
              case 2: return "Inverted Right Triangle";
              case 3: return "Pyramid";
              case 4: return "Inverted Pyramid";
              case 5: return "Diamond";
              default: return "unknown";
          }
    }
    static void printPattern(int choice, int rows){
          switch (choice){
              case 1:printRightTriangle(rows); break;
              case 2:printInvertedRightTriangle(rows);break;
              case 3:printPyramid(rows);break;
              case 4:printInvertedPyramid(rows);break;
              case 5:printDiamond(rows);break;
              default:
                  System.out.println("Invalid choice!");

          }
    }
    // main
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number of rows:");
          int rows = scanner.nextInt();

          showMenu();
          int choice = scanner.nextInt();

          if (rows <=0 || choice <1 || choice>5){
              System.out.println("Invalid input !");
          } else{
              System.out.println("Size:"+ rows);
              System.out.println("Pattern:"+ getPatternName(choice));
              printPattern(choice , rows);
          }
          scanner.close();
    }

}
