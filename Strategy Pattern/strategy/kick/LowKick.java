package strategy.kick;

public class LowKick implements Kick {

	@Override
	public void kick() {
		System.out.println("Low Kick");
	}
}