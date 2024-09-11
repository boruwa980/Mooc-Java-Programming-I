/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 *
 * @author dominik
 */
public class ExerciseManagementTest {
    
    
     @Before
     public void initialize() {        
         management = new ExerciseManagement();    
     }
    
    @Test
    public void exerciseListEmptyAtBeginning(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();        
        management.add("Write a test");        
        assertTrue(management.exerciseList().contains("Write a test"));    
    }
    
    
}
