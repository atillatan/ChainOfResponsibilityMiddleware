package cr.middleware;

public class CacheManager extends Middleware {
    public CacheManager() {}

    @Override
    public void run(Object request) {
        System.out.println("Begin CacheManager.");

        if (next != null) {
            next.run(request);
        }

        System.out.println("End CacheManager.");
    }

    public static Middleware useCacheManager(Middleware middleware) {
        return middleware.use(new CacheManager());
    }
}
