package ku.calendar;

/**
 * Hello world!
 *
 */
public class App {
	private static MainController main;
    public static void main( String[] args )
    {
    	setMain(new MainController());
        getMain().startApplication();
    }
	public static MainController getMain() {
		return main;
	}
	public static void setMain(MainController main) {
		App.main = main;
	}
}
