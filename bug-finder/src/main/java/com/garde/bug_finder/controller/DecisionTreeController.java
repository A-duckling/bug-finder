package com.garde.bug_finder.controller;

import com.garde.bug_finder.model.DecisionNode;
import com.garde.bug_finder.service.DecisionTreeService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/tree")
@CrossOrigin
public class DecisionTreeController {
    private final DecisionTreeService service;

    public DecisionTreeController(DecisionTreeService service) {
        this.service = service;
    }

    @GetMapping("/start")
    public DecisionNode start() {
        return service.getNode("start");
    }

    @PostMapping("/next")
    public DecisionNode next(@RequestBody Map<String, String> payload) {
        String nextId = payload.get("next");
        return service.getNode(nextId);
    }
}
