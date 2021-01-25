package oop_recap;

public class Singleton {
      private static Singleton singleton = null;
    public static int total = 0;


    private Singleton()
    {
        ++total;
    }
    // this.singleton = new Singleton();
    public static Singleton getSingletonInstance() {
        if(singleton==null) {
            singleton = new Singleton();
        }

            return singleton;

    }

    public static void main(String[] args) {

      Singleton s =  getSingletonInstance();
      Singleton v =  getSingletonInstance();
        getSingletonInstance();
        getSingletonInstance();
        System.out.println(v.total);


    }
}
