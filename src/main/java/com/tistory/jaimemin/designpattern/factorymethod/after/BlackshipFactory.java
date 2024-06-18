package com.tistory.jaimemin.designpattern.factorymethod.after;

public class BlackshipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		return new Blackship();
	}
}
