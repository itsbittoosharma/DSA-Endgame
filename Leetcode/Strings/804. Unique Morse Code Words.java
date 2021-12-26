class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set =  new HashSet<>();
        for(String word : words){
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<word.length(); i++){
                sb.append( code[word.charAt(i)-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
