package project20;

public class ComicBook extends Book {

private String characterName;


public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
	super(regularPrice,publisher,yearPublished);
	this.setCharacterName(characterName);
}


public String getCharacterName() {
	return characterName;
}


public void setCharacterName(String characterName) {
	this.characterName = characterName;
}


// Override this method
public double computeSalePrice(){
    return super.getRegularPrice() - super.getRegularPrice()* 0.6;
}


}
