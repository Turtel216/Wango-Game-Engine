package loader.configs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ConfigParser {
    private final String path;
    private HashMap<String, String> tokenMap;

    public ConfigParser(String path) {
        this.path = path;
        tokenMap = new HashMap<>();
    }

    // Public method to parse config file
    public HashMap<String, String> ParseConfig() {
        var input = getInput();
        parseString(input);
        return tokenMap;
    }

    // getInput reads the data from the config file returns it as a string
    private String getInput() {
        File configFile = new File(path); // The given config file
        StringBuilder input = new StringBuilder(); // The output string

        // Try reading the config file
        try(Scanner scanner = new Scanner(configFile)) {
            // Loop through file
            while(scanner.hasNextLine())
                input.append(scanner.nextLine());

        } catch (FileNotFoundException e) { //TODO replace with better error logging
            System.out.println("Error reading config file");
            e.printStackTrace();
        }

        return input.toString();
    }

    // parseString splits input string into key-value tokens
    private void parseString(String input) {
        // Convert input string into array list of each line
        ArrayList<String> inputLines = (ArrayList<String>) Arrays.asList(input.split("\n"));

        // Iterate though the array list and save each key-value pair
        inputLines.forEach((line) -> {
            String[] str = line.split("=");
            tokenMap.put(str[0], str[1]);
        });
    }

    // Getters
    public String getPath() { return path; }
}