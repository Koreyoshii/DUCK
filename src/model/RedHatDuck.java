package model;

public class RedHatDuck extends Duck {//驯化野鸭
	public RedHeadDuck() {
		QuackBehavior = new MuteQuack();
		FlyBehavior = new FlyNoWay();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RedHeadDuck会游泳");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这只鸭子是RedHeadDuck");
	}

}
