
public class phone {

    private String model = "nokia";      

    private void call() {           //private

        System.out.println("calling......unknown");
    }

    void call(int number) {           //default

        System.out.println("calling......" + number);
    }

    public void showModel() {            //public

        System.out.println("Model for this phone is : " + model);
    }

}