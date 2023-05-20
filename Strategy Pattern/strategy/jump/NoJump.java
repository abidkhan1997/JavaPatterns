package strategy.jump;

public class NoJump implements Jump {

	@Override
	public void jump() {
		System.out.println("No Jump");
	}
}