package com.tistory.jaimemin.designpattern.creational_patterns.abstract_factory.before;

import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.DefaultShipFactory;
import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.Ship;
import com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.after.Whiteship;

/**
 * 여기서는 구체적인 클래스 타입을 만들어서 setter 메서드로 넘기고 있음
 * -> style을 바꾸고 싶을 때마다 클라이언트 코드가 변경됨 (넘겨줄 구체 클래스를 넘겨줘야 함)
 */
public class WhiteshipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		Ship ship = new Whiteship();
		ship.setAnchor(new WhiteAnchor());
		ship.setWheel(new WhiteWheel());

		return ship;
	}
}
