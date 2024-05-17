package registrationPage;

public class AxisBank extends RbiBank {

	@Override
	public void decidedinterstRate() {
		// TODO Auto-generated method stub
		System.out.println("Axis bank home loan interest rate is: 8.4%");
    }
	
 
public static void main(String[] args)
{
	SbiBank sb=new SbiBank();  //static 
	sb.decidedinterstRate();
	
	HdfcBank hd = new HdfcBank();
	hd.decidedinterstRate();
	
	AxisBank as=new AxisBank();
	as.decidedinterstRate();
	
}
	
}
	
	
	



