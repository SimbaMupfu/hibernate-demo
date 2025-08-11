package inc.sims.hustles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TryHibernate {

    public static void main(String[] args){

        Configuration cfg = new Configuration()
                .addAnnotatedClass(inc.sims.hustles.Student.class)
                .addAnnotatedClass(inc.sims.hustles.Teacher.class)
                .addAnnotatedClass(inc.sims.hustles.Club.class)
                .addAnnotatedClass(inc.sims.hustles.Laptop.class)
                .configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        saveData(session);
//        retrieveData(session);
//        updateData(session);
//        deleteData(session);
        session.close();
        sf.close();


    }

    private static void saveData(Session session){
        Student student1 = new Student();
        student1.setsId(13);
        student1.setsName("Mupfururirwa");
        student1.setMarks(100);

        Teacher teacher1 = new Teacher();
        teacher1.settId(1);
        teacher1.setSubject("Mathematics");
        teacher1.setNumberOfStudents(40);

        Laptop laptop = new Laptop();
        laptop.setLaptopId(1);
        laptop.setBrand("MacBook Pro");
        laptop.setModel("M2");
        laptop.setRam(8);

        Laptop workLaptop = new Laptop();
        workLaptop.setLaptopId(2);
        workLaptop.setBrand("MacBook Pro");
        workLaptop.setModel("M1");
        workLaptop.setRam(16);

        Club club = new Club();
        club.setCid(101);
        club.setClubName("Rotary club");
        club.setTech("Java");
        club.setLaptops(List.of(laptop, workLaptop));

        laptop.setClub(club);
        workLaptop.setClub(club);

        Transaction transaction = session.beginTransaction();
        session.persist(laptop);
        session.persist(workLaptop);
        session.persist(club);
        transaction.commit();
    }

    private static void retrieveData(Session session){
        Student student;
        student = session.find(Student.class, 6);
        System.out.println(student);
    }

    private static void updateData(Session session){
        Student student1 = new Student();
        student1.setsId(13);
        student1.setsName("Mupfururirwa");
        student1.setMarks(100);

        Teacher teacher1 = new Teacher();
        teacher1.settId(2);
        teacher1.setSubject("English");
        teacher1.setNumberOfStudents(39);

        Transaction transaction = session.beginTransaction();
        session.merge(teacher1);
        transaction.commit();

        System.out.println(teacher1);
    }

    private static void deleteData(Session session){
        Student student = session.find(Student.class, 13);
        Transaction transaction = session.beginTransaction();
        session.remove(student);
        transaction.commit();

        System.out.println(student.getsName() + "deleted successfully!!!");
    }
}
