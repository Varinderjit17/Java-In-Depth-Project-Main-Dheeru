package com.rupicodes.entities;

import com.rupicodes.constants.KidFriendlyStatus;

public abstract class Bookmark {
	private long id;
	private String title;
	private String profileUrl;
	private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
	private User kidFriendlyMarkedBy;
	private User sharedBy;

	public long getId() {
		return id;
	}

	public String getKidFriendlyStatus() {
		return kidFriendlyStatus;
	}

	public void setKidFriendlyStatus(String kidFriendlyStatus) {
		this.kidFriendlyStatus = kidFriendlyStatus;
	}

	public String getTitle() {
		return title;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public abstract boolean isKidFriendlyEligible();

	/**
	 * @return User return the kidFriendlyMarkedBy
	 */
	public User getKidFriendlyMarkedBy() {
		return kidFriendlyMarkedBy;
	}

	/**
	 * @param kidFriendlyMarkedBy the kidFriendlyMarkedBy to set
	 */
	public void setKidFriendlyMarkedBy(User kidFriendlyMarkedBy) {
		this.kidFriendlyMarkedBy = kidFriendlyMarkedBy;
	}

	/**
	 * @return User return the sharedBy
	 */
	public User getSharedBy() {
		return sharedBy;
	}

	/**
	 * @param sharedBy the sharedBy to set
	 */
	public void setSharedBy(User sharedBy) {
		this.sharedBy = sharedBy;
	}

}
