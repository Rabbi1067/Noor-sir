package dto;

public record StudentGpaRecord(String name, double gpa, int id) {
    public StudentGpaRecord {
        name = name.toUpperCase();
        gpa = 4;
        if (id < 0) {
            IO.println("Invalid ID");
        }
    }
}
