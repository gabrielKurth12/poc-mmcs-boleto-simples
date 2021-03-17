import com.google.gson.annotations.SerializedName;

public class Carteira {

	@SerializedName("default")
	private boolean defaultt;

	public Carteira(boolean defaultt) {
		super();
		this.defaultt = defaultt;
	}

	public boolean isDefaultt() {
		return defaultt;
	}

	public void setDefaultt(boolean defaultt) {
		this.defaultt = defaultt;
	}

}
