/*выполнил Ломов Фёдор*/

public class Employee {
    /*Поля экземпляра*/
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private  int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }//constructor Employee

    public static void main(String[] args) {
    Out();//вызов метода Out
    ArrayEmployers();//вызов метода ArrayEmployers
    }//main
    private static void Out(){//метод выводит данные параметризированного конструктора Employee
        Employee employee = new Employee("Иванов Сидр Петрович",
                "инженер-схемотехник",
                "IvanCsar@mailbox.com",
                "+79164574213",
                64217, 43);
        /*System.out.printf("ФИО: " + employee.fullName + "%n"
                + "Должность: " + employee.position + "%n"
                + "Электронная почта: " + employee.email + "%n"
                + "Номер телефона: " + employee.phoneNumber + "%n"
                + "Заработная плата: " + employee.salary + "%n"
                + "Возраст: " + employee.age);*/
    }// Out
    private static void ArrayEmployers(){//метод выводит данные массива  persArray
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван Петрович",
                "Инженер ВМСиС",
                "Ivivang@mailbox.com",
                "+79231231227",
                30000, 30);
        persArray[1] = new Employee("Сидоренко Пётр Николаевич",
                "Начальник отдела Охраны труда",
                "Primus@mailbox.com",
                "+79233405028",
                45000, 25);
        persArray[2] = new Employee("Никитенко Никон Алтуфьевич",
                "Начальник отдела Продаж",
                "Nicon@mailbox.com",
                "+79263151728",
                45000, 42);
        persArray[3] = new Employee("Аскольдов Эммануил Яковлевич",
                "Начальник отдела Маркетинга",
                "Askoldoff@mailbox.com",
                "+79133601512",
                50000, 54);
        persArray[4] = new Employee("Кулёк Александр Николаевич",
                "Коммерческий директор",
                "FromUSSR@mailbox.com",
                "+79182575477",
                117021, 51);
        for (int i = 0; i< persArray.length; i++){
            if(persArray[i].age > 40)
            System.out.printf("ФИО: " + persArray[i].fullName + "%n"
                    + "Должность: " + persArray[i].position + "%n"
                    + "Электронная почта: " + persArray[i].email + "%n"
                    + "Номер телефона: " + persArray[i].phoneNumber + "%n"
                    + "Заработная плата: " + persArray[i].salary + "%n"
                    + "Возраст: " + persArray[i].age + "%n");
        }//for
    }//ArrayEmployers
}//class Employee
