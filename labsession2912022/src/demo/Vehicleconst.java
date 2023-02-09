

package demo;

class vehicale{
	int modle;
	String name;
	 vehicale() //no argument constructer
	{
		this.modle=100;
		this.name="Hero Honda";
	}
	vehicale(int r,String n){ //paramertrizes constructer
		this.modle=r;
		this.name=n;
	}
}


public class Vehicleconst {

	public static void main(String[] args) {
		vehicale s=new vehicale();
		vehicale s1=new vehicale();
		vehicale s2=new vehicale(100,"Hero Honda");
		// TODO Auto-generated method stub
		System.out.println(s.modle);
		System.out.println(s.name);
		System.out.println(s1.modle);
		System.out.println(s1.name);
		System.out.println(s2.modle);
		System.out.println(s2.name);

	}

}