//this is the Apple class with the .equals() method. Playing with .equals() and ==
//overload vs override
//overload: rewrite the .Equals() method in class Object to compare the object with a specific class other than Objects
//for example: public bool Equals(Apple another)
//override: rewrite the .Equals() method to compare with all sort of objects
//for example: public bool Equals(Object obj)

public class Apple {

    public String kind; // i made these public so I dont have to use getters and setters
    public double price;

    public Apple(String kind_, double price_){
        kind = kind_;
        price = price_;
    }

    public String toString(){
        return kind + " price $" + price;
    }

    public boolean equals(Apple other){
        return price == other.price;
    }

    public static void main(String[] args){
        Apple p1 = new Apple("granny smith", 1.25);
        Apple p2 = new Apple("granny smith", 0.99);
        Apple p3 = new Apple("gala", 1.25);
        boolean b1 = p1 == p2; boolean b2 = p1.equals(p2); boolean b3 = p1.equals(p3); boolean b4 = p1 == p1; boolean b5 = p1.equals(p1);
        System.out.println("p1: " + p1 +" p2: " + p2  + "\n" +"p1 == p2 is " + b1);
        System.out.println("**this is false because p1 and p2 are not the same apple, they are 2 distinct apples.\n");
        System.out.println("p1: " + p1 +" p2: " + p2  + "\n" +"p1.equals(p2) is " + b2);
        System.out.println("**this is false because p1 and p2 have different price so in this context, p1 and p2 are not equal \n");
        System.out.println("p1: " + p1 +" p3: " + p3  + "\n" +"p1.equals(p3) is " + b3);
        System.out.println("**this is true because p1 and p3 both cost $1.25\n");
        System.out.println( "p1 == p1 is " + b4 +"\n**This is true because p1 and p1 are the same apple\n");
        System.out.println("p1.equals(p1) is "+b5+"\n**This is true because p1 and p1 have the same price\n");
    }
}
