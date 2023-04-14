package homeworkCurs7;

public class NumeDuplicateV2 {

	public static void main(String[] args) {

		
		String[] myStringArray = { "Maria", "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion", "Maria" };

		
		for(int i=0; i<myStringArray.length; i++) { 

			for(int j=i+1; j<myStringArray.length; j++) {
				
				if(myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat: " + myStringArray[j]);
				}		
			}
			
		}
		
	}

}
