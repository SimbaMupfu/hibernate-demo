package inc.sims.hustles;

import jakarta.persistence.*;

@Entity
@Table(name = "club_table")
public class Club {
    @Id
    private int cid;
    @Column(name = "club_name")
    private String clubName;

    @Transient
    private String tech;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Club{" +
                "cid=" + cid +
                ", clubName='" + clubName + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
