class Person {
  private String name;
  private int age;
  private String color;
  Person(String aName, int aAge, String aColor){
    name = aName;
    age = aAge;
    color = aColor;
  }
  void setName (String newName){
    name = newName;
  }
  void SetAge (int newAge){
    age = newAge;
  }
  void setColor (String newColor){
    color = newColor;
  }
  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }
  String getColor(){
    return color;
  }
}