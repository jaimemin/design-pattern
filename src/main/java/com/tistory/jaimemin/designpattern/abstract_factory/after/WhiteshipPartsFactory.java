package com.tistory.jaimemin.designpattern.abstract_factory.after;

import com.tistory.jaimemin.designpattern.abstract_factory.before.WhiteAnchor;
import com.tistory.jaimemin.designpattern.abstract_factory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

	@Override
	public Anchor createAnchor() {
		return new WhiteAnchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}
}
