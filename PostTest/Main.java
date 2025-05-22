package PostTest;

class Employee {
    public void calculateSalary() {
        System.out.println("menghitung gaji dasar karyawan.");
    }

    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println("menghitung gaji dengan bonus.");
        } else {
            System.out.println("menghitung gaji tanpa bonus.");
        }
    }
}

class SoftwareEngineer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("gaji dasar software engineer: Rp 10.000.000");
    }
    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println("gaji software engineer dengan bonus: Rp 13.000.000");
        } else {
            System.out.println("gaji software engineer tanpa bonus: Rp 10.000.000");
        }
    }
}

class DataScientist extends Employee {
    @Override 
    public void calculateSalary() {
        System.out.println("gaji dasar data scientist: Rp 12.000.000");
    }

    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println("gaji data scientist dengan bonus: Rp 14.000.000");
        } else {
            System.out.println("gaji data scientist tanpa bonus: Rp 12.000.000");
        }
    }
}


class Intern extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("gaji dasar intern: Rp 2.000.000");
    }

    public void calculateSalary(boolean withBonus) {
        if (withBonus) {
            System.out.println("gaji intern dengan bonus: Rp 2.500.000");
        } else {
            System.out.println("gaji intern tanpa bonus: Rp 2.000.000");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer(),
            new DataScientist(),
            new Intern()
        };

        System.out.println("\n=== Hitung Gaji dengan Bonus ===");
        for (Employee emp : employees) {
            emp.calculateSalary(true);
        }

        System.out.println("\n=== Hitung Gaji tanpa Bonus ===");
        for (Employee emp : employees) {
            emp.calculateSalary(false);
        }
    }
}


