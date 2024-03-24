package cr.middleware;

public class LogManager extends Middleware {
    public LogManager() {}

    @Override
    public void run(Object request) {
        System.out.println("Begin LogManager.");

        if (next != null) {
            next.run(request);
        }

        System.out.println("End LogManager.");
    }
}