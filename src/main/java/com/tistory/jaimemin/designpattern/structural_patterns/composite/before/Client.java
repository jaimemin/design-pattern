package com.tistory.jaimemin.designpattern.structural_patterns.composite.before;

public class Client {

	public static void main(String[] args) {
		Item doranBlade = new Item("도란검", 450);
		Item healPotion = new Item("체력 물약", 50);

		Bag bag = new Bag();
		bag.add(doranBlade);
		bag.add(healPotion);

		/**
		 * 클라이언트가 너무 많이 알아야함
		 * 객체지향적으로 client가 가방 안에 있는 모든 아이템을 알아야하는 것인가?
		 */
		Client client = new Client();
		client.printPrice(doranBlade);
		client.printPrice(bag);
	}

	private void printPrice(Item item) {
		System.out.println(item.getPrice());
	}

	private void printPrice(Bag bag) {
		int sum = bag.getItems().stream()
			.mapToInt(Item::getPrice)
			.sum();

		System.out.println(sum);
	}

}
