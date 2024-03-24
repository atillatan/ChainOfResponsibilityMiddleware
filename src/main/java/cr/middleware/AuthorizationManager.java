package cr.middleware;

public class AuthorizationManager extends Middleware {
    public AuthorizationManager() {}

    @Override
    public void run(Object request) {
        System.out.println("Begin AuthorizationManager.");

        if (next != null) {
            next.run(request);
        }

        System.out.println("End AuthorizationManager.");
    }
}
