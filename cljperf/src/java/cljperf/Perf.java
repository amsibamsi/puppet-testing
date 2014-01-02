package cljperf;

public class Perf {

  public static void perf(long iterations) {
    System.out.println("java performance");
    System.out.println("for loop...");
    long before = System.nanoTime();
    long x = 0;
    for (long i=0; i<iterations; i++) {
      // need to do something so loop is not removed for optimization?
      x = x + 1;
    }
    double elapsed = ((double)(System.nanoTime() - before)) / 1000000.0;
    System.out.println("\"Elapsed time: " + elapsed + " msecs\"");
  }

}
