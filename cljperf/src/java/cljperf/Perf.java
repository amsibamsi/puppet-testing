package cljperf;

public class Perf {

  public static void perf(long iterations, long size, long repetitions) {
    System.out.println("java performance ...");
    Perf.perf_loop(iterations, repetitions);
    Perf.perf_array(size, repetitions);
  }

  public static void perf_loop(long iterations, long repetitions) {
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

  public static void perf_array(long size, long repetitions) {
    System.out.println("array set ...");
    for (long i=0; i<repetitions; i++) {
      long before = System.nanoTime();
      long[] a = new long[(int)size];
      for (int j=0; j<(int)size; j++) {
        a[j] = j;
      }
      double elapsed = ((double)(System.nanoTime() - before)) / 1000000.0;
      System.out.println("\"Elapsed time: " + elapsed + " msecs\"");
    }
  }

}
