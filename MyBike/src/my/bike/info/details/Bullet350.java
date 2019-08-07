package my.bike.info.details;

public class Bullet350 implements Detalis {
	private String name = "Bullet350";

	@Override
	public String getBikeName() {
		return name;
	}

	@Override
	public int getPrice() {

		return 150000;
	}

	@Override
	public String getFeedBack() {

		return "Fine  no vibration up to 80km/h";
	}

}
