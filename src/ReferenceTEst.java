
public class ReferenceTEst {
public static void main(String[] args) {
	Empp empp = new Empp(1, "B");
	empp.cal(empp);
	System.out.println(empp.getName());
	
			
}
}
class Empp
{
	private int id;
	private String name;
	
	public Empp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void cal(Empp empp)
	{
		empp = new Empp(1, "A");
		empp.setId(1);
		empp.setName("A");
		
	}
	
	}