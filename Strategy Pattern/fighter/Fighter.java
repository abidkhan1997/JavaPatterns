package fighter;

import strategy.jump.Jump;
import strategy.kick.Kick;
import strategy.power.Power;
import strategy.punch.Punch;

public abstract class Fighter {

	protected Kick kick;
	protected Punch punch;
	protected Jump jump;
	protected Power power;

	public Fighter(Kick kick, Punch punch, Jump jump, Power power) {
		this.kick = kick;
		this.punch = punch;
		this.jump = jump;
		this.power = power;
	}

	public abstract void characterName();

	public void setKick(Kick kick) {
		this.kick = kick;
	}

	public void setPunch(Punch punch) {
		this.punch = punch;
	}

	public void setJump(Jump jump) {
		this.jump = jump;
	}

	public void setPower(Power power) {
		this.power = power;
	}

	public void kick() {
		kick.kick();
	}

	public void punch() {
		punch.punch();
	}

	public void jump() {
		jump.jump();
	}

	public void power() {
		power.power();
	}
}