// Solution - 1

class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++)
        {
            char temp=(address.charAt(i));
            if(temp>=48 && temp <=57) ans+=address.charAt(i);
            else ans+="[.]";
        }
        return ans;
    }
}

// Solution - 2

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}