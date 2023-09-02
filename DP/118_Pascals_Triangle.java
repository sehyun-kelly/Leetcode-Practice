/** My solution - 89.4%, 40.42% */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            rows.add(1);
            for(int j = 1; j <= i; j++){
                if(j == i) {
                    rows.add(1);
                } else {
                    List<Integer> prev = triangle.get(i - 1);
                    rows.add(prev.get(j - 1) + prev.get(j));
                }
            }
            triangle.add(rows);
        }

        return triangle;
    }
}