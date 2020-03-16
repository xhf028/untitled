package com.home.javase;

/**
 * @author Xianghongfei
 * @date 2020/2/15 - 14:51
 */

public class Student/* implements Comparable*/{
    public String name ;
    private int id;
    private int age;

    public Student() {
    }

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    //hashSet去重
   @Override
    public boolean equals(Object obj) {

        if(obj instanceof Student){

            if (this.age==((Student) obj).age && this.id==((Student) obj).id && this.name.equals(((Student) obj).name)){
                return true;
            }
        }
        return false;
    }
  @Override
  public int hashCode(){
      return name.hashCode()+age+id;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 /*   @Override
    public int compareTo(Object o) {
        if (o instanceof  Student){
            Student obj = (Student) o;
            if (this.id==obj.id){
                return obj.getName().compareTo(this.getName());
            }
            return -(this.id-obj.id);
        }
        return 0;

    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
