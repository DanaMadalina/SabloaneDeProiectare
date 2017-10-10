package sablon_carte;

public class Authors 
{
	private String AuthorName;
	public Authors(String AuthorName) 
	{
		this.AuthorName = AuthorName;
	}
	
	public String getAuthorName() {
		return AuthorName;
	}
	
	@Override
	public String toString() {
		return "Author: " + this.AuthorName;
	}

}
