package sablon_carte;

public final class Tables extends Item
{

	public Tables(int chapterNumber, int subchapterNumber, int numberItem) 
	{
		super(chapterNumber, subchapterNumber, numberItem);
	}
	

	@Override
	public String print() {
		return String.format("Table %d.%d.%d ", this.chapterNumber, this.subchapterNumber, this.numberItem);
		
	}
}
