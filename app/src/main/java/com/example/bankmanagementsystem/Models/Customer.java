package com.example.bankmanagementsystem.Models;
import com.github.javafaker.Faker;


public class Customer{
    private String id,name, fathersName,dob,cardNo,pin,male,female
            ,emailAddress,married,single,other,address,city,pinCode,religion,category,income,educationQual,
            occupation,seniorYes,seniorNo,panNumber,existingYes,existingNo;

    public Customer(String id, String name, String fathersName, String dob, String cardNo, String pin, String male, String female, String emailAddress, String married, String single, String other, String address, String city, String pinCode, String religion, String category, String income, String educationQual, String occupation, String seniorYes, String seniorNo, String panNumber, String existingYes, String existingNo) {
        this.id = id;
        this.name = name;
        this.fathersName = fathersName;
        this.dob = dob;
        this.cardNo = cardNo;
        this.pin = pin;
        this.male = male;
        this.female = female;
        this.emailAddress = emailAddress;
        this.married = married;
        this.single = single;
        this.other = other;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.religion = religion;
        this.category = category;
        this.income = income;
        this.educationQual = educationQual;
        this.occupation = occupation;
        this.seniorYes = seniorYes;
        this.seniorNo = seniorNo;
        this.panNumber = panNumber;
        this.existingYes = existingYes;
        this.existingNo = existingNo;
    }

    public Customer() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getEducationQual() {
        return educationQual;
    }

    public void setEducationQual(String educationQual) {
        this.educationQual = educationQual;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSeniorYes() {
        return seniorYes;
    }

    public void setSeniorYes(String seniorYes) {
        this.seniorYes = seniorYes;
    }

    public String getSeniorNo() {
        return seniorNo;
    }

    public void setSeniorNo(String seniorNo) {
        this.seniorNo = seniorNo;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getExistingYes() {
        return existingYes;
    }

    public void setExistingYes(String existingYes) {
        this.existingYes = existingYes;
    }

    public String getExistingNo() {
        return existingNo;
    }

    public void setExistingNo(String existingNo) {
        this.existingNo = existingNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", FathersName='" + fathersName + '\'' +
                ", Dob='" + dob + '\'' +
                ", CardNo='" + cardNo + '\'' +
                ", Pin='" + pin + '\'' +
                ", Male='" + male + '\'' +
                ", Female='" + female + '\'' +
                ", EmailAddress='" + emailAddress + '\'' +
                ", Married='" + married + '\'' +
                ", Single='" + single + '\'' +
                ", Other='" + other + '\'' +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                ", PinCode='" + pinCode + '\'' +
                ", Religion='" + religion + '\'' +
                ", Category='" + category + '\'' +
                ", Income='" + income + '\'' +
                ", Education Qualification='" + educationQual + '\'' +
                ", Occupation='" + occupation + '\'' +
                ", SeniorYes='" + seniorYes + '\'' +
                ", SeniorNo='" + seniorNo + '\'' +
                ", PanNumber='" + panNumber + '\'' +
                ", ExistingYes='" + existingYes + '\'' +
                ", ExistingNo='" + existingNo + '\'' +
                '}';
    }
}
