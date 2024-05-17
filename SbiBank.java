package registrationPage;

public class SbiBank extends RbiBank{

	@Override
	public void decidedinterstRate() {        //The SBIbank class extends RBIbank and overrides the decideInterestRate()//
		// TODO Auto-generated method stub
		System.out.println("SBI bank home loan interest rate is: 8.1%");
	}

}
