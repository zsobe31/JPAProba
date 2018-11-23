

package jpaproba;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;


public class JPAProba {

    
    public static void main(String[] args) {

        // Boritek b = new Boritek();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProbaPU");
        EntityManager em = emf.createEntityManager();
//        Boritek b = em.find(Boritek.class, 3);
//        System.out.println(b.getCimzet() + "\t" + b.getFelado());
        
        // a tranzakciót körbe kell venni - tranzakció kezelés
//        em.getTransaction().begin();
//        b.setMeret("A-89");
//        em.getTransaction().commit();
        
        
        // System.out.println(b.getMeret());
        
        
//        em.getTransaction().begin();
//        Boritek o = new Boritek(45,"almaméretű",12,"Plutó","Vénusz",new Date());
//        em.getTransaction().commit();
            
//        StoredProcedureQuery spq = em.createStoredProcedureQuery("addNewBoritek");
//        spq.registerStoredProcedureParameter("meretIN", String.class, ParameterMode.IN);
//        spq.setParameter("meretIN", "G-65");
//        spq.registerStoredProcedureParameter("sulyIN", Integer.class, ParameterMode.IN);
//        spq.setParameter("sulyIN", 210);
//        spq.registerStoredProcedureParameter("cimzetIN", String.class, ParameterMode.IN);
//        spq.setParameter("cimzetIN", "Ancsi");
//        spq.registerStoredProcedureParameter("feladoIN", String.class, ParameterMode.IN);
//        spq.setParameter("feladoIN", "Áron");
//        
//        spq.execute();

        // boríék hozzáadása
//        Boritek b = Boritek.addNewBoritek(em, "A1-5", 120, "Alma", "Zotya");
//        if (b != null) {
//            System.out.println("Sikeres hozzáadás!");
//        }
        
        // boriték törlése
        Boritek b1 = Boritek.deleteBoritekById(em, 13);
        if (b1 == null) {
            System.out.println("Sikeres törlés!");
        }

        // botiték módosítása
//        Boritek b2 = Boritek.updateBoritek(em, "C-12", 50, "Gyula", "Tivadar", 13);
//        if ( b2 != null ) {
//            System.out.println("Sikeres módosítás!");
//        }
        
        
        

    }

}
