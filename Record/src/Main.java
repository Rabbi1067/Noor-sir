import dto.Product;
import dto.StudentDetails;
import dto.StudentGpaRecord;

void main() {
    Student student = new Student();
    student.setId(1);
    student.setName("Mr. Java");
    student.setGpa(3.52);

    StudentGpaRecord record = new StudentGpaRecord(student.getName(), student.getGpa(), student.getId());
    IO.println(record.name());
    Product r = new Product("Rabbi",500.0);
}