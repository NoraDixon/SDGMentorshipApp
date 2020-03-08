package com.cg.sdg.model;

import java.util.List;

public class User {
    private String userID;
    private String username;
    private String password;
    private String pictureFileName;
    private String name;
    private String email;
    private boolean isMentor;
    private List<Tag> tagList;
    private String bio;
    private List<String> favorites;
    private boolean isApproved;
    private String language;
    private String location;
    private List<String> mentorRequests;

    public User() {
        //for Firebase
    }

    public User(String userID, String username, String password, String pictureFileName, String name, String email, boolean isMentor, List<Tag> tagList, String bio, List<String> favorites, boolean isApproved, String language, String location, List<String> mentorRequests) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.pictureFileName = pictureFileName;
        this.name = name;
        this.email = email;
        this.isMentor = isMentor;
        this.tagList = tagList;
        this.bio = bio;
        this.favorites = favorites;
        this.isApproved = isApproved;
        this.language = language;
        this.location = location;
        this.mentorRequests = mentorRequests;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPictureFileName() {
        return pictureFileName;
    }

    public void setPictureFileName(String pictureFileName) {
        this.pictureFileName = pictureFileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMentor() {
        return isMentor;
    }

    public void setMentor(boolean mentor) {
        isMentor = mentor;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getMentorRequests() {
        return mentorRequests;
    }

    public void setMentorRequests(List<String> mentorRequests) {
        this.mentorRequests = mentorRequests;
    }
}
