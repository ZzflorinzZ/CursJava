package homeworkCurs8;

public class Qualification extends Teacher{
	
/*	public Qualification () {
		
		setCourse("Java");
		setExperienceYears(1);
		setSchedule("Afternoon");
	}
*/
	
	public Qualification (String Course, int ExperienceYears, String Schedule) {
		setCourse(Course);
		setExperienceYears(ExperienceYears);
		setSchedule(Schedule);
	}
	
	
	public void verify() {
				
		if(getCourse().equalsIgnoreCase("java") && getExperienceYears() >= 3 && getSchedule().equalsIgnoreCase("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}else {
			System.out.println("You do not qualify!");
		}
	}

}
