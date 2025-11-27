package org.SimpleCodingQuestions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.diff.JsonDiff;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JsonCompare {
    public static void main(String[] args) throws JsonProcessingException {
        String expectedJson = "{\"id\":101, \"name\":\"Hari\", \"city\":\"Chennai\"}";
        String actualJson = "{\"id\":101, \"name\":\"Hari Priya\", \"state\":\"TN\"}";

        ObjectMapper mapper = new ObjectMapper();

        JsonNode firstNode = mapper.readTree(expectedJson);
        JsonNode secondNode = mapper.readTree(actualJson);

        JsonNode diffNode = JsonDiff.asJson(firstNode, secondNode);

        System.out.println("🔍 JSON Differences:");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(diffNode));
    }
}