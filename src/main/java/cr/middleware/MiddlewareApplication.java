// MiddlewareApplication.java
package cr.middleware;

public class MiddlewareApplication {
  private static AppBuilder app = new AppBuilder();

  public static void main(String[] args) {
    app.use(new LogManager())
       .use(new AuthorizationManager())
       .use(new CacheManager()); 

    // Run 1
    app.run("Example data");
  }
}
