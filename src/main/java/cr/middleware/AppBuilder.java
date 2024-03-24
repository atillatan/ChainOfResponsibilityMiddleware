package cr.middleware;

import java.io.IOException;
import cr.middleware.*;
 

public class AppBuilder extends Middleware {
    public AppBuilder() {}

    @Override
    public void run(Object request) {
        System.out.println("Begin AppBuilder.");

        if (next != null) {
            next.run(request);
        }

        System.out.println("End AppBuilder.");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
