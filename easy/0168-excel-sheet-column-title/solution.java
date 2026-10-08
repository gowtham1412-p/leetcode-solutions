class Solution {
    public String convertToTitle(int columnNumber) {
        String coln="";
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            coln=(char)(rem+'A')+coln;
            columnNumber=(columnNumber-1)/26;
        }
        return coln;
    }
}