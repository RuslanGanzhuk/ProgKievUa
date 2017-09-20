package lesson2.task4;

public class Phone {

    private long number;
    private String model;
    private String color;
    private Network network;

    public Phone(long number, String model, String color, Network network) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.network = network;
    }

    public Phone(long number) {
        this.number = number;
    }

    public Phone() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void registrationToNetwork(Network network){
        network.addToNetwork(this);
    }

    public void call(long number){

        if(network.searchNumber(number)!= null){
            System.out.println("You "+ this +" call to " + network.searchNumber(number));
            network.searchNumber(number).callBack(network.searchNumber(number).getNumber());
        }
    }

    public void callBack(long number){
        System.out.println(this +" Are you called... " );
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", network=" + network +
                '}';
    }
}
