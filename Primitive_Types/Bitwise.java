//How to do Bitwise Operations and Signed and Unsigned Shift Operators
//DataFlow Article: https://www.datafloww.online/BitwiseShift

public class Bitwise {

    static int bitwiseor(int a, int b) {
        return a | b; //the bitwise OR operator
    }

    static int bitwiseand(int a, int b) {
        return a & b; //the bitwise AND operator
    }

    static int bitwisexor(int a, int b){
        return a ^ b; //the bitwise XOR operator
    }

    static int signedrightshift(int a) {
        return a >> 2;
    }

    static long unsignedrightshift(long a) {
        return a >>> 2;
    }

    static int complement(int a) {
        return ~a;
    }

    public static void main(String[] args) {
        int or = Bitwise.bitwiseor(2,8);
        System.out.println(or);

        int and = Bitwise.bitwiseand(2,8);
        System.out.println(and);

        int xor = Bitwise.bitwisexor(2,8);
        System.out.println(xor);

        int signed = Bitwise.signedrightshift(-6);
        System.out.println(signed);

        long unsigned = Bitwise.unsignedrightshift(-6);
        System.out.println(unsigned);

        int comp = Bitwise.complement(2);
        System.out.println(comp);
    }

    //0011 1111 1111 1010 //16 bits 13485
    //0011 1111 1111 1111 1111 1111 1111 1010 //32 bits //32 bits 1073741822
                                                                //4611686018427387902
}

