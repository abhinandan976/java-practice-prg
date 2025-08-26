public class Noof1s {
    public static void main(String[] args) {
        int n = 10;
        int result = countnoof1s(n);
        System.out.println("Number of 1s in binary representaion of " + n + " is: " + result);
    }

    static int countnoof1s(int n) {
    int count = 0;
    while(n != 0) {
      n = n & n - 1;
      count++;
    }
    return count;
}
}
