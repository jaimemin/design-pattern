package com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.tistory.jaimemin.designpattern.behavioral_patterns.iterator.before.Post;

public class RecentPostIterator implements Iterator<Post> {

	private Iterator<Post> internalIterator;

	public RecentPostIterator(List<Post> posts) {
		Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
		this.internalIterator = posts.iterator();
	}

	@Override
	public boolean hasNext() {
		return this.internalIterator.hasNext();
	}

	@Override
	public Post next() {
		return this.internalIterator.next();
	}
}
