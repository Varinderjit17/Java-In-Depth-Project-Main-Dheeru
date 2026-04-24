package com.rupicodes.entities;

import com.rupicodes.partner.Shareable;

public class Weblink extends Bookmark implements Shareable {

	private String url;
	private String host;

	public String getUrl() {
		return url;
	}

	public String getHost() {
		return host;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Weblink [url=" + url + ", host=" + host + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
		return true;
	}

	@Override
	public String getItemData() {
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
		builder.append("<type> ").append("Weblink").append("</type>");
		builder.append("<title> ").append(getTitle()).append("</title>");
		builder.append("<url> ").append(getUrl()).append("</url>");
		builder.append("<host> ").append(getHost()).append("</host>");
		builder.append("</item>");
		return builder.toString();
	}

}
