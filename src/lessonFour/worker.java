package lessonFour;

//1.Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст;
public class worker {
    String FIO;
    int salary;
    int age;
    int  id;
    static int i = 1;

//2.Конструктор класса должен заполнять эти поля при создании объекта;
//8.*** Продумать конструктор таким образом, чтобы при создании каждому
// сотруднику присваивался личный уникальный идентификационный порядковый номер
    public worker(String FIO, int salary, int age){
        this.age = age;
        this.FIO = FIO;
        this.salary = salary;
        this.id = i++;
    }

//3.Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    String getFIO(){
        return FIO;
    }

    double getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

}
