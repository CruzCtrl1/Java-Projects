class Calculator{

    int input;

    public Calculator(int constructor){
        input = constructor;
    }

    public void dividend(int dividend){
        //System.out.println(((input-(input/dividend))*dividend));
        System.out.println(input/dividend);
    }

    public static void main(String [] args){
        Calculator output = new Calculator(10);
        output.dividend(3);

    }
}

//What is division? Division is seeing how many times the dividend
//can go into the input. The remainder is the excess
// input / dividend = quotient
//quotient * dividend = input
// the / gives me the whole number in the quotient...
