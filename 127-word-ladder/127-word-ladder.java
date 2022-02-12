class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Set<String> wordSet = new HashSet<String>(wordList);
    if( !wordSet.contains(endWord) )
        return 0;
	// 3. Use set instead of queue during bfs
    Set<String> forwardSet = new HashSet<String>(); 
    Set<String> backwardSet = new HashSet<String>();
    forwardSet.add(beginWord);
    backwardSet.add(endWord);
    wordSet.remove(endWord);
    wordSet.remove(beginWord);
	// 1. Search from entry and exit simultaneously
    return transform(forwardSet, backwardSet, wordSet);
}

public int transform(Set<String> forwardSet, Set<String> backwardSet, Set<String> wordSet) {
    Set<String> newSet = new HashSet<String>();
    for(String fs : forwardSet) {
        char wordArray[] = fs.toCharArray();
        for(int i = 0; i < wordArray.length; i++) {
            for(int c = 'a'; c <= 'z'; c++) {
                char origin = wordArray[i];
                wordArray[i] = (char) c;
                String target = String.valueOf(wordArray);
                if( backwardSet.contains(target) )
                    return 2; // stop bfs when entry and exits meet
                else if( wordSet.contains(target) && !forwardSet.contains(target) ) {
                    wordSet.remove(target); // 4. Remove visited word from wordList to decrease the search time
                    newSet.add(target);
                }
                wordArray[i] = origin;
            }
        }
    }
    if( newSet.size() == 0 )
        return 0;
    forwardSet = newSet;
	// 2. Pick the queue with less elements to bfs
    int result = forwardSet.size() > backwardSet.size() ? 
        transform(backwardSet, forwardSet, wordSet) : transform(forwardSet, backwardSet, wordSet);
    return result == 0 ? 0 : result + 1;
}
    
}