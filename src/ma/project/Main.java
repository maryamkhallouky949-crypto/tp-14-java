package ma.project;

import java.util.Date;
import java.util.List;

import ma.project.entities.Machine;
import ma.project.entities.Salle;
import ma.project.service.MchineService;
import ma.project.service.SalleService;

public class Main {

    public static void main(String[] args) {

        SalleService salleService = new SalleService();
        MchineService machineService = new MchineService();


        System.out.println("AJOUT DES SALLES ");

        Salle s1 = new Salle(1, "A1", "Salle Informatique");
        Salle s2 = new Salle(2, "B2", "Salle Réseau");

        salleService.ajouter(s1);
        salleService.ajouter(s2);

        List<Salle> salles = salleService.getAll();

        for (int i = 0; i < salles.size(); i++) {
            System.out.println(salles.get(i));
        }


        System.out.println(" AJOUT DES MACHINES");

        Machine m1 = new Machine(1, "PC-DELL-01", new Date(), s1);
        Machine m2 = new Machine(2, "PC-HP-02", new Date(), s1);
        Machine m3 = new Machine(3, "SERV-IBM-01", new Date(), s2);

        machineService.ajouter(m1);
        machineService.ajouter(m2);
        machineService.ajouter(m3);

        List<Machine> machines = machineService.getAll();

        for (int i = 0; i < machines.size(); i++) {
            System.out.println(machines.get(i));
        }

        

        System.out.println(" RECHERCHE PAR ID ");

        Machine machine = machineService.getById(1);

        System.out.println(machine);


        System.out.println(" MACHINES DE LA SALLE A1");

        List<Machine> machinesA1 =
                machineService.getMachinesBySalle(1);

        for (int i = 0; i < machinesA1.size(); i++) {
            System.out.println(machinesA1.get(i));
        }


        System.out.println("MODIFICATION ");

        m1.setRef("PC-DELL-PRO");

        machineService.modifier(m1);

        System.out.println(machineService.getById(1));


        System.out.println("SUPPRESSION ");

        machineService.supprimer(m3);


        System.out.println(" LISTE FINALE DES MACHINES ");

        List<Machine> toutes = machineService.getAll();

        for (int i = 0; i < toutes.size(); i++) {
            System.out.println(toutes.get(i));
        }
    }
}