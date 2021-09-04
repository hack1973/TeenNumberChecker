public class TeenNumberChecker {

    public static boolean hasTeen (int firstInt, int secondInt, int thirdInt) {
        if (isTeen(firstInt) || isTeen(secondInt) || isTeen(thirdInt)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int intToCheckIfTeen) {

        if (intToCheckIfTeen >= 13 && intToCheckIfTeen <= 19) {
            return true;
        }
        return false;
    }
}
