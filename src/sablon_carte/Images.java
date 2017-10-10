package sablon_carte;

public class Images extends Item
{

	public Images(int chapterNumber, int subchapterNumber, int numberItem)
	{
		super(chapterNumber, subchapterNumber, numberItem);
	}
	

	@Override
	public String print() {
		return String.format("Image %d.%d.%d", this.chapterNumber, this.subchapterNumber, this.numberItem);
		
	}
	

}
