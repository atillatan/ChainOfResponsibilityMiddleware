package cr.middleware;

import java.util.Scanner;

public class AppBuilder extends Middleware {

  public AppBuilder() {}

  @Override
  public void run(Object request) {
    System.out.println("Begin AppBuilder.");

    if (next != null) {
      next.run(request);
    }

    System.out.println("End AppBuilder.");

    new Scanner(System.in).nextLine();
  }
}
