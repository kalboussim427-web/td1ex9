package motdict;

public class Mot_dict {
	private String Mot;
	private String Definition;
	
	public Mot_dict(String Mot, String Definition) {
		this.Mot = Mot;
		this.Definition = Definition;
	}
	
	public String getMot() {
		return Mot;
	}
	public String getDefinition() {
		return Definition;
	}
	public void setDefinition(String Definition) {
		this.Definition = Definition;
	}
	public void setMot(String Mot) {
		this.Mot = Mot;
	}
	public Boolean synonyme(String definition) {
		return this.Definition.equals(definition);
	}
	public String toString() {
		return Mot + " : " +  Definition;
	}
		
	}
	
