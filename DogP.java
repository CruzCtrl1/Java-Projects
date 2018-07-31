class DogP{
 //A class is a set of instructions on how a data structure should work
    int age;

    public DogP(int dogsAge){
//A class constructor instructs the class how to set up the initial state of an object
//Instance variables store info about the class
//parameters are values that be specified when creating an object or calling a method
        age = dogsAge;

        
    }
    
    public void bark(){
        System.out.println("Woof!");
    }

    public void run(int feet){
        System.out.println("Your dog ran " + feet+ " feet!");
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
//When the code is run, everything in main is executed

//An object is also an instance of a class that stores the state of the class
//We use objects to use our created class
//A method is a predefined set of instructions
        DogP spike = new DogP(5);
        
        spike.bark();
        spike.run(5);
        int spikeAge = spike.getAge();
        System.out.println(spikeAge);

    }

}