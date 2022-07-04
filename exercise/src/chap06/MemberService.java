package chap06;

public class MemberService {

	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
