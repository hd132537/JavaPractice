package org.dimigo.collection;

public class Music {

	private String title;
	private String singer;
	
	public Music(){
		
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString(){
		return "Music [title = " + getTitle() + ", singer = " + getSinger() + "]";
	}
	
	
}
