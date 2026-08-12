class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(char ch : s.toCharArray()){
        if(ch=='(' || ch=='{' || ch=='['){
           stack.push(ch);
         }else{
           if(stack.size()==0){  //more no od closing bracket
            return false;
           }
            if((stack.peek()=='(' && ch ==')') ||  (stack.peek() =='{' && ch =='}') ||  (stack.peek()=='[' && ch == ']')){
                stack.pop();
             }else{ 
                return false;
            } 
         }
       }
       return stack.size()==0;
    }

}