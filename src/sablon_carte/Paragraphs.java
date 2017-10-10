package sablon_carte;

public final class Paragraphs extends Item
{
	
	public Paragraphs(int chapterNumber, int subchapterNumber, int numberItem) 
	{
		super(chapterNumber, subchapterNumber, numberItem);
	}


	@Override
	public String print() 
	{
		return String.format("Paragraph %d.%d.%d", this.chapterNumber, this.subchapterNumber, this.numberItem);
		
	}

}
