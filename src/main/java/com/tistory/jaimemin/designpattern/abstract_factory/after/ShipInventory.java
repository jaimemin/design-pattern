package com.tistory.jaimemin.designpattern.abstract_factory.after;

import com.tistory.jaimemin.designpattern.factorymethod.after.Ship;
import com.tistory.jaimemin.designpattern.factorymethod.after.ShipFactory;

public class ShipInventory {

	public static void main(String[] args) {
		ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
		Ship ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());

		shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
		ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
	}
}
