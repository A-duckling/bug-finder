package com.garde.bug_finder.controller;

import com.garde.bug_finder.model.DecisionNode;
import com.garde.bug_finder.service.DecisionTreeService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/tree")
@CrossOrigin
public class DecisionTreeController {
    private  DecisionTreeService service;

    public DecisionTreeController(DecisionTreeService services) 
    {
        this.service = services;
    }

    @GetMapping("/{id}")
    public DecisionNode getNode(@PathVariable String id) {
        return service.getNode(id);
    }

    @GetMapping("/start")
    public DecisionNode start() 
    {
        return service.getNode("start");
    }

    @PostMapping("/next")
    public DecisionNode next(@RequestBody Map<String, String> payload) 
    {
        String nextId = payload.get("next");
        return service.getNode(nextId);
    }

    /*
    "start": {
    "id": "start",
    "question": "What does the insect look most similar to?",
    "options": [
      { "answer": "Beetle", "next": "Beetle Question" },
      { "answer": "Worms", "next": "Worm Question" },
      { "answer": "Assassin Bug", "next": "Worm Question" },
      { "answer": "Aphids", "next": "Worm Question" },
      { "answer": "Slugs", "next": "Worm Question" }
    ]
  },
  "Beetle Question": {
    "id": "Beetle Question",
    "question": "Looks most similar to?",
    "options": [
      { "answer": "Ladybugs", "next": "Ladybug" },
      { "answer": "Ground Beetles/Other", "next": "Ground Beetle Question" }
    ]
  },

  "Ground Beetle Question": {
    "id": "Ground Beetle Question",
    "question": "Looks most similar to?",
    "options": [
      {"answer": "Ground Beetle", "next": "Ground Beetle"},
      {"answer": "Japanese Beetle", "next": "Japanese Beetle"},
      {"answer": "Cucumber Beetle", "next": "Cucumber Beetle"}
    ]
  },
  "Ladybug": {
  "id": "Ladybug",
  "bug": {
    "name": "Ladybug",
    "classification": "Beneficial",
    "description": "Ladybugs eat aphids and protect plants.",
    "images": [],
    "affectsPlants": ["Roses", "Tomatoes"],
    "eats": ["Aphids"]
  }
},
    "Ground Beetle": {
    "id": "Ground Beetle",
    "bug": {
        "name": "Ground Beetle",
        "classification": "Beneficial",
        "description": "Ground Beetles smt.",
        "images": ["images/ground-beetle.jpg"],
        "affectsPlants": ["Flower", "Tomatoes"],
        "eats": ["Bugs"]
    }
    } */
}
