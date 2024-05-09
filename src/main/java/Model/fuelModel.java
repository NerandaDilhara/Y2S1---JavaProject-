package Model;

public class fuelModel {
	private static int fuelId;
	private static String fuelName;
	private static String fuelType;
	private static int fuleQty;
	private static double unitPrice;
	
	public static int getFuelId() {
		return fuelId;
	}
	public static String getFuelName() {
		return fuelName;
	}
	public static String getFuelType() {
		return fuelType;
	}
	public static int getFuleQty() {
		return fuleQty;
	}
	public static double getUnitPrice() {
		return unitPrice;
	}
	
	public static void setFuelId(int fuelId) {
		fuelModel.fuelId = fuelId;
	}
	public static void setFuelName(String fuelName) {
		fuelModel.fuelName = fuelName;
	}
	public static void setFuelType(String fuelType) {
		fuelModel.fuelType = fuelType;
	}
	public static void setFuleQty(int fuleQty) {
		fuelModel.fuleQty = fuleQty;
	}
	public static void setUnitPrice(double unitPrice) {
		fuelModel.unitPrice = unitPrice;
	}
	
}
