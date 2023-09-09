public static InstanceOfExample {
    public static void main(String args[]) {


        // Creating the objects of parent
        // and the child class
        ParentClass obj1 = new ParentClass();
        ChildClass obj2 = new ChildClass();

        // Comparing the object to a specified type
        System.out.println("obj1 is instacne of ParentClass = " + (obj1 instacneof ParentClass));
        System.out.println("obj1 is instacne of ChildClass = " + (obj1 instacneof ChildClass));
        System.out.println("obj1 is instacne of MyInterface = " + (obj1 instacneof MyInterface));
        System.out.println("obj2 is instacne of ParentClass = " + (obj2 instacneof ParentClass));
        System.out.println("obj2 is instacne of ChildClass = " + (obj2 instacneof ChildClass));
        System.out.println("obj2 is instacne of MyInterface = " + (obj2 instacneof MyInterface));
    }
}

class ParentClass {

}

// Creating an interface
interface MyInterface {

}

class ChildClass extends ParentClass implements MyInterface {


}