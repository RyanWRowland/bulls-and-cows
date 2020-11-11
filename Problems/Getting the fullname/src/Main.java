class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = null;
        this.lastName = null;
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName == null & lastName == null) {
            return "Unknown";
        }
        if (firstName == null) {
            return lastName;
        }
        if (lastName == null) {
            return firstName;
        }

        return firstName + " " + lastName;
    }
}