package sablon_carte;

import java.util.*;

public class Book 
{
	private ArrayList<Authors> authors = new ArrayList<Authors>();
	private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
	private Content content = new Content();
	private String BookName;
	private int chapterNumber;

	public Book(String BookName, Authors...author) 
	{
		this.BookName = BookName;
	
		for (Authors author1: author) 
		{
			this.authors.add(author1);
		}
		this.chapterNumber = 1;
		
		Chapter chapter1 = new Chapter(" Chapter_1 ", chapterNumber++);
		Subchapter subchapter1 = chapter1.addSubchapter("Subchapter_1");
		subchapter1.addImage();
		subchapter1.addParagrah();
		subchapter1.addTable();
		
		Subchapter subchapter2 = chapter1.addSubchapter("Subchapter_2");
		subchapter2.addParagrah();
		subchapter2.addImage();
		subchapter2.addTable();
			
		Chapter chapter2 = new Chapter(" Chapter_2 ", chapterNumber++);
		Subchapter subchapter1Chap2 = chapter2.addSubchapter("Subchapter_1");
		subchapter1Chap2.addImage();
		subchapter1Chap2.addParagrah();
		subchapter1Chap2.addTable();
		
		this.chapters.add(chapter1);
		this.chapters.add(chapter2);
		
		this.content.addTitle(chapter1.toString());
		this.content.addTitle(subchapter1.toString());
		this.content.addTitle(subchapter2.toString());
		
		this.content.addTitle(chapter2.toString());
		this.content.addTitle(subchapter1Chap2.toString());
	
		
		
		
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookName() {
		return BookName;
	}
	public ArrayList<Authors> getAuthors() {
		return authors;
	}
	
	@Override
	public String toString() {
		return String.format(" Book Name: %s \nAuthors:  %s \nContent: %s" ,getBookName(), getAuthors().toString(), this.content);
	}
	public ArrayList<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	
	

}
