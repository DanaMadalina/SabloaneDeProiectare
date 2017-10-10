package sablon_carte;


public abstract class Item 
{
	protected int numberItem, chapterNumber, subchapterNumber;
	
	public Item(int chapterNumber, int subchapterNumber, int numberItem)
	{
		this.numberItem = numberItem;
		this.chapterNumber = chapterNumber;
		this.subchapterNumber = subchapterNumber;
	}
	
	abstract public String print();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return print();
	}
}
