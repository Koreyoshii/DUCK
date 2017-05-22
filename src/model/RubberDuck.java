package model;

public class RubberDuck extends Duck {//橡皮鸭
	public RubberDuck() {
		QuackBehavior = new Squeak();
		FlyBehavior = new FlyWithRocket();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck会游泳");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这只鸭子是RubberDuck");
	}

}
