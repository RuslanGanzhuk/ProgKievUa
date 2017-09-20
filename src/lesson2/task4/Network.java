package lesson2.task4;

import java.util.Arrays;

public class Network {

    private String name;
    private Phone[] phonesRegisteredOnNetwork = new Phone[0];

    public Network(String name) {
        this.name = name;
    }

    public Network() {
    }



    public void addToNetwork (Phone phone){

        if(checkNumber(phone) == true) {
            Phone[] tempArray = new Phone[phonesRegisteredOnNetwork.length + 1];
            System.arraycopy(phonesRegisteredOnNetwork, 0, tempArray, 0, phonesRegisteredOnNetwork.length);
            tempArray[tempArray.length - 1] = phone;
            phonesRegisteredOnNetwork = tempArray;
        }else {
            System.out.println("Sorry,this number " + phone.getNumber() + " already in network");
        }
    }

    private boolean checkNumber(Phone phone){
        for (int i = 0; i < phonesRegisteredOnNetwork.length;i++){
            if(phonesRegisteredOnNetwork[i].getNumber() == phone.getNumber()){
                return false;
            }
        }
        return true;
    }

    public Phone searchNumber(long number){
        for (int i = 0; i < phonesRegisteredOnNetwork.length;i++){
            if(number == phonesRegisteredOnNetwork[i].getNumber()){
                return phonesRegisteredOnNetwork[i];
            }
        }
        System.out.println("Number not registered");
        return null;
    }


    public void printAllPhonesInNetwork(){
        System.out.println(Arrays.toString(phonesRegisteredOnNetwork));
    }

    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
                '}';
    }
}
