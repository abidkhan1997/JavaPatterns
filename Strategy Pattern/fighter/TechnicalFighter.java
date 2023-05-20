package fighter;

import strategy.jump.Jump;
import strategy.kick.Kick;
import strategy.power.Power;
import strategy.punch.Punch;

public class TechnicalFighter extends Fighter {

	public TechnicalFighter(Kick kick, Punch punch, Jump jump, Power power) {
		super(kick, punch, jump, power);
	}

	@Override
	public void characterName() {
		System.out.println("Technical Fighter");
	}
}