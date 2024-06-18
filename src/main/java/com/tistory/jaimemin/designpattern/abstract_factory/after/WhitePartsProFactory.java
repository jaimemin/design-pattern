package com.tistory.jaimemin.designpattern.abstract_factory.after;

public class WhitePartsProFactory implements ShipPartsFactory {
	@Override
	public Anchor createAnchor() {
		return new WhiteAnchorPro();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheelPro();
	}
}
