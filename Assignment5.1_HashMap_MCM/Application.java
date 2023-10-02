/**
 * This is an application that will test the functionality of the dictionary class by using a csv file, printing its contents and performing word searches
 * @author Matt
 *
 */
public class Application {
	
	/**
	 *  The main method of the application. It loads a dictionary from a CSV file, runs the specifies tasks
	 * @param args The command-line arguments
	 */
	 public static void main(String[] args) {
	        Dictionary dictionary = new Dictionary();
	        dictionary.loadDictionary("DictionaryWordValuePairs.csv");

	        System.out.println("Unsorted Dictionary:");
	        dictionary.printDictionary();

	        System.out.println("Searching for words:");
	        dictionary.search("damsel");
	        dictionary.search("peccant");
	        dictionary.search("disport");
	        dictionary.search("scot");
	        dictionary.search("guerdon");
	        
	        //word not in the dictionary
	        dictionary.search("scarf");
	        
	    }//end main
	
}//end class
