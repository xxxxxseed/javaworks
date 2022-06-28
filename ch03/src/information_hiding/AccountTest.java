package information_hiding;

public class AccountTest {

	public static void main(String[] args) {
		//Account 클래스의 객체 생성
		Account account = new Account();
		Account account2 = new Account("100-1235", "안산", 2000);
		
		//필드에 직접 접근하지 못함
		//account.ano = "100-1234";
		account.setAno("100-1234");
		//accoun.owner = "다이소";
		account.setOwner("다이소");
		//account.balance = 1000;
		account.setBalance(1000);
		
		System.out.println("계좌번호 : " + account.getAno());
		System.out.println("계좌주 : " + account.getOwner());
		System.out.println("잔액 : " + account.getBalance());
		
		System.out.println("계좌번호 : " + account2.getAno());
		System.out.println("계좌주 : " + account2.getOwner());
		System.out.println("잔액 : " + account2.getBalance());
	}

}
