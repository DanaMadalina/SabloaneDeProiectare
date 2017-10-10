package sablon_carte;

import java.util.ArrayList;

public class Content 
{
	private ArrayList<String> titluri;
	public Content() 
	{	
		this.titluri = new ArrayList<String>();
	}
	
	public void addTitle(String title)
	{
		this.titluri.add(title);
	}
	
	public String toString()
	{
		return String.format("Content \n%s" , this.titluri.toString());
	}

}
