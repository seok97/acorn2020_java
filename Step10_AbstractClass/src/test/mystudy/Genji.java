package test.mystudy;

import test.mypac.Weapon;

public class Genji extends Weapon{
	@Override
	public void attack() {
		System.out.println("류승룡 기모찌 !");
	}
	
	@Override
	public void prepare() {
		System.out.println("용검 준비 완료");
	}
}
