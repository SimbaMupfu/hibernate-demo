package inc.sims.hustles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TryHibernate {

    public static void main(String[] args){

        Student student1 = new Student();
        student1.setsId(13);
        student1.setsName("Mupfururirwa");
        student1.setMarks(100);

        Teacher teacher1 = new Teacher();
        teacher1.settId(1);
        teacher1.setSubject("Mathematics");
        teacher1.setNumberOfStudents(40);

        Configuration cfg = new Configuration()
                .addAnnotatedClass(inc.sims.hustles.Student.class)
                .addAnnotatedClass(inc.sims.hustles.Teacher.class)
                .configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(teacher1);
        transaction.commit();
        session.close();
        sf.close();

        System.out.println(teacher1);
    }
}
