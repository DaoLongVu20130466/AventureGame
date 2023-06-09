package Story;

import aventuregame.Shop;

public class MeetShop extends Story {

	Shop shop;
	public MeetShop() {
		shop= new Shop();
		type = StoryType.MEETSHOP;
		storyContent = "Có Một gian hàng trông rất kì lạ, bạn có muốn vào xem thử không ?";
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
}
