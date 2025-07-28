package org.add;

public class GreensTech {

	public String greensOmr() {
		String omr ="Plot No. 19, Balamurugan Garden, OMR Road, Okkiam, Thoraipakkam, Kancheepuram District, Chennai – 600097";
		return omr;
	}
	public String greensAdayar() {
		String adayar="No.11, First Street, Padmanabha Nagar, Adyar, Chennai – 600020";
		return adayar;
	}
	public String greensTambaram() {
		String tambaram="No. 05, Bakthavachalam Street, West Tambaram, Chennai – 600045";
		return tambaram;
	}
	public String greensVelacherry() {
		String velacherry="51-A, 2nd Floor, Velachery Main Road, Dhadeswaram Nagar, Velachery, Chennai – 600042";
		return velacherry;
	}
	public String greensAnnaNagar() {
		String annaNagar="51-A, 2nd Floor, Velachery Main Road, Dhadeswaram Nagar, Velachery, Chennai – 600042";
		return annaNagar;
	}
	
	public static void main(String[] args) {
		GreensTech gt=new GreensTech();
		System.out.println("Greens Technology Branch Addresses");
		System.out.println("OMR :- " + gt.greensOmr());
		System.out.println("Adayar :- " + gt.greensAdayar());
		System.out.println("Tambaram :- "+ gt.greensTambaram());
		System.out.println("Velachery : -"+ gt.greensVelacherry());
		System.out.println("AnnaNagar :- "+ gt.greensAnnaNagar());
	}
}
