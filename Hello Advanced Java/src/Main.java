void main() {
    IO.println("Hello from AJ");

    Mobile m1 = new Mobile();
    IO.println(m1.getPrice());
    m1.setBrand("Apple");
    m1.setRamSize(12);
    m1.setPrice(1299.99);

    IO.println(m1.getBrand() + " " + m1.getRamSize() + "GB");

    Mobile m2 = new Mobile("Samsung Galaxy", 1099.99);
}

// Faculty -- Name, Age, Gender