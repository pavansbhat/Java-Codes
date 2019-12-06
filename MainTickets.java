class Aircraft{
	protected String aircraftName,source,destination;
	
	
	
	public Aircraft(String aircraftName,String source,String destination) {
		this.aircraftName=aircraftName;
		this.source=source;
		this.destination=destination;
	}
	void disp1() {
		System.out.println("The name of Aircraft of your Choosing is"+" "+aircraftName);
		System.out.println("Source place of travel is"+" "+source);
		System.out.println("Destination of the travel is"+" "+destination);
		
	}
	
}
class PublicAircraft extends Aircraft{
	private Boolean checkinbeforetwohours;
	int noOfKgsallowed;
	float additionalFeeperkg;

	public PublicAircraft(String aircraftName, String source, String destination,Boolean checkinbeforetwohours,int noOfKgsallowed,float additionalFeeperkg) {
		super(aircraftName,source,destination);
		this.checkinbeforetwohours=checkinbeforetwohours;
		this.noOfKgsallowed=noOfKgsallowed;
		this.additionalFeeperkg=additionalFeeperkg;
	}
	void disp() {
		System.out.println("Should the passenger be checking in 2 hours prior to Take off?"+" "+checkinbeforetwohours);
		System.out.println("Luggage allowed in terms of Kgs"+" "+noOfKgsallowed);
		System.out.println("Additional cost for extra weight if carried"+" "+additionalFeeperkg);
	}
}
public class PrivateAircraft extends Aircraft {
	private Boolean checkinbeforetwohours;
	String pilotPreference;
	String purpose;
	public PrivateAircraft(String aircraftName, String source, String destination,Boolean checkinbeforetwohours,String pilotPreference,String purpose) {
		super(aircraftName,source,destination);
		this.checkinbeforetwohours=checkinbeforetwohours;
		this.pilotPreference=pilotPreference;
		this.purpose=purpose;
	}
	void disp2() {
		System.out.println("Should the passenger be checking in 2 hours prior to Take off?"+" "+checkinbeforetwohours);
		System.out.println("Your Preferred Pilot is"+" "+pilotPreference);
		System.out.println("Purpose of your Travel is"+" "+purpose);
	}
}
public class MainTickets   {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
			
		System.out.println("The name of Aircraft of your Choosing is");
		String A1=scan.nextLine();
		System.out.println("Source place of travel is");
		String A2=scan.nextLine();
		System.out.println("Destination of the travel is");
		String A3=scan.nextLine();
		System.out.println("Select the type of Aircraft");
		System.out.println("1");
		System.out.println("2");
		String Tp=scan.nextLine();
		if(Tp.equals("1")) {
			Scanner sm=new Scanner(System.in);
			System.out.println("Public Air Craft");
			System.out.println("Should the passenger be checking in 2 hours prior to Take off?");
			String d1=sm.nextLine();
			System.out.println("Luggage allowed in terms of Kgs");
			int d2=sm.nextInt();
			System.out.println("Additional cost for extra weight if carried");
			float d3=sm.nextFloat();
			PublicAircraft pt=new PublicAircraft(A1,A2,A3,true,d2,d3);
			pt.disp1();
			pt.disp();
			
		}
				
		
		else if(Tp.equals("2")){
			Scanner sm=new Scanner(System.in);
			System.out.println("Private Air Craft");
			System.out.println("Should the passenger be checking in 2 hours prior to Take off?");
			String P1=sm.nextLine();
			System.out.println("Your Preferred Pilot is");
			String P2=sm.nextLine();
			System.out.println("Purpose of your Travel is");
			System.out.println("1.Medical");
			System.out.println("2.Personal");
			System.out.println("3.Cargo");
			String P3=sm.nextLine();
			if(P3.equals("1")) {
				Scanner Sn=new Scanner(System.in);
				System.out.println("Medical");
			}
			else if(P3.equals("2")) {
				System.out.println("Personal");
			}
			else if(P3.equals("3")) {
				System.out.println("Cargo");
			}
			
			PrivateAircraft ps=new PrivateAircraft(A1,A2,A3,false,P2,P3);
			ps.disp1();
			ps.disp2();
		}
	}
}
