public class Main {
    public static void main(String[] args) {
      for (int i = 1; i < 11; i ++) {
          System.out.println("Итераация цикла " + i);
      }
      // В обратном порядке
      for (int y = 10; y > 0; y --) {
          System.out.println("Итераация цикла " + y);
      }
      // Четные числа
      for (int x = 0; x < 18 && x % 2 == 0; x = x + 2) {
          System.out.println("Итераация цикла " + x);
      }
    }
}