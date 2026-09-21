class Solution {
    public int calPoints(String[] operations) {
        List<Integer> l = new ArrayList<>();
        for(String a:operations){
            if(a.equals("C")){
                if(l.size() > 0) l.remove(l.size() - 1);
            }
            else if(a.equals("D")){
                if(l.size() > 0){
                    l.add(l.get(l.size() - 1)*2);
                }
            }
            else if(a.equals("+")){
                if(l.size()>=2){
                    l.add(l.get(l.size() - 1) + l.get(l.size() - 2));
                }
            }
            else{
                l.add(Integer.parseInt(a));
            }
        }
        int sum = 0;
        for(int a:l){
            sum += a;
        }
        return sum;
    }
}