package com.garde.bug_finder.model;

import java.util.List;

public class DecisionNode {

    private String id;
    private String question;
    private List<Option> options;
    
    private List<String> images; 
    private BugInfo bug;

    public DecisionNode()
    {}

    public String getId() 
    {
        return id;
    }

    public String getQuestion() 
    {
        return question;
    }

    public List<Option> getOptions() 
    {
        return options;
    }

    public BugInfo getBug() 
    {
        return bug;
    }

    public List<String> getImages() {
        return images;
    }
    public void setBug(BugInfo bugg) 
    {
        this.bug = bugg;
    }
}
