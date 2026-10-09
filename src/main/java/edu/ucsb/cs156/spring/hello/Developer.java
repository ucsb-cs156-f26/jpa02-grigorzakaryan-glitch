package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Grigor";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "grigorzakaryan-glitch";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f26-12");
        team.addMember("Adrien");
        team.addMember("Grigor");
        team.addMember("Matthew A");
        team.addMember("Ray L");
        team.addMember("Red");
        team.addMember("Ryan N");
        return team;
    }
}
