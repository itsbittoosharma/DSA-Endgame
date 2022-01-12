# Inorder Traversal (Iterative)
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a binary tree. Find the inorder traversal of the tree <strong>without using recursion</strong>.</span></p>

<p><strong><span style="font-size:18px">Example 1</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<strong><span style="font-size:18px">           </span></strong><span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>         /    \</strong></span>
<span style="font-size:18px">       2       3</span>
   <span style="font-size:18px">   /   \</span>
<span style="font-size:18px">    4     5</span>
<strong><span style="font-size:18px">Output: </span></strong><span style="font-size:18px">4 2 5 1 3</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">Inorder traversal (Left-&gt;Root-&gt;Right) of </span>
<span style="font-size:18px">the tree is 4 2 5 1 3.</span>
</pre>

<p><strong><span style="font-size:18px">Example 2</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">            8</span>
<span style="font-size:18px">          /   \</span>
            <span style="font-size:18px">1      5</span>
             <span style="font-size:18px">\    /  \</span>
             <span style="font-size:18px">7   10   6</span>
          <span style="font-size:18px">   \  /
&nbsp;         </span><span style="font-size:18px">10 6</span>
<strong><span style="font-size:18px">Output: </span></strong><span style="font-size:18px">1 7 10 8 6 10 5 6</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">Inorder traversal (Left-&gt;Root-&gt;Right) 
of </span><span style="font-size:18px">the tree is 1 7 10 8 6 10 5 6.</span></pre>

<p>&nbsp;</p>

<div><strong><span style="font-size:18px">Your task:</span></strong></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>inOrder() </strong>which takes the root of the tree as input and returns a list containing the inorder traversal of the tree, calculated</span><strong><span style="font-size:18px"> without using recursion.</span></strong></div>

<p><br>
<strong><span style="font-size:18px">Expected time complexity: </span></strong><span style="font-size:18px">O(N)</span><br>
<strong><span style="font-size:18px">Expected auxiliary space: </span></strong><span style="font-size:18px">O(N)</span></p>

<div><br>
<strong><span style="font-size:18px">Constraints:</span></strong></div>

<div><span style="font-size:18px">1 &lt;= Number of nodes &lt;= 10<sup>5</sup><br>
1 &lt;= Data of a node &lt;= 10<sup>5</sup></span></div>
 <p></p>
            </div>