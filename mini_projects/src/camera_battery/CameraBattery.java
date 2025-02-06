package camera_battery;


/**
 * Name: Ronaldo Doe Targbeh
 * Due: February 10, 2023
 * 
 * @author Ronald
 *
 */

import java.lang.Math;

public class CameraBattery {
	
	/**
	 * Declaring constant variables
	 */
	public static final int NUM_CHARGER_SETTINGS = 4;
	public static final double CHARGE_RATE = 2.0;
	public static final double DEFAULT_CAMERA_POWER_CONSUMPTION = 1.0;
	
	/**
	 * Declaring instance variables
	 */
	private double batteryStartingCharge; 
	private double capacity;
	private boolean isConnected;
	private double batteryCharge;
	private int chargerSetting;
	private double totalDrain;
	private double cameraPowerConsumption;

	
/**
 * Constructing new camera battery simulation
 * @param batteryStartingCharge
 * @param batteryCapacity
 */
public CameraBattery(double batteryStartingCharge, double batteryCapacity) {
	this.batteryCharge = batteryStartingCharge;
	this.capacity = batteryCapacity;
	this.cameraPowerConsumption = DEFAULT_CAMERA_POWER_CONSUMPTION;
	this.batteryStartingCharge = Math.min(batteryStartingCharge, batteryCapacity);
	
	this.chargerSetting = 0;
	this.totalDrain = 0;
	this.isConnected = false;
}

/**
 * Indicates the user has pressed the setting button one time on the external charger. 
 * The charge setting increments by one or if already at the maximum setting wraps around to setting 0
 */
public void buttonPress() {
	chargerSetting = (chargerSetting + 1) % NUM_CHARGER_SETTINGS;
}

/**
 * Charges the battery connected to the camera  for a given number of minutes
 *  The method returns the actual amount the battery has been charged.
 * @param minutes
 * @return charge
 */
public double cameraCharge(double minutes) {
	double charge = 0;
	if (isConnected) 
		charge = Math.min(minutes * CHARGE_RATE , capacity - batteryCharge);
	batteryCharge += charge;
	
	return charge;
}

/**
 * Drains the battery connected to the camera for a given number of minutes.
 * The method returns the actual amount drain from the battery
 * @param minutes
 * @return drain
 */
public double drain(double minutes) {
	double drain = 0;
	if (isConnected) 
		drain = Math.min(minutes  * cameraPowerConsumption, batteryCharge);
	batteryCharge -= drain;
	totalDrain += drain;
	
	return drain;
}

/**
 * The battery charge from an external wall charger
 * @param minutes
 * @return charge 
 */
public double externalCharge(double minutes) {
	double charge = 0;
	if (isConnected) 
		charge = Math.min(minutes * chargerSetting * CHARGE_RATE, batteryCharge );
	
	batteryCharge += charge;
	return charge;
}

/**
 * Reset the battery monitoring system by setting the total battery drain count back to 0.
 */
public void resetBatteryMonitor() {
	totalDrain = 0;
}

/**
 * Get the battery's capacity.
 * @return batteryCapacity
 */
public double getBatteryCapacity() {
	return capacity;
}

/**
 * Get the battery's current charge.
 * @return batteryCharge
 */
public double getBatteryCharge() {
	return batteryCharge;
}

/**
 * Get the current charge of the camera's battery.
 * @return  batteryCharge
 */
 public double getCameraCharge() {
	 if (isConnected)
		 return  batteryCharge;
	 else
		 return 0;
	 
 }
 /**
  * Get the power consumption of the camera.
  * @return cameraPowerConsumption
  */
 public double getCameraPowerConsumption() {
	 return cameraPowerConsumption;
 }
 
/**
 * Get the external charger setting.
 * @return chargerSetting
 */
 public int getChargerSetting() {
	 return chargerSetting;
 }

 /**
  * Get the total amount of power drained from the battery 
  * since the last time the battery monitor was started or reset.
  * @return totalDrain
  */
 public double getTotalDrain() {
	 return totalDrain;
 }
 
/**
 * Move the battery to the external charger. Updates any variables as needed to represent the move.
 */
public void moveBatteryExternal() {
	isConnected = false;
	
}

/**
 *  Move the battery to the camera. Updates any variables as needed to represent the move
 */
public void moveBatteryCamera() {
	isConnected = true;
}

/**
 * Remove the battery from either the camera or external charger. 
 * Updates any variables as needed to represent the removal.
 */
public void removeBattery() {
	isConnected = false;
}

/**
 * Set the power consumption of the camera
 * @param cameraPowerConsumption
 */
public void setCameraPowerConsumption(double cameraPowerConsumption) {
	this.cameraPowerConsumption =  cameraPowerConsumption;

}


}