package dev.nikhil.creational.prototypeandregistry;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("John");
        student1.setAge(23);
        student1.setStudentPsp(11.00);
        student1.setAverageBatchPsp(99.0);
        student1.setBatch("Apr 23");
        System.out.println(student1.toString());

        Student student2 = student1.clone();
        System.out.println(student2.toString());

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student ujwal = studentRegistry.get("aprilBatch24").clone();
        ujwal.setAge(20);
        ujwal.setStudentPsp(95);
        ujwal.setName("Ujwal");

        Student abhiram = studentRegistry.get("aprBatchIntelligentStudent24").clone();
        abhiram.setName("Abhiram");
        abhiram.setAge(25);
        abhiram.setStudentPsp(98);

        System.out.println("ujwal = " + ujwal.getBatch());
        System.out.println("abhiram = " + abhiram.getBatch());
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr 23");
        aprBatchStudent.setAverageBatchPsp(90.0);

        studentRegistry.register("aprilBatch24", aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setIq(180);
        aprBatchIntelligentStudent.setBatch("Apr 24");
        aprBatchIntelligentStudent.setAverageBatchPsp(90.0);

        studentRegistry.register("aprBatchIntelligentStudent24", aprBatchIntelligentStudent);
    }
}
