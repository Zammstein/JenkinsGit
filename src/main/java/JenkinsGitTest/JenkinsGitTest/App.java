package JenkinsGitTest.JenkinsGitTest;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        CalculateSomeThings calc = new CalculateSomeThings(1,22);
        System.out.println(calc.result);
    }
}
