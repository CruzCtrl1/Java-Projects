class CastOp{
    public static void main(String[] args){
        //originally had short a;
        // This doesn't compile because b+c = integer. therefore
        // changed a to an int. can also do a conversion.
        int a;
        short b = 7;
        short c = 3;
        System.out.println(b+c);
        a = b+c;

        short d;

        d = (short)(b+c);
        System.out.println("Here is the use of a cast operator: "+ d);
    }
}