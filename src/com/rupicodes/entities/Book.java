package com.rupicodes.entities;

import java.util.Arrays;

import com.rupicodes.partner.Shareable;

public class Book extends Bookmark implements Shareable {
	private int publicationYear;
	private String publisher;
	private String[] authors;
	private String genre;
	private double amazonRating;

	public int getPublicationYear() {
		return publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public String[] getAuthors() {
		return authors;
	}

	public String getGenre() {
		return genre;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}

	@Override
	public String toString() {
		return "Book [publicationYear=" + publicationYear + ", publisher=" + publisher + ", authors="
				+ Arrays.toString(authors) + ", genre=" + genre + ", amazonRating=" + amazonRating + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
		return false;
	}

	@Override
	public String getItemData() {
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
		builder.append("<type> ").append("Book").append("</type>");
		builder.append("<title> ").append(getTitle()).append("</title>");
		builder.append("<publisher> ").append(getPublisher()).append("</publisher>");
		builder.append("<authors> ").append(Arrays.toString(getAuthors())).append("</authors>");
		builder.append("<genre> ").append(getGenre()).append("</genre>");
		builder.append("<amazonRating> ").append(getAmazonRating()).append("</amazonRating>");
		builder.append("</item>");
		return builder.toString();
	}
}
