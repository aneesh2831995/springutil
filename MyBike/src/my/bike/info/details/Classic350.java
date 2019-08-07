package my.bike.info.details;

public class Classic350 implements Detalis {
	private String name = "Classic350";

	@Override
	public String getBikeName() {
		return name;
	}

	@Override
	public int getPrice() {
		return 165000;
	}

	@Override
	public String getFeedBack() {
		return "vibration from 40km/h";
	}

}
