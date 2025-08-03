package inc.sims.hustles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int sId;
    @Column
    private String sName;
    @Column
    private int marks;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

   public String toString() {
        return "Student{" +
                "rollNo=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + marks +
                '}';
    }
}
