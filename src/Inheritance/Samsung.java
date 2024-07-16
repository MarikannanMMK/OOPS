package Inheritance;

public  class  Samsung extends Mobile {

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

     static String model;

    public Samsung(){
        System.out.println("I am inside sam constructor");
    }

    public Samsung(String model){
        System.out.println("I am inside sam constructor " + model);
    }
    public static void Battery() {
        System.out.println("Battery from Samsung");
    }


}
