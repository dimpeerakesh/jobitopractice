package registrationPage;

public class PracticeObject {
	
	String firstName,lastName,emailAdd;
    int mobNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      
		PracticeObject dimpal = new PracticeObject();
		
		dimpal.firstName ="rani";
		dimpal.lastName = "rakesh";
		dimpal.emailAdd ="rani@gmail.com";
		dimpal.mobNo =987076;
		
		
		
		PracticeObject candidateDetails = new PracticeObject();
		
		candidateDetails.firstName ="sonu";
		candidateDetails.lastName ="kalbande";
		candidateDetails.emailAdd ="sonu@gmail.com";
		candidateDetails.mobNo =9090;



		
		
		System.out.println("firstName : " + dimpal.firstName);
		System.out.println("lastName : " + dimpal.lastName);
		System.out.println("emailAdd : " + dimpal.emailAdd);
		System.out.println("mobNo : " + dimpal. mobNo);

		System.out.println("  ");


		System.out.println("firstName : " + candidateDetails.firstName);
		System.out.println("lastName : " + candidateDetails.lastName);
		System.out.println("emailAdd : " + candidateDetails.emailAdd);
		System.out.println("mobNo : " + candidateDetails. mobNo);

	}
	
}
