package fighter;

import strategy.jump.Jump;
import strategy.kick.Kick;
import strategy.power.Power;
import strategy.punch.Punch;

public class StrongFighter extends Fighter {

	public StrongFighter(Kick kick, Punch punch, Jump jump, Power power) {
		super(kick, punch, jump, power);
	}

	@Override
	public void characterName() {
		System.out.println("Strong Fighter");
	}
}