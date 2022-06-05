package Operate;

import org.hibernate.Session;

import java.util.List;

public class SimpleOperations {

    public static void dropAllTables(Session session) {

        session.beginTransaction();

        List<String> tableList =
                session.createSQLQuery("SELECT table_name FROM INFORMATION_SCHEMA.TABLES " +
                        "WHERE table_schema = 'public' ").list();

        tableList.forEach(table_name -> {
            session.createSQLQuery("DROP TABLE " + table_name + " CASCADE").executeUpdate();
        });

        session.getTransaction().commit();
    }
}