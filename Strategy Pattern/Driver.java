import fighter.AgileFighter;
import fighter.Fighter;
import fighter.StrongFighter;
import strategy.jump.HighJump;
import strategy.jump.Jump;
import strategy.jump.NoJump;
import strategy.kick.Kick;
import strategy.kick.LowKick;
import strategy.kick.SuperKick;
import strategy.power.Power;
import strategy.power.SniperShot;
import strategy.power.SpiritBomb;
import strategy.punch.Punch;
import strategy.punch.SuperPunch;
import strategy.punch.UppercutPunch;

public class Driver {

	public static void main(String[] args) {

		Kick lowkKick = new LowKick();
		Punch superPunch = new SuperPunch();
		Jump highJump = new HighJump();
		Power spiritBomb = new SpiritBomb();

		Fighter agileFighter = new AgileFighter(lowkKick, superPunch, highJump, spiritBomb);
		agileFighter.characterName();

		agileFighter.punch();
		agileFighter.kick();
		agileFighter.jump();
		agileFighter.power();

		Fighter strongFighter = new StrongFighter(lowkKick, superPunch, highJump, spiritBomb);
		strongFighter.characterName();

		strongFighter.punch();
		strongFighter.kick();
		strongFighter.jump();
		strongFighter.power();

		strongFighter.setJump(new NoJump());
		strongFighter.setPunch(new UppercutPunch());
		strongFighter.setPower(new SniperShot());
		strongFighter.setKick(new SuperKick());

		strongFighter.punch();
		strongFighter.kick();
		strongFighter.jump();
		strongFighter.power();

	}
}