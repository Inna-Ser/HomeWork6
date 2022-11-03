public class Main {
    public static void main(String[] args) {
      for (int i = 1; i < 11; i ++) {
          System.out.println("Итерация цикла " + i);
      }
      // В обратном порядке
      for (int y = 10; y > 0; y --) {
          System.out.println("Итерация цикла " + y);
      }
      // Четные числа
      for (int x = 0; x < 18 && x % 2 == 0; x = x + 2) {
          System.out.println("Итерация цикла " + x);
      }
      // От большего к мменьшему
      for (int b = 10; b > -11; b --) {
          System.out.println("Итерация цикла " + b);
      }
      // Високосный год
      for (int c = 1904; c < 2097; c = c + 4) {
          System.out.println(c + " год является высокосным.");
      }
    }
}