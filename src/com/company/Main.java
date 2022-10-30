package com.company;

public class Main {

    public static void main(String[] args) {
        //Print out Third portion of String only
        String inLine= "Jack,22,95.5";
        String[] toks = inLine.split(";");
        double nums= Double.parseDouble(toks[2]);
        System.out.printf("%s"+nums);

        //Sum All The Odd Numbered Lines
        int[]scores = {45,99,66,55,22};
        int sum =0;
        for(int i=0; i <scores.length; i++){
            if(i%2==1){
                sum +=scores[i];

            }
        }
        // IF each Character takes 1 byte
        //How many memory locations does this take?
        String tok = "A";
        tok+="B";

        // Answer is 3 bytes , tok ="A"+ "AB"
        //Because you are creating a new String, Strings are immutable.
    }
}
