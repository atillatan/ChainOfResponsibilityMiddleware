package cr.middleware;

public class CacheManager extends Middleware {

  public CacheManager() {}

  @Override
  public void run(Object request) {
    System.out.println("Begin CacheManager.");

    // Handle request before
    System.out.println("CacheManager handling request:" + request);

    if (next != null) {
      next.run(request);
    }

    // Handle request after
    System.out.println("CacheManager handled request:" + request);

    System.out.println("End CacheManager.");
  }
}
