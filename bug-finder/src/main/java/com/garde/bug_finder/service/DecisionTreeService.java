package com.garde.bug_finder.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import com.garde.bug_finder.model.BugInfo;
import com.garde.bug_finder.model.DecisionNode;
//import com.garde.bug_finder.util.TreeLoader;

import jakarta.annotation.PostConstruct;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Service
public class DecisionTreeService {
    private Map<String, DecisionNode> tree;
    private Map<String, BugInfo> bugDatabase;

    @PostConstruct
    public void loadData() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        // Load decision tree
        InputStream treeStream = new ClassPathResource("data/decision-tree.json").getInputStream();
        tree = mapper.readValue(treeStream,
                new TypeReference<Map<String, DecisionNode>>() {});

        // Load bug database
        InputStream bugStream = new ClassPathResource("data/bugs.json").getInputStream();
        bugDatabase = mapper.readValue(bugStream,
                new TypeReference<Map<String, BugInfo>>() {});
    }

    public DecisionNode getNode(String id) {

        DecisionNode node = tree.get(id);

        if (node == null) {
            return null;
        }

        // If this node references a bug, attach it
        if (node.getBugId() != null) {
            BugInfo bug = bugDatabase.get(node.getBugId());
            node.setBug(bug);
        }

        return node;
    }
}
