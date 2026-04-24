package com.rupicodes;

import com.rupicodes.constants.BookGenre;
import com.rupicodes.constants.Gender;
import com.rupicodes.constants.MovieGenre;
import com.rupicodes.constants.UserType;
import com.rupicodes.entities.Bookmark;
import com.rupicodes.entities.User;
import com.rupicodes.entities.UserBookmark;
import com.rupicodes.managers.BookmarkManager;
import com.rupicodes.managers.UserManager;

public class DataStore {
	public static final int USER_BOOKMARK_LIMIT = 5;
	public static final int BOOKMARK_COUNT_PER_TYPE = 5;
	public static final int BOOKMARK_TYPES_COUNT = 3;
	public static final int TOTAL_USER_COUNT = 5;

	private static User[] users = new User[TOTAL_USER_COUNT];
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
	private static int bookmarkIndex;

	public static User[] getUsers() {
		return users;
	}

	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}

	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovies();
		loadBooks();
	}

	private static void loadWebLinks() {
		bookmarks[0][0] = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger", "Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		bookmarks[0][1] = BookmarkManager.getInstance().createWeblink(2001, "Java Language Specification", "SE 21",
				"https://docs.oracle.com/javase/specs/jls/se21/html/jls-1.html",
				"https://docs.oracle.com");
		bookmarks[0][2] = BookmarkManager.getInstance().createWeblink(2002, "Guide to Java Streams", "java-streams",
				"https://www.baeldung.com/java-8-streams",
				"https://www.baeldung.com");
		bookmarks[0][3] = BookmarkManager.getInstance().createWeblink(2003, "Building a RESTful Web Service",
				"gs-rest-service",
				"https://spring.io/guides/gs/rest-service",
				"https://spring.io");
		bookmarks[0][4] = BookmarkManager.getInstance().createWeblink(2004, "Using HTTP", "Web/HTTP",
				"https://developer.mozilla.org/en-US/docs/Web/HTTP",
				"https://developer.mozilla.org");
	}

	private static void loadMovies() {
		bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS, 8.5);
		bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3001, "The Godfather", "/godfather", 1972,
				new String[] { "Marlon Brando", "Al Pacino", "James Caan" },
				new String[] { "Francis Ford Coppola" }, MovieGenre.DRAMA, 9.2);
		bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3002, "Blade Runner", "/blade-runner", 1982,
				new String[] { "Harrison Ford", "Rutger Hauer", "Sean Young" },
				new String[] { "Ridley Scott" }, MovieGenre.SCIFI_AND_FANTASY, 8.1);
		bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3003, "Some Like It Hot", "/some-like-it-hot", 1959,
				new String[] { "Marilyn Monroe", "Tony Curtis", "Jack Lemmon" },
				new String[] { "Billy Wilder" }, MovieGenre.COMEDY, 8.2);
		bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3004, "Psycho", "/psycho", 1960,
				new String[] { "Anthony Perkins", "Janet Leigh", "Vera Miles" },
				new String[] { "Alfred Hitchcock" }, MovieGenre.THRILLERS, 8.5);
	}

	private static void loadBooks() {
		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000, "Walden", "", 1854, "Wilder Publications",
				new String[] { "Henry David", " Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		bookmarks[2][1] = BookmarkManager.getInstance().createBook(4001, "Pride and Prejudice", "/pride-prejudice",
				1813,
				"Penguin Classics", new String[] { "Jane Austen" }, BookGenre.ROMANCE, 4.6);
		bookmarks[2][2] = BookmarkManager.getInstance().createBook(4002, "The Hobbit", "/hobbit", 1937,
				"Allen & Unwin", new String[] { "J. R. R. Tolkien" }, BookGenre.FICTION, 4.7);
		bookmarks[2][3] = BookmarkManager.getInstance().createBook(4003, "Sapiens", "/sapiens", 2011,
				"Harvill Secker", new String[] { "Yuval Noah Harari" }, BookGenre.HISTORY, 4.5);
		bookmarks[2][4] = BookmarkManager.getInstance().createBook(4004, "Clean Code", "/clean-code", 2008,
				"Prentice Hall", new String[] { "Robert C. Martin" }, BookGenre.TECHNICAL, 4.4);
	}

	private static void loadUsers() {
		users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test123", "John", "M",
				UserType.USER, Gender.MALE);
		users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "John", "M",
				UserType.CHIEF_EDITOR, Gender.MALE);
		users[2] = UserManager.getInstance().createUser(1002, "user3@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
		users[3] = UserManager.getInstance().createUser(1003, "user4@semanticsquare.com", "test", "John", "M",
				UserType.EDITOR, Gender.MALE);
		users[4] = UserManager.getInstance().createUser(1004, "user5@semanticsquare.com", "test", "John", "M",
				UserType.USER, Gender.MALE);
	}

	public static void add(UserBookmark userBookmark) {
		userBookmarks[bookmarkIndex] = userBookmark;
		bookmarkIndex++;
	}
}
