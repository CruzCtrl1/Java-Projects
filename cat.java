class cat{
    //class
    int age;
    //age is an instance variable

    public cat(int catAge){
        //cat is the class constructor
        //catAge is a parameter
    age = catAge;

    }

    public void getAge(){
        System.out.println("Your cat is " + age + " years old");
    }
    
    /*getAge is a method
    A method is a preset of instructions*/

    public int run(){
        return age;
    }


    public static void main (String[] args) {

        cat meow = new cat(5);
        meow.getAge();

        int run = meow.run();
        System.out.println("Your cat ran " + run + " feet!");
    }

}