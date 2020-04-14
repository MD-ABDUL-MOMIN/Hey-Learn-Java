package generics;

interface Liquid{
	public String taste();
}
public class BoundedTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test1");
		DJuice djuice = new DJuice();
		DWater dwater = new DWater();
		Glass<DJuice> abc = new Glass<DJuice>();
		//System.out.println(test);
		abc.setLiquid(djuice);
		System.out.println(abc.getLiquidTaste());
		System.out.println("test2");
		// Another class 
		Glass<DWater> waterGlass = new Glass<DWater>();
		waterGlass.setLiquid(dwater);
		System.out.println(waterGlass.getLiquidTaste());

	}

}
class Glass<T extends Liquid>{
	private T liquid;
	
	public T getLiquid() {
		return liquid;
	}

	public void setLiquid(T liquid) {
		this.liquid = liquid;
	}

	public String getLiquidTaste() {
		String tase = liquid.taste();
		return tase;
	}
}

class DJuice implements Liquid{

	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}
	
	
	
}
class DWater implements Liquid{

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


