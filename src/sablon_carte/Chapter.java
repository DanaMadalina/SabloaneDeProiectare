package sablon_carte;

import java.util.ArrayList;

public class Chapter extends ItemChapt
{
	//array subcapitole
	private ArrayList<Subchapter> subchapters = new ArrayList<Subchapter>();
	private int subchapterNumber;

	public Chapter(String ChapterName, int index) 
	{
		super(index, ChapterName);
		this.setSubchapter(new ArrayList<Subchapter>());
		this.subchapterNumber = 1;
	}
	
	public ArrayList<Subchapter> getSubchapter() {
		return subchapters;
	}

	public void setSubchapter(ArrayList<Subchapter> arrayList) {
		this.subchapters = arrayList;
	}
	
	public Subchapter addSubchapter(String subchaptName)
	{
		Subchapter subchapter = new Subchapter(this.chapterNumber, this.subchapterNumber++, subchaptName);
		this.subchapters.add(subchapter);
		return subchapter;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d %s", this.chapterNumber, this.name);
	}
	
	

}
