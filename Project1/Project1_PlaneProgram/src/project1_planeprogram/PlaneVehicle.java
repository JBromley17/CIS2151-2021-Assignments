
package project1_planeprogram;

/**
 * @author Josiah Bromley
 */
public class PlaneVehicle {
    private final String model;
    private final double maxAltitudeInFeet; //Final, because This will not change, as exceeding maximum airline model altitude can be deadly.
    private boolean landingGear;
    private double currentAltitudeInFeet;

    //Constructor
    public PlaneVehicle(String model, double maxAltitudeInFeet){
        this.model = model;
        this.maxAltitudeInFeet = maxAltitudeInFeet;
    }
    
        public void enabledLandingGear()  {
            if  (currentAltitudeInFeet < 1000){
                setLandingGear(true);
            }

        }
    
        public void disableLandingGear()  {
            if  (currentAltitudeInFeet > 1000){
                setLandingGear(false);
            }
        }
        
         public void changeAltitude(double change)  {
            if  (change >= 0 && (currentAltitudeInFeet + change) < maxAltitudeInFeet){
                    setCurrentAltitudeInFeet(currentAltitudeInFeet + change);
                }
                if (change<0 && (currentAltitudeInFeet + change) < 1000 && isLandingGearEnabled()){
                    setCurrentAltitudeInFeet(currentAltitudeInFeet + change);
                }
        }

        
    public String getModel() {
        return model;
    }

    public double getMaxAltitudeInFeet() {
        return maxAltitudeInFeet;
    }

    public boolean isLandingGearEnabled() {
        return landingGear;
    }

    public double getCurrentAltitudeInFeet() {
        return currentAltitudeInFeet;
    }

    
    //setters
    
    public void setLandingGear(boolean landingGear) {
        this.landingGear = landingGear;
    }

    public void setCurrentAltitudeInFeet(double currentAltitudeInFeet) {
        this.currentAltitudeInFeet = currentAltitudeInFeet;
    }

}


