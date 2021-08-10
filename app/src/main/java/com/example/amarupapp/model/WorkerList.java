package com.example.amarupapp.model;

public class WorkerList {
    private int profileImage;
    private String name,post,email,officePhone,mobile;

    public WorkerList(int profileImage, String name, String post, String email, String officePhone, String mobile) {
        this.profileImage = profileImage;
        this.name = name;
        this.post = post;
        this.email = email;
        this.officePhone = officePhone;
        this.mobile = mobile;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
