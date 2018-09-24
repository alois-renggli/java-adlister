import java.util.Arrays;

public class ArraysExercises {


//    Create an array that holds 3 Person objects. Assign a new instance of the
//    Person class to each element. Iterate through the array and print out the name of each person in the array.
//
//    Create a static method named addPerson. It should accept an array of Person objects,
//    as well as a single person object to add to the passed array. It should return an array
//    whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//    public addPerson(String[] people, String name){
//        String[] updatedPeople = new String[people.length +1];
//        for(int i = 0; i <updatedPeople.length-1; i++){
//            updatedPeople[i] = people[i];
//        }
//        Person updatedPerson = new Person(name);
//        updatedPeople[updatedPeople.length-1] = updatedPerson.getName();
//        return String[] updatedPeople;
//    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        String[] people = new String[3];
        System.out.println(Arrays.toString(people));
        Person alois = new Person("Alois");
        Person isa = new Person("Isa");
        Person isiah = new Person("Isiah");
        people[0] = alois.getName();
        people[1] = isa.getName();
        people[2] = isiah.getName();

//        System.out.println(people[0]);
//        System.out.println(Arrays.toString(people));
//        people[1] = isa;
//        people[2] = isiah;
        for(String person : people){
            System.out.println(person);
        }

//        addPerson(people, "Louie");
    }
}
