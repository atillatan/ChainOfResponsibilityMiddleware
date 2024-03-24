package cr.middleware;

public class AuthorizationManager extends Middleware {

  public AuthorizationManager() {}

  @Override
  public void run(Object request) {
    System.out.println("Begin AuthorizationManager.");

    // Handle request before
    System.out.println("AuthorizationManager handling request:" + request);

    if (next != null) {
      next.run(request);
    }

    // Handle request after
    System.out.println("AuthorizationManager handled request:" + request);

    System.out.println("End AuthorizationManager.");
  }
}
