package notDefault;

public class FlameException extends Exception {
    public FlameException() {
    	super("woosh!            /\\/\\" 
	            + "\nException in thread \"main\" notDefault.FlameException:          /\\    /\\/    \\"
				+ "\nException in thread \"main\" notDefault.FlameException: _____/\\_/  \\/\\/        |"
				+ "\nException in thread \"main\" notDefault.FlameException: ______________________/");
    }
}
