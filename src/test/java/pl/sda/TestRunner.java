package pl.sda;

public class TestRunner {
  public static void main(String[] argv) {
    byte result = -1;
    try {
      result = io.cucumber.core.cli.Main.run(argv);
    } catch (Throwable e) {
      e.printStackTrace();
    } finally {
      System.exit(result);
    }
  }
}
