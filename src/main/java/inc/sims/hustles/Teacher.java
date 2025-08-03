package inc.sims.hustles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

    @Id
    private int tId;
    @Column
    private String subject;
    @Column
    private int numberOfStudents;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", subject='" + subject + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
