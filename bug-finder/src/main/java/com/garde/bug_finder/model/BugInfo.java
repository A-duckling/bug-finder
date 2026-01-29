package com.garde.bug_finder.model;


import java.util.List;

public class BugInfo {
    private String name;
    private String classification; // Beneficial, Harmful, Neutral
    private String description;
    private List<String> images;
    private List<String> affectsPlants;
    private List<String> eats;

    public BugInfo() {

    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getImages() {
        return images;
    }

    public List<String> getAffectsPlants() {
        return affectsPlants;
    }

    public List<String> getEats() {
        return eats;
    }
}



/* "beneficial": {
    "id": "beneficial",
    "bug": {
      "classification": "Beneficial",
      "explanation": "This bug helps control pests."
    }
  },
  "harmful": {
    "id": "harmful",
    "bug": {
      "classification": "Harmful",
      "explanation": "This bug damages plants."
    }
  },
  "neutral": {
    "id": "neutral",
    "bug": {
      "classification": "Neutral",
      "explanation": "This bug has little impact on the garden."
    }
  }*/
