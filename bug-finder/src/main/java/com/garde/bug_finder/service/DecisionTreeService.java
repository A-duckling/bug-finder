package com.garde.bug_finder.service;


import com.garde.bug_finder.model.DecisionNode;
import com.garde.bug_finder.util.TreeLoader;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DecisionTreeService {
    private final Map<String, DecisionNode> tree;

    public DecisionTreeService() {
        this.tree = TreeLoader.loadTree();
    }

    public DecisionNode getNode(String id) {
        return tree.get(id);
    }
}
