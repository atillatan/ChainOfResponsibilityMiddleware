package cr.middleware;

public abstract class Middleware {
    protected Middleware next;

    public Middleware use(Middleware middleware) {
        this.next = middleware;
        return middleware;
    }

    public abstract void run(Object request);
}
