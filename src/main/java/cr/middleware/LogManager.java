package cr.middleware;

public class LogManager extends Middleware {

  public LogManager() {}

  @Override
  public void run(Object request) {
    System.out.println("Begin LogManager.");

    // Handle request before
    System.out.println("LogManager handling request:" + request);

    if (next != null) {
      next.run(request);
    }
    // Handle request after
    System.out.println("LogManager handled request:" + request);

    System.out.println("End LogManager.");
  }
}
