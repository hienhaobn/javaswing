
package com.qlda.model;

import java.util.Date;

/**
 *
 * @author hienh
 */
public class DetailUser {
    private int detail_user_id;
    private String fullname;
    private Date dob;
    private String address;
    private String phone;
    private String country;
    private int user_id;
    private String gender;

    public int getDetail_user_id() {
        return detail_user_id;
    }

    public void setDetail_user_id(int detail_user_id) {
        this.detail_user_id = detail_user_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "DetailUser{" + "detail_user_id=" + detail_user_id + ", fullname=" + fullname + ", dob=" + dob + ", address=" + address + ", phone=" + phone + ", country=" + country + ", user_id=" + user_id + ", gender=" + gender + '}';
    }
    
    
}
