/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import project1_planeprogram.PlaneVehicle;

/**
 *
 * @author Taerynir
 */
public class PlaneVehicleUnitTest {
    
    public PlaneVehicleUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

        @Test
        public void testEnableLandingGear(){
            PlaneVehicle p = new PlaneVehicle("test 1", 60000);
                p.setCurrentAltitudeInFeet(30000);
                p.setLandingGear(false);
                p.enabledLandingGear();
                assertFalse(p.isLandingGearEnabled());
                
                p.setCurrentAltitudeInFeet(700);
                p.enabledLandingGear();
                assertTrue(p.isLandingGearEnabled());
        }
        
        @Test
        public void testDisableLandingGear(){
            PlaneVehicle p = new PlaneVehicle("test 2", 60000);
                p.setCurrentAltitudeInFeet(11000);
                p.setLandingGear(true);
                p.disableLandingGear();
                assertFalse(p.isLandingGearEnabled());
                
                p.setLandingGear(true);
                p.setCurrentAltitudeInFeet(700);
                p.disableLandingGear();
                assertTrue(p.isLandingGearEnabled()); 
        }
        
        @Test
        public void testChangeAltitude(){
            PlaneVehicle p = new PlaneVehicle("test 3", 60000);
                p.setCurrentAltitudeInFeet(30000);
                p.setLandingGear(false);
                p.changeAltitude(850000);
                assertEquals(30000, p.getCurrentAltitudeInFeet());
                
                p.changeAltitude(25000);
                assertEquals(55000, p.getCurrentAltitudeInFeet());
                
                p.changeAltitude(-54500);
                assertEquals(55000, p.getCurrentAltitudeInFeet());
                
                p.setLandingGear(true);
                p.changeAltitude(-54500);
                assertEquals(500, p.getCurrentAltitudeInFeet());
        }
        
        
        /*public void changeAltitude(double change)  {
            if  ((currentAltitudeInFeet + change) > maxAltitudeInFeet){
                if ((currentAltitudeInFeet + change) < 1000 && isLandingGearEnabled()){
                    setCurrentAltitudeInFeet(currentAltitudeInFeet + change);
               }
           }
       }
*/
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
