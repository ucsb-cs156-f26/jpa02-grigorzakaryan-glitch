package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    //EqualstTest
    @Test
    public void equals_same_object_returns_true() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_different_class_returns_false() {
        assertFalse(team.equals("test-team"));
    }

    @Test
    public void equals_same_name_and_members_returns_true() {
        Team other = new Team("test-team");
        team.addMember("Grigor");
        other.addMember("Grigor");

        assertTrue(team.equals(other)); // T, T
    }

    @Test
    public void equals_same_name_different_members_returns_false() {
        Team other = new Team("test-team");
        other.addMember("Grigor");

        assertFalse(team.equals(other)); // T, F
    }

    @Test
    public void equals_different_name_same_members_returns_false() {
        Team other = new Team("different-team");

        assertFalse(team.equals(other)); // F, T: both member lists are empty
    }

    @Test 
    public void test_hashCode_method() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());

        // Check the current implementation to catch hashCode mutations.
        assertEquals(130294, t1.hashCode());
    }
}
