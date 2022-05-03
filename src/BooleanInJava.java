public class BooleanInJava {
    public static void main(String[] args){
/*        int a = 0;
        boolean b = (a ==0);
        System.out.println(b);

        if(false){
            System.out.println("We are in the if statement!");
        }*/
        boolean passedDoor = true;
        boolean missedDoor = false;
        int doorCount = 0;
        boolean passedAllDoors = false;

        if(passedDoor){
            System.out.println("We passed the first foor!");
            doorCount = doorCount + 1;
        }
        if(passedDoor){
            System.out.println("We passed the second door!");
            doorCount = doorCount + 1;
        }
        if(missedDoor){
            System.out.println("We passed the third door!");
            doorCount = doorCount + 1;
        }
        if(doorCount == 3){
            passedAllDoors = true;
        }
        if(passedAllDoors){
            System.out.println("Congratulations you won the program!");
        }
    }
}
