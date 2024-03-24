// MiddlewareApplication.java
package cr.middleware;

import cr.middleware.*;

public class MiddlewareApplication {
    private static AppBuilder app = new AppBuilder();

    public static void main(String[] args) {
        app.use(new LogManager())
           .use(new AuthorizationManager())
           .use(CacheManager.useCacheManager(app)); // Note the change here due to static method usage in Java

        // Run 1
        app.run("data");
    }
}