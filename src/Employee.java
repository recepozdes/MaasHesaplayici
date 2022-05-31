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


    double tax(){
        double tax=0;
        if(this.salary<1000){
            tax=salary*0.0;
            return tax;
        }
        else{
            tax=salary*0.03;
            return tax;
        }

    }

    int bonus(){
        int bonus=0;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
            return bonus;
        }
        return bonus;
    }

    double raiseSalary(){
        double raise=0;
        int thisYear=2021;
        if(thisYear-this.hireYear<10){
            raise=this.salary*0.05;
            return raise;

        }
        if(thisYear-this.hireYear>9&& thisYear-this.hireYear<20){
            raise=this.salary*0.1;
            return raise;
        }
        if(thisYear-this.hireYear>19){
            raise=this.salary*0.15;
            return raise;
        }
        return raise;
    }

    void toPrintString(){
        System.out.println("Adı\t:"+this.name);
        System.out.println("Maaşı\t:"+this.salary);
        System.out.println("Çalışma Saati\t:"+this.workHours);
        System.out.println("Başlangıç Yılı\t:"+this.hireYear);
        System.out.println("Vergi\t:"+this.tax());
        System.out.println("Bonus\t:"+this.bonus());
        System.out.println("Maaş Artışı\t:"+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş\t:"+(this.salary-this.tax()+this.bonus()));
        System.out.println("Toplam Maaş\t:"+(this.salary-this.tax()+this.bonus()+this.raiseSalary()));
    }


}
