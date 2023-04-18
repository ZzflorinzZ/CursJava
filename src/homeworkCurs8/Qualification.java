package homeworkCurs8;

public class Qualification extends Teacher{
	
	public Qualification () {
		
		setCourse("Java");
		setExperienceYears(30);
		setSchedule("Afternoon");
	}
	
	
	public void verify() {
		
		getCourse();
		getExperienceYears();
		getSchedule();
		
		if(getCourse() == "Java" && getExperienceYears() > 3 && getSchedule() == "Afternoon") {
			System.out.println("You qualify to teach at this school!");
		}else {
			System.out.println("You do not qualify!");
		}
	}

}
