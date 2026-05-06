

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> finalList = new ArrayList<>();
        List<List<String>> sizeBasedList = new ArrayList<>();
            for (int i =0 ; i < 100; i++) {
                List<String> subList = new ArrayList();
                for (String str : strs) {
                        if (str.length() == i) {
                            subList.add(str);
                        }
                }
                sizeBasedList.add(subList);
            }
        
        Map<String, List<String>> result = new HashMap();
        for (List<String> anList : sizeBasedList) {
                for (String str1 : anList) {
                    char[] chrarr = str1.toCharArray();
                    Arrays.sort(chrarr);
                    String sortString = new String (chrarr);
                    result.putIfAbsent(sortString, new ArrayList<>());
                    result.get(sortString).add(str1);
                }
        }


        return new ArrayList<>(result.values());
    }

    
}
