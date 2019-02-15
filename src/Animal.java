public class Animal {
  protected int age;
  protected String weight;

  public Animal(int age, String weight) {
    this.age = age;
    this.weight = weight;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getWeight() {
    return this.weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }
  public void run(){
    System.out.println("can run");
  }
  public void eat(){
    System.out.println("can eat");
  }
}
