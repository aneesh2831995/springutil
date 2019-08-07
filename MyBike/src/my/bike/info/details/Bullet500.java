package my.bike.info.details;

public class Bullet500 implements Detalis {
	private String name = "Bullet500";

	@Override
	public String getBikeName() {
		return name;
	}

	@Override
	public int getPrice() {
		return 175000;
	}

	@Override
	public String getFeedBack() {
		return "no vibration up to 90km/h";
	}

}
