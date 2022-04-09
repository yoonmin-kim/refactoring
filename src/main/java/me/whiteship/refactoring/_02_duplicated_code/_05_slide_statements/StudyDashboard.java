package me.whiteship.refactoring._02_duplicated_code._05_slide_statements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class StudyDashboard {

    private void printParticipants(int eventId) throws IOException {
        // 코드가 정리된 부분
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);

        Set<String> participants = new HashSet<>();
        issue.getComments().forEach(c -> participants.add(c.getUserName()));

        participants.forEach(System.out::println);
    }

    private void printReviewers() throws IOException {
        // 코드가 정리되지 않은 부분
        Set<String> reviewers = new HashSet<>();
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        issue.getComments().forEach(c -> reviewers.add(c.getUserName()));

        reviewers.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }




}
