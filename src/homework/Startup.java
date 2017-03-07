/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author FA
 */
public class Startup {

    public static void main(String[] args) {
        Duck duck = new ModelDuck(new FlyNoWay(), new MuteQuack());

        duck.display();

        duck.performQuack();

        duck.performFly();
    }

}
