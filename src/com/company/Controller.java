package com.company;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

  public Controller(Model model,View view){
      this.model=model;
      this.view=view;
  }

  public void userProcess()
  {
      Scanner sc=new Scanner(System.in);

      view.printMessage(view.GAME_NAME);
      view.printMessage(view.GAME_SENSE);
while(!(view.MIN_NUMBER<view.MAX_NUMBER)) {
    view.MIN_NUMBER = inputMinBarrier(sc);
    view.MAX_NUMBER = inputMaxBarrier(sc);
    if(view.MIN_NUMBER>view.MAX_NUMBER){
    view.printMessage(view.MAX_BARRIER_LESS_MIN);
    continue;
    }
}
      model.setPrimaryBarrier(view.MIN_NUMBER,view.MAX_NUMBER);
      model.setSecretNumber();

      while (model.checkValue(inputSupposedNumber(sc)));

      view.printMessage(view.WIN);
      view.printMessage(view.SECRET_NUMBER_WAS+model.getSecretNumber());
      view.printMessage(view.TRY_INFO+String.valueOf(model.getYourWay()));
  }
    public int inputSupposedNumber(Scanner sc) {
    int res = 0;
    view.printMessage(view.INPUT_INT_NUMBER+String.valueOf(model.getMinNumber())+view.HYPHEN
            +String.valueOf(model.getMaxNumber())+view.DIAPASON);
    while (true) {
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT + " \n" + view.INPUT_INT_NUMBER+String.valueOf(model.getMinNumber())+
                    view.HYPHEN +String.valueOf(model.getMaxNumber())+view.DIAPASON);
            sc.next();
        }
        if ((res = sc.nextInt()) <= model.getMinNumber() || res >= model.getMaxNumber()) {
            view.printMessage(view.WRONG_DIAPOSON+String.valueOf(model.getMinNumber())+
                    view.HYPHEN +String.valueOf(model.getMaxNumber())+view.DIAPASON+ " \n" + view.INPUT_INT_NUMBER+String.valueOf(model.getMinNumber())+
                    view.HYPHEN +String.valueOf(model.getMaxNumber())+view.DIAPASON);
            continue;
        }
        break;
    }
    return res;
    }
    public int inputMinBarrier(Scanner sc){
    int res=0;
    view.printMessage(view.INPUT_MIN_BARRIER);
        while (!sc.hasNextInt()) {
            view.printMessage("\t"+view.WRONG_INPUT+"\n"+view.INPUT_MIN_BARRIER);
            sc.next();
        }res=sc.nextInt();
    return res;
  }

    public int inputMaxBarrier(Scanner sc){
        int res=0;
        view.printMessage(view.INPUT_MAX_BARRIER);
        while (!sc.hasNextInt()) {
            view.printMessage("\t"+view.WRONG_INPUT+"\n"+view.INPUT_MAX_BARRIER);
            sc.next();
        }
        res=sc.nextInt();
        return res;
    }
}



