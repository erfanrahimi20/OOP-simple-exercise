public static class Person {

    private String name;
    private int age ;

    public Person(){

        System.out.println("Personal information of individuals:");
    }


    public String getName(){
        return name;
    }


    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public static void main(String[] args) {

    Person person = new Person();
    person.setName("erfan.rh");
    person.setAge(18);
    System.out.println("name:"+person.getName());
    System.out.println("age:"+person.getAge());
}