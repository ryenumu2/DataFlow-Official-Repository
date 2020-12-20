//Find the Number of One Bits: https://www.datafloww.online/numberofonebits 
public class BitwiseHamming {
    int counter = 0;
    int n;

    BitwiseHamming(int n) {
        this.n = n;
    }

    public int hammingWeight() {
        
        int output;
        
        while (n != 0) {
            output = (n & 1);
            if (output == 1){
                counter++;
            }
            n = n >>> 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        BitwiseHamming countones = new BitwiseHamming(0110101);
        System.out.println(countones.hammingWeight());
    }
}