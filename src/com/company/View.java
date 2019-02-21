package com.company;

public class View {
  public   int MIN_NUMBER=0;
  public   int MAX_NUMBER=0;

public static String GAME_NAME="\t\t\tGuess Game";
public static String GAME_SENSE="The task is to guess the number in chosen diapason";
public static String INPUT_INT_NUMBER="Input suppose integer number in ";
public static String HYPHEN=" -- ";
public static String DIAPASON=" diapason";
public static String WRONG_INPUT="Wrong input! Try again";
public static String WIN="\t\tCongratulations!!!\n\t You guessed the secret number";
public static String SECRET_NUMBER_WAS="\t\tThe secret number was: ";
public static String TRY_INFO="\tInformation about the attempts:  ";
public static String WRONG_DIAPOSON="Your number is not in   ";
public static String INPUT_MAX_BARRIER="Input high limit of secret value(integer value):   ";
public static String INPUT_MIN_BARRIER="Input low limit of secret value(integer value):   ";
public static String MAX_BARRIER_LESS_MIN="\t\tWrong data!!!\nHigh limit is less than lower!";


public void printMessage(String message)
{
    System.out.println(message);
}

}
