// MiddlewareApplication.java
package cr.middleware;

public class MiddlewareApplication {
  private static final AppBuilder app = new AppBuilder();

  public static void main(String[] args) {
    try {
      app.use(new LogManager())
         .use(new AuthorizationManager())
         .use(new CacheManager());

      // Run 1
      app.run("Example data");
      
    } catch (Exception e) {
      // Handle the exception and log the error
      System.err.println("An error occurred: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
