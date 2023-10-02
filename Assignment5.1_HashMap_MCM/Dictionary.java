import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Matt
 * This class represents a dictionary implemented using a HashMap
 */
public class Dictionary {
	
	private HashMap<String, String> dictionary;
	
	/**
	 * Initializes a new instance of the Dictionary class.
	 */
	public Dictionary() {
		
		dictionary = new HashMap<String, String>();
	}//end constructor
	
	/**
	 * Loads the dictionary from a CSV file.
	 * @param fileName The name of the file containing the words and definitions
	 */
	public void loadDictionary(String fileName) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length == 2) {
	                    String word = parts[0].trim();
	                    String definition = parts[1].trim();
	                    dictionary.put(word, definition);
	                }
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found: " + fileName);
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    }
	
	/**
	 * Prints the unsorted dictionary keys and definitions along with their hash keys
	 */
	public void printDictionary() {
	        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
	            System.out.println("Word: " + entry.getKey());
	            System.out.println("Definition: " + entry.getValue());
	            System.out.println("Hash Key: " + entry.getKey().hashCode());
	            System.out.println();
	        }
	    }
	  
	/**
	 * Searches for a word in the dictionary and prints its definition and hash key.
	 * @param key The word being searched for
	 */
	public void search(String key) {
	        if (dictionary.containsKey(key)) {
	            String definition = dictionary.get(key);
	            int hashKey = key.hashCode();
	            System.out.println("Word: " + key);
	            System.out.println("Definition: " + definition);
	            System.out.println("Hash Key: " + hashKey);
	        } else {
	            System.out.println("Word not found: " + key);
	        }
	    }
	
}//end class