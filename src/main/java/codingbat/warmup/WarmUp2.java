package codingbat.warmup;

public class WarmUp2 {
    public String stringTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(str);
        }
        return res.toString();
    }

    public String frontTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.length() > 3) {
                res.append(str.substring(0, 3));
            } else res.append(str);
        }
        return res.toString();
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        return (i != -1) && (i + 1 < str.length()) && str.substring(i + 1, i + 2).equals("x");

    }

    public String stringBits(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            res.append(str.substring(i, i + 1));
        }
        return res.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.substring(0, i + 1));
        }
        return res.toString();
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        int res = 0;
        String end = str.substring(str.length() - 2, str.length());
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(end)) res++;
        }
        return res;
    }

    public int arrayCount9(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num == 9) res++;
        }
        return res;
    }

    public boolean arrayFront9(int[] nums) {
        if (nums.length == 0) return false;
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 & nums[i + 1] == 2 & nums[i + 2] == 3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int res = 0;
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) res++;
        }
        return res;
    }

    public String stringX(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                res.append(str.substring(i, i + 1));
            }
        }
        return res.toString();
    }

    public String altPairs(String str) {
        StringBuilder res = new StringBuilder();
        if (str.length() < 2) return str;
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            res.append(str.substring(i, end));
        }
        return res.toString();
    }

    public String stringYak(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public int array667(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)) res++;
        }
        return res;
    }

    public boolean noTriples(int[] nums) {
        if (nums.length < 3) return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) && Math.abs(nums[i + 2] - (val - 1)) <= 2) return true;
        }
        return false;
    }
}
