public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax() {
        double vTax;
        if (this.salary < 1000) {
            vTax = 0;
        } else {
            vTax = this.salary * 0.03;
        }
        return (int) vTax;
    }

    int bonus() {
        double vBonus;
        if (this.workHours <= 40) {
            vBonus = 0;
        } else {
            vBonus = (this.workHours - 40) * 30;
        }
        return (int) vBonus;

    }

    int raiseSalary() {
        int time;
        double totalRaise = 0;
        time = 2021 - this.hireYear;
        if (time <= 9) {
            totalRaise = this.salary * 0.05;
        } else if (time >= 10 && time <= 19) {
            totalRaise = this.salary * 0.10;
        } else if (time >= 20) {
            totalRaise = this.salary * 0.15;
        }
        return (int) totalRaise;
    }

    public String toString() {
        System.out.println("===================");
        double taxBonus = this.salary - this.tax() + this.bonus();
        double total = this.salary + this.bonus() + this.raiseSalary() - this.tax();
        System.out.println("Çalışan Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary + " TL");
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax() + " TL");
        System.out.println("Bonus : " + this.bonus() + " TL");
        System.out.println("Maaş Artışı : " + this.raiseSalary() + " TL");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxBonus + " TL");
        System.out.println("Toplam Maaş : " + total + " TL");

        return null;
    }


}
