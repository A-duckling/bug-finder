package com.garde.bug_finder.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.garde.bug_finder.model.DecisionNode;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Map;

public class TreeLoader {
public static Map<String, DecisionNode> loadTree() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = new ClassPathResource("data/decision-tree.json").getInputStream();
            return mapper.readValue(is,
                    mapper.getTypeFactory()
                          .constructMapType(Map.class, String.class, DecisionNode.class));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load decision tree", e);
        }
    }
}
