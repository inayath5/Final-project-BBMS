package com.example.bloodbankmanagement.bloodbankmanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="donor")
public class Donor {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Integer id;
    @Column(name="donorname")
    private String donorName;
    @Column(name = "bloodgroup")
    private String bloodGroup;
    @Column(name = "sex")
    private  String sex;
    @Column(name = "age")
    private  String age;
    @Column(name = "address")
    private  String address;
    @Column(name = "date")
    private String date;
    @Column(name = "contact")
    private  String contact;
    @Column(name = "email")
    private  String email;

    @OneToMany(mappedBy = "donor",cascade = CascadeType.ALL)
    private List<Blood> blood=new ArrayList<>();


    public Donor(String donorName, String bloodGroup, String sex, String age, String address, String date, String contact, String email, List<Blood> blood) {
        this.donorName = donorName;
        this.bloodGroup = bloodGroup;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.date = date;
        this.contact = contact;
        this.email = email;
        this.blood = blood;
    }

    public Donor() {
    }

    public Donor(String donorName, String address, String contact, String age, String email, String bloodGroup, String sex, String date) {
        this.donorName=donorName;
        this.address=address;
        this.contact=contact;
        this.age=age;
        this.email=email;
        this.bloodGroup=bloodGroup;
        this.sex=sex;
        this.date=date;
    }

    public Donor(Integer id, String donorName, String address, String contact, String age, String email, String bloodGroup, String sex, String date) {
        this.id=id;
        this.donorName=donorName;
        this.address=address;
        this.contact=contact;
        this.age=age;
        this.email=email;
        this.bloodGroup=bloodGroup;
        this.sex=sex;
        this.date=date;

    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Blood> getBlood() {
        return blood;
    }

    public void setBlood(List<Blood> blood) {
        this.blood = blood;
    }

	@Override
	public String toString() {
		return "Donor [id=" + id + ", donorName=" + donorName + ", bloodGroup=" + bloodGroup + ", sex=" + sex + ", age="
				+ age + ", address=" + address + ", date=" + date + ", contact=" + contact + ", email=" + email
				+ ", blood=" + blood + "]";
	}

    
}
