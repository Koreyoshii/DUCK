package model;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("这只鸭子不会飞");
	}

}
