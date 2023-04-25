package curs11;

public interface NewInterface extends GatherTestData, MockTestData{
	
	//o interfata poate sa mosteneasca alte interfete
	//o clasa nu poate sa mosteneasca o interfata, doar implementeaza o interfata
	
	void chooseTestScenario();

}
