public class Contact {
    private String name;
    private String relation;
    private String birthday;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name, String relation, String birthday, String phoneNumber, String emailAddress) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String toString() {
        String str = String.format("%-15s %13s   %-9s %15s %-40s", name, relation, birthday, phoneNumber, emailAddress);
        return str;
    }
}
