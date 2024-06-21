package com.tistory.jaimemin.designpattern.creational_patterns.prototype.after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jaimemin");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // 프로토타입
        GithubIssue clone = (GithubIssue) githubIssue.clone(); // 얕은 복사
        System.out.println(clone.getUrl());

        repository.setUser("gudetama");

        System.out.println(clone != githubIssue); // clone과 githubIssue는 다른 인스턴스
        System.out.println(clone.equals(githubIssue)); // 데이터는 같지만(레퍼런스 비교가 아님) clone()에서 GithubRepository deep copy 했으므로 false
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());
        System.out.println(clone.getUrl());
    }

}
