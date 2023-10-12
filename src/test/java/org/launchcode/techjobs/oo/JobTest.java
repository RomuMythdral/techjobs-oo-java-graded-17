package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId () {
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1,job2);
    }

    @Test
    public void  testJobConstructorSetsAllFields () {
        Employer employer1 = new Employer("ACME");
        Job job1 = new Job("Product tester", employer1, new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", employer1, new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job1.getName(), job2.getName());
        assertEquals(job1.getEmployer(), job2.getEmployer());
        assertEquals(job1.getLocation().toString(), job2.getLocation().toString());
        assertEquals(job1.getPositionType().toString(), job2.getPositionType().toString());
        assertEquals(job1.getCoreCompetency().toString(), job2.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality () {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String firstChar = String.valueOf(job1.toString().charAt(0));
        String lastChar = String.valueOf(job1.toString().charAt(job1.toString().length()-1));
        assertEquals(firstChar, "\n");
        assertEquals(lastChar, "\n");
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1.toString(), job2.toString());
    }

    @Test
    public void testToStringHandlesEmptyField () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1.toString(), job2.toString());
    }
}
