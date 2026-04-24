package com.rupicodes.controllers;

import com.rupicodes.entities.Bookmark;
import com.rupicodes.entities.User;
import com.rupicodes.managers.BookmarkManager;

public class BookmarkController {
    private BookmarkController() {
    };

    private static BookmarkController instance = new BookmarkController();

    public static BookmarkController getInstance() {
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
    }

    public void setKidFriendlyStatus(User user, Bookmark bookmark, String kidFriendlyStatus) {
        BookmarkManager.getInstance().setKidFriendlyStatus(user, bookmark, kidFriendlyStatus);
    }

    public void share(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().share(user, bookmark);
    }
}
