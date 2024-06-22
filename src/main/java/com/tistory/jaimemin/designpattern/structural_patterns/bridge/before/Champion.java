package com.tistory.jaimemin.designpattern.structural_patterns.bridge.before;

import com.tistory.jaimemin.designpattern.structural_patterns.bridge.after.Skin;

public interface Champion extends Skin {

	void move();

	void skillQ();

	void skillW();

	void skillE();

	void skillR();

}
