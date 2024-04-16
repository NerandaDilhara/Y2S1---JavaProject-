package Model;

public class CustomerModel {
	private int custId;
	private String custName;
	private String custAddress;
	private String custEmail;
	private String custGender;
	private String custUserName;
	private String custPassword;
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public String getCustGender() {
		return custGender;
	}
	public String getCustUserName() {
		return custUserName;
	}
	public String getCustPassword() {
		return custPassword;
	}
	
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
}
