package lessonFour;

public class lesson_four {
    public static void main(String[] args) {
//5.Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        worker[] person = new worker[5];
        person[0] = new worker("Ivanov Sergei Denisovich" ,10000, 38);
        person[1] = new worker("Plehanov Ivan Vasilievich" ,45000, 41);
        person[2] = new worker("Petrov Nikolay Victorovich" ,15000, 32);
        person[3] = new worker("Sidorov Petr Dmitrievich" ,14000, 51);
        person[4] = new worker("Prohorov Iliy Kirilovich" ,21000, 48);

        System.out.printf("Задание 5: %n");
        for (int i = 0; i < person.length; i++){
            if (person[i].age >= 40){
                System.out.printf("Персональный номер сотрудника: %d %n" , person[i].id);
                System.out.printf("ФИО сотрудника: %s. Зарплата сотрудника: %d. Возраст Сотрудника: %d %n", person[i].FIO, person[i].salary, person[i].age);
            }
        }
        System.out.println("__________________________");

//4.Вывести при помощи методов из пункта 3 ФИО и возраст.
        System.out.printf("Задание 4: %n");
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i].getFIO() + "\t" + person[i].getAge());
        }
        System.out.println("__________________________");

        System.out.printf("Задание 6: %n");
        for (int i = 0; i < person.length; i++){
            upSalary(i, person);
        }
        System.out.println("__________________________");

        System.out.printf("Задание 7: %n");
        System.out.println("Средний возраст всех сотрудников: " + averageAge(person));
        System.out.println("Средняя зарплата всех сотрудников : " + averageSalary(person));
        System.out.println("__________________________");
    }

//6.* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    public static boolean upSalary(int i, worker[] newPerson){
            if (newPerson[i].age > 45) {
                newPerson[i].salary = newPerson[i].salary + 5000;
                System.out.println("ФИО сотрудника с прибавкой: " + newPerson[i].FIO + " Новая зарплата сотрудника: " + newPerson[i].salary);
            }
            return false;
    }
//7.* Подсчитать средние арифметические зарплаты и возраста
    public static double averageAge(worker[] person){
        double total = 0;
        for (int i = 0; i < person.length; i++){
            total += person[i].age;
        }
        return total/person.length;
    }
    public static double averageSalary(worker[] person){
        double total = 0;
        for (int i = 0; i < person.length; i++){
            total += person[i].salary;
        }
        return total/person.length;
    }
}
