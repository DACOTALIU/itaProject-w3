package po;

public class CClient {
	public int cId;
	public String cUsername;
	public CClient(String cUsername, String cPassword) {
		super();
		this.cUsername = cUsername;
		this.cPassword = cPassword;
	}
	public CClient(int cId, String cUsername, String cPassword) {
		// TODO Auto-generated constructor stub
		this.cId=cId;
		this.cUsername = cUsername;
		this.cPassword = cPassword;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcUsername() {
		return cUsername;
	}
	public void setcUsername(String cUsername) {
		this.cUsername = cUsername;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String cPassword;
}
