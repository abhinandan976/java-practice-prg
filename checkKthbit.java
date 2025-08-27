public class checkKthbit {
    public static void main(String[] args) {
    int n = 21;
    int k = 2;
    
    if(checkkthBit(n,k)) {
      System.out.println("Set");
    }
    else {
        System.out.println("Not Set");
    }
}

static boolean checkkthBit(int n, int k) {
    // create the mask by left shifting by 1 to k
    int mask = 1 << k;
    
    // AND the n and mask to check the bit
    return (n & mask) != 0;
}

}
