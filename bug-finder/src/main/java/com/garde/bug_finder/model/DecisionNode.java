package com.garde.bug_finder.model;

import java.util.List;

public class DecisionNode {

    private String id;
    private String question;
    private List<Option> options;

    private String bugId;
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

    public String getBugId()
    {
        return bugId;
    }
    public void setBug(BugInfo bugg) 
    {
        this.bug = bugg;
    }
}
