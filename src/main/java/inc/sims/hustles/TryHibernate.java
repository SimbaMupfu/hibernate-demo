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

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(inc.sims.hustles.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student1);
        transaction.commit();

        System.out.println(student1);
    }
}
