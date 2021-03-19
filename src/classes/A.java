package classes;

public class A {
    private static  String x;


  static class B{
        private int y;

        {

            System.out.println(x);
        }

    }
}
