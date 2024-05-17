package registrationPage;

public class Encapsulations {
	
    private int mobNo ;
	private String firstName , lastName , emailAdd , branch;
	
	public int getMobNo() {
        return mobNo;
    }
	
	public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName)
	{
		 this.firstName = firstName;
	} 
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName)
	{
		this.lastName= lastName;
	}
	public String getemailAdd() {
		return emailAdd;
		
	} 
	public void emailAdd(String emailAdd) {
		
		this.emailAdd = emailAdd;
	}
	public String getbranch(String branch) {
		return branch;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Encapsulations capsule = new Encapsulations();
		
		
		
		capsule.mobNo = 8989;
		capsule.firstName="dimpee";
		capsule.lastName="rakesh";
		capsule.emailAdd="dimpee@gmail.com";
		capsule.branch="CS";
		
		
		
		System.out.println("mobNo : "+ capsule.mobNo);
		System.out.println("firstName : "+capsule.firstName);
		System.out.println("lastName :"+ capsule.lastName);
		System.out.println("emailAdd :"+ capsule.emailAdd);
		System.out.println("branch :"+ capsule.branch);
		
		
	}

}
