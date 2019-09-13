//runtime polymorphism: overridden method is resolved at runtime rather than at compile-time.
//Result:
// Line 1: Joe Mauer 7 3
// Line 2: 7
// Line 3: Babe Ruth 3 1
// Line 4: 1
// Line 5: Babe Ruth 3 1
// Line 6: Babe
// Line 8: Joe Mauer 7 3
// Line 9: Player John Doe
// Line 10: counter = 2

public class Result {

    public static void main(String[] args){
        Player p = new BaseballPlayer("Joe", "Mauer", 7,3);
        BaseballPlayer b = new BaseballPlayer("Babe", "Ruth", 3,1);
        Person player1 = b;
        Person aPlayer = new Player("John", "Doe", 77);
        Object o = p;

        System.out.println("Line 1: "+ p.toString()); 
        System.out.println("Line 2: "+ p.getNumber());
        System.out.println("Line 3: "+ b.toString());
        System.out.println("Line 4: "+ b.getPosition());
        System.out.println("Line 5: "+ player1.toString()); 
        //player1 is technically a Person object but it is a pointer to a BaseballPlayer object
        //Changing info to b would also change info to player1
        System.out.println("Line 6: "+ player1.getFirst());
        //System.out.println("Line 7: "+ player1.getPosition());
        //getPosition() is not a method defined in class Person
        System.out.println("Line 8: "+ o.toString());
        System.out.println("Line 9: "+ aPlayer.toString());
        //Even though aPlayer has type a Person, at compile time, the compiler determine that class Person has a toString method, but at runtime
        //the overriden method is execute (toString in Player class)
        System.out.println("Line 10: counter = "+ Person.bbCounter);
    }
}
