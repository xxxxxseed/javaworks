package abstractex.shop;

public class Shop1 extends HeadShop{

	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}
	
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌개: 6,000원");
	}

	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌개: 6,500원");
	}

	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 6,500원");
		
	}

}
