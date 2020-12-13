package GenericsLessons.igra;

public class Game {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Dima", 15);

        Schoolar schoolar3 = new Schoolar("Serega", 13);
        Schoolar schoolar4 = new Schoolar("Dima", 15);

        Student student1 = new Student("Serega", 22);
        Student student2 = new Student("Leha", 25);

        Worker worker1 = new Worker("Vasya", 45);
        Worker worker2 = new Worker("Petya", 34);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Qwerty");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("MotherFuckers");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Worker> workerTeam = new Team<>("Dedi");
        workerTeam.addNewParticipant(worker1);
        workerTeam.addNewParticipant(worker2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
