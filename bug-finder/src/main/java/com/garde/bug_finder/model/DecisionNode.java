package com.garde.bug_finder.model;

import java.util.List;

public class DecisionNode {

    private String id;
    private String question;
    private List<Option> options;
    private BugInfo bug;

    public DecisionNode(){

    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<Option> getOptions() {
        return options;
    }

    public BugInfo getBug() {
        return bug;
    }
}
