package inc.sims.hustles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TryHibernate {

    public static void main(String[] args){

        Configuration cfg = new Configuration()
                .addAnnotatedClass(inc.sims.hustles.Student.class)
                .addAnnotatedClass(inc.sims.hustles.Teacher.class)
                .configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
//        saveData(session);
//        retrieveData(session);
        updateData(session);
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

        Transaction transaction = session.beginTransaction();
        session.persist(teacher1);
        transaction.commit();

        System.out.println(teacher1);
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
        teacher1.settId(1);
        teacher1.setSubject("Mathematics");
        teacher1.setNumberOfStudents(38);

        Transaction transaction = session.beginTransaction();
        session.merge(teacher1);
        transaction.commit();

        System.out.println(teacher1);
    }
}
