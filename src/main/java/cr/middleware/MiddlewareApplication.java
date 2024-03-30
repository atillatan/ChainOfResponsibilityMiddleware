package cr.middleware;

public class MiddlewareApplication {
  // Declare a private static final variable named 'app' of type AppBuilder.
  // This variable is used to build and configure the application. It's static, meaning it belongs to the class rather than any instance of it,
  // and final, meaning its reference cannot be changed after it's initialized.
  private static final AppBuilder app = new AppBuilder();

// The main method - this is the entry point of the Java application.
  public static void main(String[] args) {
    try {
      // Use the 'app' object to add middleware components to the application.
      // Middleware components are added in a sequence and each has a specific role.
      // LogManager is responsible for logging requests/responses.
      // AuthorizationManager handles authentication and authorization.
      // CacheManager is used for caching responses to improve performance.
      app.use(new LogManager())
        .use(new AuthorizationManager())
        .use(new CacheManager());

      // After setting up the middleware, run the application with some example data.
      // This demonstrates how a request would be processed through the middleware chain.
      // "Example data" could represent a request object or data that needs processing.
      app.run("Example data");
      
    } catch (Exception e) {
      // Handle the exception and log the error
      System.err.println("An error occurred: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
