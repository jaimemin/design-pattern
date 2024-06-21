package com.tistory.jaimemin.designpattern.creational_patterns.factorymethod.before;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
		System.out.println(whiteship);

		Ship blackship = ShipFactory.orderShip("Blackship", "keesun@email.com");
		System.out.println(blackship);
	}
}
