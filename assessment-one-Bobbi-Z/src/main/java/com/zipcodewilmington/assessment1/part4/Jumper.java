package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     * k = flag height
     * j = jump height
     */
    public int jumps(int k, int j) {
        int result = k /j;
        int multiply = k - (j * result);
        return result + multiply;
    }

/*
        int mod = 0;
        int jumpsMod = 0;
        int kMod = 0;
        int jMod = 0;
        int modJK = 0;
        int jumpsModJK = 0;
        int kk = 0;
        int jj = 0;
        // 1 <= k <= 109
        // 1 <= j <= 109
        //can either jump at j or 1


        if (k % j < 0) {
            return k;
        } else if (k == j) {
            return k / j;
        } else if (j == 1) {
            return k;
        } else if (k <= 109 && j <= 109) {
            mod = k % j;
            jumpsMod = k / j + mod;
            if (mod == 0) {
                return k;
            }

            return jumpsMod;

        } else if (k > 109 && j > 109) {
            for (int loopK = 109; loopK < 1; loopK++) {
                kk = k % loopK;
                if (kk == 0) {
                    kMod = k / loopK;
                }
            }
            for (int loopJ = 109; loopJ <= 1; loopJ++) {
                jj = j % loopJ;
                if (jj == 0) {
                    jMod = j / loopJ;
                }
            }
            modJK = kMod % jMod;

            if (modJK == 0) {
                return kMod;
            }

        }
        jumpsModJK = kMod + modJK;
        return jumpsModJK;
    }
*/
}




