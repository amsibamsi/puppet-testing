package cljperf;

public class Perf {

  public static final double a = 432244.53223899;
  public static final double b = 9823048.5729233;
  public static double c = 0.0;

  public static void perf() {
    System.out.println("java performance");
    long before = System.nanoTime();
    for (long i=0; i<1000000000L; i++) {
      c = c + 1.0;
    }
    double elapsed = ((double)(System.nanoTime() - before)) / 1000000.0;
    System.out.println("\"Elapsed time: " + elapsed + " msecs\"");
  }

}
