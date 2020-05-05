package week5;

	public class Animal {}

	abstract class Mammal extends Animal{
	   abstract String bark();
	   abstract String getFood();
	}

	 abstract class Reptile extends Animal{
	    abstract String getFood();
	 }
	 
	 final class Cat extends Mammal{
	    String name;
	    float weight;
	    String nameSlave;
	    Cat(String name, float weight, String nameSlave){this.name = name; this.weight = weight; this.nameSlave = nameSlave;}
	    
	    void setName(String name) {this.name = name;}
	    String getName() {return name;}
	    void setWeight(float weight) {this.weight = weight;}
	    float getWeight() {return weight;}
	    void setNameSlave(String nameSlave) {this.nameSlave = nameSlave;}
	    String getNameSlave() {return nameSlave;}
	    String bark() {
	       System.out.println("Meow");
	       return "Meow";
	       }
	    String getFood() {
	       System.out.println("Fish");
	       return "Fish";
	       }
	    
	 }
	 
	final class Dog extends Mammal{
	   String name;
	   float weight;
	   String nameMaster;
	   Dog(String name, float weight, String nameMaster){this.name = name; this.weight = weight; this.nameMaster = nameMaster;}
	    
	   void setName(String name) {this.name = name;}
	    String getName() {return name;}
	    void setWeight(float weight) {this.weight = weight;}
	    float getWeight() {return weight;}
	    void setNameMaster(String nameMaster) {this.nameMaster = nameMaster;}
	    String getNameMaster() {return nameMaster;}
	    String bark() {
	       System.out.println("Bowbow");
	       return "Bowbow";
	       }
	    String getFood() {
	       System.out.println("Apple");
	       return "Apple";
	       }
	}

	final class Crocodile extends Reptile{
	   String name;
	   float weight;
	   Crocodile(String name, float weight){this.name = name; this.weight = weight;}
	   
	   void setName(String name) {this.name = name;}
	    String getName() {return name;}
	    void setWeight(float weight) {this.weight = weight;}
	    float getWeight() {return weight;}
	    String getFood() {
	       System.out.println("Meat");
	       return "Meat";
	       }
	}