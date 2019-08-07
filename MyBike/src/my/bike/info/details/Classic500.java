package my.bike.info.details;

public class Classic500 implements Detalis {
	private String name = "Classic500";

	@Override
	public String getBikeName() {
		return name;
	}

	@Override
	public int getPrice() {
		return 225000;
	}

	@Override
	public String getFeedBack() {
		return "vibration from 60km/h";
	}

}
