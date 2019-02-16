package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int  maxNumber;
    private int  minNumber;
    private int  guessRandomValue;

    private List<Integer> yourWay=new ArrayList<Integer>();

        public void setSecretNumber(){
            guessRandomValue=(int)Math.ceil(Math.random()*
                    (maxNumber-minNumber-1)+minNumber);
        }

        public boolean checkValue(int value){
        yourWay.add(value);
            if (value == guessRandomValue){
                return false;
            } else if (value > guessRandomValue){
                maxNumber = value;
            } else {
                minNumber = value;
            }
            return true;
        }


    public void setPrimaryBarrier(int minNumber, int maxNumber){
        this.minNumber= minNumber;
        this.maxNumber = maxNumber;
        }
    public int getSecretNumber() {
        return guessRandomValue;
    }
    public int getMinNumber() {
        return minNumber;
    }
    public int getMaxNumber() {
        return maxNumber;
    }
    public List<Integer> getYourWay() {
        return yourWay;
    }
}
