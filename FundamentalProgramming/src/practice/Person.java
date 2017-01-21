package practice;

public class Person {
    private int age;	
  
	public Person(int ia){
  		// Add some more code to run some checks on initialAge
        if(ia < 0 ){
            System.out.println("Age is not valid, setting age to 0.");
            age = 0 ;
        }else{
            for(int i = 0 ; i < 2 ; i++){
                yearPasses();
                amIOld();
            }
        }
        
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(age >= 18){
        System.out.println("You are old.");
        }
        else if( age < 18 && age >=13 ){
            System.out.println("You are a teenager.");            
        }else if(age > 0 ){
            System.out.println("You are young.");
        }
            
    }

	public void yearPasses() {
  		// Increment this person's age.
        age += 3 ;
	}
}