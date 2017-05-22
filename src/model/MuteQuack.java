package model;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("这是一只不会叫的鸭子");
	}

}
