

public class Phone {        //class

    String model = "nokia1100";

    public void call() {       //method()

        System.out.println("calling......unknown");
    }

    public void call(int number) {         //method() with parameter

        System.out.println("calling......" + number);
    }

    public void text() {

        System.out.println("texting......unknown");
    }

    public void showModel() {

        System.out.println("Model for this phone is : " + model);
    }

}
