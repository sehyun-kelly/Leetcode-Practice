/** My Solution - 100%, 66.62% */
class Solution {
    public String addBinary(String a, String b) {
        int counter = 0;
        StringBuilder sum = new StringBuilder();

        int ptrA = a.length() - 1;
        int ptrB = b.length() - 1;

        while(ptrA >= 0 || ptrB >= 0){
            int numA = ptrA >= 0 ? a.charAt(ptrA) - '0' : 0;
            int numB = ptrB >= 0 ? b.charAt(ptrB) - '0' : 0;

            sum.append((numA + numB + counter) % 2);
            counter = (numA + numB + counter) / 2;
            ptrA--;
            ptrB--;
        }

        if(counter != 0) sum.append(counter);

        return sum.reverse().toString();
    }
}
