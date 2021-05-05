package test.mypac;

public class UserInfo {
	private String UserId;
	private String UserPw;
	
	public void SignUp(String userId, String userPw) {
		this.setUserInfo(userId, userPw);
	}
	
	public void LoginCheck(String userId, String userPw) {
		if(this.Check(userId,userPw)) System.out.println("로그인성공!"); 
		else System.out.println("로그인실패!");
	}
	
	private boolean Check(String id,String pw) {
		if(id.equals(this.UserId) && pw.equals(this.UserPw)) return true;
		else return false;
	}
	
	private void setUserInfo(String userId, String userPw) {
		this.UserId = userId;
		this.UserPw = userPw;
	}
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPw() {
		return UserPw;
	}
	public void setUserPw(String userPw) {
		UserPw = userPw;
	}
}
