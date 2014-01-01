public class Loops {

  public static void main(String[] args) {
    long before = System.nanoTime();
    long iterations = Long.parseLong(args[0]);
    System.out.println(iterations + " iterations");
    while (iterations > 0) {
      iterations--;
    }
    long time = System.nanoTime() - before;
    System.out.println((time/1000000) + " msecs");
  }

}
