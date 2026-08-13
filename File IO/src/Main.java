void main() {
//    int id = 2;
//    String name = "Mr Javascript";
//    double cgpa = 3.34;

//    writeFile(id, name, cgpa);

    readFile();
}

void writeFile(int id, String name, double cgpa) {
    // 1, Mr. Java, 3.52
    String line = id + "," + name + "," + cgpa + "\n";
    try {
        RandomAccessFile file = new RandomAccessFile("students.txt", "rw");
        file.seek(file.length());
        file.writeBytes(line);
        IO.println("Write Done");
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        IO.println("File not found");
    } catch (IOException ex) {
        ex.printStackTrace();
        IO.println("Invalid line");
    } catch (IllegalArgumentException ex) {
        IO.println("Illegal argument");
        ex.printStackTrace();
    }
}

void readFile() {
    try {
        RandomAccessFile raf = new RandomAccessFile("students.txt", "r");
        String line;
        while ((line = raf.readLine()) != null) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            double cgpa = Double.parseDouble(data[2]);

            if (cgpa > 3) {
                IO.println(id + " "  + name + " " + cgpa);
            }
        }
    } catch (FileNotFoundException ex) {
        IO.println("File not found");
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
        IO.println("Invalid line");
    }
}







