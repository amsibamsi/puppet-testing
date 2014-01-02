package cljperf;

public class Perf {

  public static void perf(long iterations, long repetitions) {
    System.out.println("java performance");
    System.out.println("for loop...");
    for (long i=0; i<repetitions; i++) {
      long before = System.nanoTime();
      long x = 0;
      for (long j=0; j<iterations; j++) {
        // need to do something so loop is not removed for optimization?
        x = x + 1;
      }
      double elapsed = ((double)(System.nanoTime() - before)) / 1000000.0;
      System.out.println("\"Elapsed time: " + elapsed + " msecs\"");
    }
  }

}
