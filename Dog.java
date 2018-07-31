class Dog extends Animal{ //class

    int age; //instance variable

    public void bark(){ 
        //bark is a method. Predefined set of instructions
        System.out.println("Woof!");
    }

    public void run(int feet){
        //run is also a method. Predefined set of instructions
        System.out.println("Your dog ran " + feet + " feet!");
    }

    public Dog (int dogsAge){ 
        //Dog = class constructor
        //dogsAge = parameter
        age = dogsAge;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){

        Dog spike = new Dog(25); 
        //spike = object
        //25 = age = parameter

        spike.bark(); 
        //calling the bark method on the object spike

        spike.run(5);
        //calling the run method on the object spike
    
        int spikeAge = spike.getAge();
        //Calling the method getAge. Stores value into age and prints output
        System.out.println("Your dog is " + spikeAge + " years old");

        spike.checkStatus();
        //Calling the method checkStatus from the class Animal on the object spike
    }
}