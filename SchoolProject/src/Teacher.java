public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    //teacher constructor, randomizes each teachers' subject
    Teacher(){
        firstName = "first";
        lastName = "last";
        int rand = (int)(Math.random()*3);
        String random;
        if(rand == 0) {
            random = "math";
        } else if (rand == 1) {
            random = "english";
        } else {
            random = "science";
        }
        subject = random;
    }

    //override to be able to print out teacher descriptions
    public String toString(){
        return "Name: " + firstName + " " + lastName + " Subject: "+ subject +"\n";
    }


    //setters + getters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
