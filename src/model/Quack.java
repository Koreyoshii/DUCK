package model;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("这是一只会叫的鸭子");
	}

}
