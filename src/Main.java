import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute tst = new Institute("ЦТ", "300");
        Institute itu = new Institute("ИТУ", "301");
        Institute piit = new Institute("ПиИТ", "302");
        fkn.setInstitutes(new Institute[]{tst, itu, piit});
        ResearchAssociate kozub1 = new ResearchAssociate(228, "Козуб Мария Александровна",
                "МОИИ");
        ResearchAssociate kozub2 = new ResearchAssociate(1488, "Козуб Мария Александровна",
                "Компьютерная графика");
        ResearchAssociate kozub3 = new ResearchAssociate(337, "Козуб Мария Александровна",
                "Информационные технологии");
        ResearchAssociate kozub4 = new ResearchAssociate(1234, "Козуб Мария Александровна",
                "Введение в программирование");
        piit.setEmployees(new ResearchAssociate[]{kozub1, kozub2, kozub3, kozub4});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры факультета " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] piit_employees = piit.getEmployees();
        System.out.println("Сотрудники кафедры " + piit.getName() + ": \n");
        for (int i = 0; i < piit_employees.length; i++) {
            System.out.println(piit_employees[i].getName());
        }
    }
}
