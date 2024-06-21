package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.after;

import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.DefaultShipFactory;
import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.Ship;
import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.Whiteship;

/**
 * 추상 팩토리 패턴의 Client
 */
public class WhiteshipFactory extends DefaultShipFactory {

	private ShipPartsFactory shipPartsFactory;

	public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}

	/**
	 * 팩토리 타입 인스턴스를 받은 뒤 해당 인스턴스를 통해서 anchor와 wheel을 넘겨주면 클라이언트 코드가 바뀔 일은 없음
	 * OCP 원칙 지킴
	 */
	@Override
	public Ship createShip() {
		Ship ship = new Whiteship();
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());

		return ship;
	}
}
