/** 34.13%, 77.76% */
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> combs = new ArrayList<>();
        List<List<Integer>> allCombs = new ArrayList<>();

        getCombs(1, n, k, combs, allCombs);

        return allCombs;
    }

    public void getCombs(int beg, int n, int k, List<Integer> combs, List<List<Integer>> allCombs) {
        if(combs.size() == k) {
            allCombs.add(new ArrayList<>(combs));
            return;
        }

        for(int i = beg; i <= n; i++) {
            combs.add(i);
            getCombs(i + 1, n, k, combs, allCombs);
            combs.remove(combs.size() - 1); 
        }
    }
}