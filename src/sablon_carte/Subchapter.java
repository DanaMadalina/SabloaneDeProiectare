package sablon_carte;

import java.util.ArrayList;

public class Subchapter extends ItemChapt
{
	private ArrayList<Item> items = null;
	private int subchapterNumber;
	private int tableNumber, imageNumber, paragraphNumber;

	public Subchapter(int chapterNumber, int subChaterNumber, String subchapterName) 
	{
		super(chapterNumber, subchapterName);
		this.setItems(new ArrayList<Item>());
		this.subchapterNumber = subChaterNumber;
		this.tableNumber = 1;
		this.imageNumber = 1;
		this.paragraphNumber = 1;
	}

	@Override
	public String toString() 
	{
		return String.format("%d.%d %s\tContent: %s\n", this.chapterNumber, this.subchapterNumber, this.name, this.items.toString());
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void addImage()
	{
		Item image = (Item) new Images(this.chapterNumber, this.subchapterNumber, this.imageNumber++);
		this.items.add(image);
	}
	
	public void addTable()
	{
		Item table = (Item) new Tables(this.chapterNumber, this.subchapterNumber, this.tableNumber++);
		this.items.add(table);
	}
	
	public void addParagrah()
	{
		Item paragraph = (Item) new Paragraphs(this.chapterNumber, this.subchapterNumber, this.paragraphNumber++);
		this.items.add(paragraph);
	}
	
	
	
	
	
	
	
}
