package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job_test1 = new Job();
        Job job_test2 = new Job();
        assertNotEquals(job_test1.getId(), job_test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job_test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job_test.getName() instanceof String);
        assertTrue(job_test.getEmployer() instanceof Employer);
        assertTrue(job_test.getLocation() instanceof Location);
        assertTrue(job_test.getPositionType() instanceof PositionType);
        assertTrue(job_test.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job_test.getName());
        assertEquals("ACME", job_test.getEmployer().getValue());
        assertEquals("Desert", job_test.getLocation().getValue());
        assertEquals("Quality control", job_test.getPositionType().getValue());
        assertEquals("Persistence", job_test.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job_test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job_test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job_test1.equals(job_test2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job_test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals('\n',job_test.toString().charAt(0));
        assertEquals('\n', job_test.toString().charAt(job_test.toString().length() - 1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job_test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nID: " + job_test.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n" , job_test.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("\nID: " + test_job.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n" , test_job.toString());
    }

}
