public class Animal {
  protected int age;
  protected String weight;
  protected String eat;
  protected String run;

  public Animal(int age, String weight, String eat, String run) {
    this.age = age;
    this.weight = weight;
    this.eat = eat;
    this.run = run;
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

  public String getEat() {
    return this.eat;
  }

  public void setEat(String eat) {
    this.eat = eat;
  }

  public String getRun() {
    return this.run;
  }

  public void setRun(String run) {
    this.run = run;
  }
}
