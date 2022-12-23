package edu.oop.schooladmin.model.implementations.sqlite;

import java.time.LocalDate;
import java.time.LocalDateTime;

import edu.oop.schooladmin.model.entities.Discipline;
import edu.oop.schooladmin.model.entities.Group;
import edu.oop.schooladmin.model.entities.Rating;
import edu.oop.schooladmin.model.entities.Student;
import edu.oop.schooladmin.model.entities.Teacher;
import edu.oop.schooladmin.model.entities.TeacherAppointment;

public class test {
    public static void main(String[] args) {
        SqlStudentsRepository testStudent = new SqlStudentsRepository();
        SqlTeachersRepository testTeacher = new SqlTeachersRepository();
        SqlDisciplinesRepository testDiscipline = new SqlDisciplinesRepository();
        SqlGroupsRepository testGroup = new SqlGroupsRepository();
        SqlAppointmentsRepository testAppointment = new SqlAppointmentsRepository();
        SqlRatingsRepository testRating = new SqlRatingsRepository();
        // System.out.println("------Стартовый список студентов------");
        // System.out.println(testStudent.getAllStudents().toString());
        // System.out.println("------Поиск студента по ID 2------");
        // System.out.println(testStudent.getStudentById(2));
        // System.out.println("------Поиск студента по FirstName Василиса------");
        // System.out.println(testStudent.getStudentsByFirstName("Василиса"));
        // System.out.println("------Поиск студента по lastName Цветков------");
        // System.out.println(testStudent.getStudentsByLastName("Цветков"));
        // System.out.println("------Поиск студента по groupId 101------");
        // System.out.println(testStudent.getStudentsByGroupId(101));
        // System.out.println("------изменить студента по Id 3 на имя Эдуард------");
        // System.out.println("------Студент с Id 3 до изменения------");
        // System.out.println(testStudent.getStudentById(3));
        // Student student2 = testStudent.getStudentById(3);
        // student2.setFirstName("Эдуард");
        // System.out.println("------изменения------");
        // System.out.println(testStudent.updateStudent(student2));
        // System.out.println("------Студент с Id 3 после изменения------");
        // System.out.println(testStudent.getStudentById(3));
        // System.out.println("------Студент с Id 3 возврат имени Владим------");
        // student2.setFirstName("Владим");
        // System.out.println(testStudent.updateStudent(student2));
        // System.out.println(testStudent.getStudentById(3));
        // System.out.println("------Удалить студента по Id 25------");
        // student2 = testStudent.getStudentById(25);
        // System.out.println(testStudent.removeStudent(25));
        // System.out.println("------Список студентов после удаления------");
        // System.out.println(testStudent.getAllStudents().toString());
        // System.out.println("------Возврат студента с ID 25------");
        // System.out.println(testStudent.addStudent(student2));
        // System.out.println("------Список студентов после возврата студента------");
        // System.out.println(testStudent.getAllStudents().toString());

        // System.out.println("------Стартовый список учителей------");
        // System.out.println(testTeacher.getAllTeachers().toString());
        // System.out.println("------Поиск учителя по ID 2------");
        // System.out.println(testTeacher.getTeacherById(2));
        // System.out.println("------Поиск учителя по FirstName Борис------");
        // System.out.println(testTeacher.getTeachersByFirstName("Борис"));
        // System.out.println("------Поиск учителя по LastName Акимова------");
        // System.out.println(testTeacher.getTeachersByLastName("Акимова"));
        // System.out.println("------Поиск учителя по grade 9------");
        // System.out.println(testTeacher.getTeachersByGrade(9));
        // System.out.println("------список учителей после добавления------");
        // System.out.println(testTeacher.getAllTeachers().toString());
        // System.out.println("------изменить учителя с Id 3 на имя Эдуард------");
        // System.out.println("------Учитель с Id 3 до изменения------");
        // System.out.println(testTeacher.getTeacherById(3));
        // Teacher teacher2 = testTeacher.getTeacherById(3);
        // teacher2.setFirstName("Эдуард");
        // System.out.println("------изменения------");
        // System.out.println(testTeacher.updateTeacher(teacher2));
        // System.out.println("------Учитель с Id 3 после изменения------");
        // System.out.println(testTeacher.getTeacherById(3));
        // System.out.println("------Учитель с Id 3 возврат имени Артём------");
        // teacher2.setFirstName("Артём");
        // System.out.println(testTeacher.updateTeacher(teacher2));
        // System.out.println(testTeacher.getTeacherById(3));
        // System.out.println("------Удалить учителя по Id 12------");
        // teacher2 = testTeacher.getTeacherById(12);
        // System.out.println(testTeacher.removeTeacher(12));
        // System.out.println("------Список учителей после удаления------");
        // System.out.println(testTeacher.getAllTeachers().toString());
        // System.out.println("------Возврат учителя с ID 7------");
        // System.out.println(testTeacher.addTeacher(teacher2));
        // System.out.println("------Список учителей после возврата учителей------");
        // System.out.println(testTeacher.getAllTeachers().toString());

        // Проверка изменений в группах и удаления назначений при удалении учителя
        // System.out.println("------Список учителей------");
        // System.out.println(testTeacher.getAllTeachers().toString());
        // System.out.println("------Список групп до удаления учителя------");
        // System.out.println(testGroup.getAllGroups().toString());
        // System.out.println("------Список назначений до удаления учителя------");
        // System.out.println(testAppointment.getAllTeacherAppointments().toString());
        // System.out.println("------Удалить учителя по Id 2------");
        // System.out.println(testTeacher.removeTeacher(2));
        // System.out.println("------Список учителей------");
        // System.out.println(testTeacher.getAllTeachers().toString());
        // System.out.println("------Список групп после удаления учителя------");
        // System.out.println(testGroup.getAllGroups().toString());
        // System.out.println("------Список назначений после удаления учителя------");
        // System.out.println(testAppointment.getAllTeacherAppointments().toString());

        // System.out.println("------Стартовый список дисциплин------");
        // System.out.println(testDiscipline.getAllDisciplines().toString());
        // System.out.println("------Поиск дисциплины по ID 2------");
        // System.out.println(testDiscipline.getDisciplineById(2));
        // System.out.println("------Поиск дисциплины по name Физика------");
        // System.out.println(testDiscipline.getDisciplineByName("Физика"));
        // System.out.println("------изменить дисциплину с Id 6 на имя История------");
        // System.out.println("------Дисциплина с Id 6 до изменения------");
        // System.out.println(testDiscipline.getDisciplineById(6));
        // Discipline discipline2 = testDiscipline.getDisciplineById(6);
        // discipline2.setName("История");
        // System.out.println("------изменения------");
        // System.out.println(testDiscipline.updateDiscipline(discipline2));
        // System.out.println("------Дисциплина с Id 6 после изменения------");
        // System.out.println(testDiscipline.getDisciplineById(6));
        // System.out.println("------Дисциплина с Id 6 возврат имени Химия------");
        // discipline2.setName("Химия");
        // System.out.println(testDiscipline.updateDiscipline(discipline2));
        // System.out.println(testDiscipline.getDisciplineById(6));
        // System.out.println("------Удалить дисциплину по Id 7------");
        // discipline2 = testDiscipline.getDisciplineById(7);
        // System.out.println(testDiscipline.removeDiscipline(7));
        // System.out.println("------Список дисциплин после удаления------");
        // System.out.println(testDiscipline.getAllDisciplines().toString());
        // System.out.println("------Возврат дисциплины с ID 7------");
        // System.out.println(testDiscipline.addDiscipline(discipline2));
        // System.out.println("------Список дисциплин после возврата дисциплины------");
        // System.out.println(testDiscipline.getAllDisciplines().toString());

        // System.out.println("------Стартовый список групп------");
        // System.out.println(testGroup.getAllGroups().toString());
        // System.out.println("------Поиск группы по ID 2------");
        // System.out.println(testGroup.getGroupById(2));
        // System.out.println("------Поиск группы по TeacherId 2------");
        // System.out.println(testGroup.getGroupsByTeacherId(2));
        // System.out.println("------Поиск группы по ClassMark А------");
        // System.out.println(testGroup.getGroupsByClassMark('А'));
        // System.out.println("------Поиск группы по ClassYear 9------");
        // System.out.println(testGroup.getGroupsByClassYear(9));
        // System.out.println("------изменить группу с Id 2 на ClassYear 10------");
        // System.out.println("------Группа с Id 2 до изменения------");
        // System.out.println(testGroup.getGroupById(2));
        // Group group2 = testGroup.getGroupById(2);
        // group2.setClassYear(10);
        // System.out.println("------изменения------");
        // System.out.println(testGroup.updateGroup(group2));
        // System.out.println("------Группв с Id 2 после изменения------");
        // System.out.println(testGroup.getGroupById(2));
        // System.out.println("------Группа с Id 2 возврат ClassYear 9------");
        // group2.setClassYear(9);
        // System.out.println(testGroup.updateGroup(group2));
        // System.out.println(testGroup.getGroupById(2));
        // System.out.println("------Удалить группу по Id 5------");
        // group2 = testGroup.getGroupById(5);
        // System.out.println(testGroup.removeGroup(5));
        // System.out.println("------Список групп после удаления------");
        // System.out.println(testGroup.getAllGroups().toString());
        // System.out.println("------Возврат группы с ID 5------");
        // System.out.println(testGroup.addGroup(group2));
        // System.out.println("------Список групп после возврата группы------");
        // System.out.println(testGroup.getAllGroups().toString());

        // System.out.println("------Список назначений------");
        // System.out.println(testAppointment.getAllTeacherAppointments().toString());
        // System.out.println("------Поиск назначения по AppointmentId 2------");
        // System.out.println(testAppointment.getTeacherAppointmentById(2));
        // System.out.println("------Поиск назначений по DisciplineId 2------");
        // System.out.println(testAppointment.getTeacherAppointmentsByDisciplineId(2));
        // System.out.println("------Поиск назначений по GroupId 91------");
        // System.out.println(testAppointment.getTeacherAppointmentsByGroupId(91));
        // System.out.println("------Поиск назначений по TeacherId 2------");
        // System.out.println(testAppointment.getTeacherAppointmentsByTeacherId(2));
        // System.out.println("------изменить назначение с Id 2. Установить GroupId
        // 10------");
        // System.out.println("------назначение с Id 2 до изменения------");
        // System.out.println(testAppointment.getTeacherAppointmentById(2));
        // TeacherAppointment appointment2 =
        // testAppointment.getTeacherAppointmentById(2);
        // appointment2.setGroupId(10);
        // System.out.println("------изменения------");
        // System.out.println(testAppointment.updateTeacherAppointment(appointment2));
        // System.out.println("------назначение с Id 2 после изменения------");
        // System.out.println(testAppointment.getTeacherAppointmentById(2));
        // System.out.println("------назначение с Id 2 возврат GroupId 91------");
        // appointment2.setGroupId(91);
        // System.out.println(testAppointment.updateTeacherAppointment(appointment2));
        // System.out.println(testAppointment.getTeacherAppointmentById(2));

        System.out.println("------Поиск рейтинга по ratingId 2------");
        System.out.println(testRating.getRatingById(2));
        System.out.println("------Поиск рейтинга по DisciplineId 2------");
        System.out.println(testRating.getRatingsByDisciplineId(2));
        System.out.println("------Поиск рейтинга по StudentId 2------");
        System.out.println(testRating.getRatingsByStudentId(2));
        System.out.println("------Поиск рейтинга по Value 5------");
        System.out.println(testRating.getRatingsByValue(3, 5));
        System.out.println("------Поиск рейтинга по DateTime------");
        System.out.println(testRating.getRatingsByDateTime(LocalDateTime.parse("2022-02-08T00:00")));
        System.out.println("------изменить рейтинг с Id 3 на Value 2------");
        System.out.println("------рейтинг с Id 3 до изменения------");
        System.out.println(testRating.getRatingById(3));
        Rating rating2 = testRating.getRatingById(3);
        rating2.setValue(2);
        System.out.println("------изменения------");
        System.out.println(testRating.updateRating(rating2));
        System.out.println("------рейтинг с Id 3 после изменения------");
        System.out.println(testRating.getRatingById(3));
        System.out.println("------рейтинг с Id 3 возврат Value 5------");
        rating2.setValue(5);
        System.out.println(testRating.updateRating(rating2));
        System.out.println(testRating.getRatingById(3));
        System.out.println("------Удалить рейтинг по Id 200------");
        rating2 = testRating.getRatingById(200);
        System.out.println(testRating.removeRating(200));
        System.out.println("------Возврат рейтинга с ID 200------");
        System.out.println(testRating.addRating(rating2));
    }
}