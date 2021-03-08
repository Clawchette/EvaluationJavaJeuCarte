package plateau.cartes;

public abstract class Carte {
	protected int cout;
	protected String text;
	protected String type;
	
	public int getCout() {
		return cout;
	}
	public void setCout(int cout) {
		this.cout = cout;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Carte() {
		System.out.println(this.getType());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(type);
		sb.append("- coût : ");
		sb.append(cout);
		sb.append(text);
		return sb.toString();
	}
	
}