/**
 * @author wangjinjie
 * @date 2020-08-22
 **/
public class SoldOutState implements State{

    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
