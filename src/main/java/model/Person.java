package model;

public class Person {

    private long customerId;
    private String surName;
    private long creditScore;
    private String geography;
    private String gender;
    private int age;
    private int tenure;
    private float balance;
    private int numOfProducts;
    private boolean hasCrCard;
    private boolean isActiveMember;
    private float estimatedSalary;
    private boolean exited;
    private long currentLoanAmount;

    public Person(long customerId, String surName, long creditScore, String geography, String gender, int age, int tenure, float balance, int numOfProducts, boolean hasCrCard, boolean isActiveMember,
                  float estimatedSalary, boolean exited, long currentLoanAmount) {
        this.customerId = customerId;
        this.surName = surName;
        this.creditScore = creditScore;
        this.geography = geography;
        this.gender = gender;
        this.age = age;
        this.tenure = tenure;
        this.balance = balance;
        this.numOfProducts = numOfProducts;
        this.hasCrCard = hasCrCard;
        this.isActiveMember = isActiveMember;
        this.estimatedSalary = estimatedSalary;
        this.exited = exited;
        this.currentLoanAmount = currentLoanAmount;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public long getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(long creditScore) {
        this.creditScore = creditScore;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public boolean isHasCrCard() {
        return hasCrCard;
    }

    public void setHasCrCard(boolean hasCrCard) {
        this.hasCrCard = hasCrCard;
    }

    public boolean isActiveMember() {
        return isActiveMember;
    }

    public void setActiveMember(boolean activeMember) {
        isActiveMember = activeMember;
    }

    public float getEstimatedSalary() {
        return estimatedSalary;
    }

    public void setEstimatedSalary(float estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }

    public boolean isExited() {
        return exited;
    }

    public void setExited(boolean exited) {
        this.exited = exited;
    }

    public long getCurrentLoanAmount() {
        return currentLoanAmount;
    }

    public void setCurrentLoanAmount(long currentLoanAmount) {
        this.currentLoanAmount = currentLoanAmount;
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "customerId=" + customerId +
                ", surName='" + surName + '\'' +
                ", creditScore=" + creditScore +
                ", geography='" + geography + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tenure=" + tenure +
                ", balance=" + balance +
                ", numOfProducts=" + numOfProducts +
                ", hasCrCard=" + hasCrCard +
                ", isActiveMember=" + isActiveMember +
                ", estimatedSalary=" + estimatedSalary +
                ", exited=" + exited +
                ", currentLoanAmount=" + currentLoanAmount +
                '}'+"\n";
    }
}
