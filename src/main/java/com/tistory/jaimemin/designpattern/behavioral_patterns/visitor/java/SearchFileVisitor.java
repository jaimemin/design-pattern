package com.tistory.jaimemin.designpattern.behavioral_patterns.visitor.java;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchFileVisitor implements FileVisitor<Path> {

	private String fileToSearch;
	private Path startingDirectory;

	public SearchFileVisitor(String fileToSearch, Path startingDirectory) {
		this.fileToSearch = fileToSearch;
		this.startingDirectory = startingDirectory;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (fileToSearch.equals(file.getFileName().toString())) {
			System.out.println("found " + file.getFileName());
			return FileVisitResult.TERMINATE;
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		exc.printStackTrace(System.out);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		if (Files.isSameFile(startingDirectory, dir)) {
			System.out.println("search end");
			return FileVisitResult.TERMINATE;
		}
		return FileVisitResult.CONTINUE;
	}
}
