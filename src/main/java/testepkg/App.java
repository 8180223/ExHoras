/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testepkg;

public class App {
    public String getGreeting() {
        return "Hello world.TESTE";
    }

    public static void main(String[] args) {
        WorldTime wt = new WorldTime();
        System.out.println(wt.getTimeByCountry("Europe/Lisbon"));
    }
}    