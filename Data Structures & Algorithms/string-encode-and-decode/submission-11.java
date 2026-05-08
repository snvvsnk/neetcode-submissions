class Solution {

    public String encode(List<String> strs) {

    
        StringBuilder finalString = new StringBuilder();
        for (String str : strs) {
            int len = str.length();
            finalString.append(len);
            finalString.append("|||");
            finalString.append(str);
            finalString.append("^^");
        }

        System.out.println(finalString);

        return finalString.toString();

    }

    public List<String> decode(String str) {
        
        if (str.equals("")) 
            return Arrays.asList();
        List<String> list = new ArrayList<>();
        String[] subList = str.split("\\^\\^");
        
        for (String str1 : subList) {
            int pipeIndex = str1.indexOf("|||");
        
        if (pipeIndex != -1) {
            int len = Integer.parseInt(str1.substring(0, pipeIndex));

            String dec = str1.substring(pipeIndex + 3,pipeIndex + 3 +len);
            list.add(dec);
        }
        }
        return list;
    }
}
