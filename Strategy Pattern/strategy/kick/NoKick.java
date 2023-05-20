package strategy.kick;

public class NoKick implements Kick {

	@Override
	public void kick() {
		System.out.println("No Kick");
	}
}