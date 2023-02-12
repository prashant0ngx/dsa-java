package Stack;

import java.util.Stack;
public class InfixToPrefix {
        
        public static String infixToPrefix(String s){
            Stack<Character> stack = new Stack<>();
            String result = "";
            for(int i=s.length()-1;i>=0;i--){
                char c = s.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    result = c + result;
                }
                else if(c==')'){
                    stack.push(c);
                }
                else if(c=='('){
                    while(!stack.isEmpty() && stack.peek()!=')'){
                        result = stack.pop() + result;
                    }
                    if(!stack.isEmpty() && stack.peek()!=')'){
                        return "Invalid Expression";
                    }
                    else{
                        stack.pop();
                    }
                }
                else{
                    while(!stack.isEmpty() && precedence(c)<=precedence(stack.peek())){
                        if(stack.peek()=='('){
                            return "Invalid Expression";
                        }
                        result = stack.pop() + result;
                    }
                    stack.push(c);
                }
            }
            while(!stack.isEmpty()){
                if(stack.peek()=='('){
                    return "Invalid Expression";
                }
                result = stack.pop() + result;
            }
            return result;

        }
        public static int precedence(char c){
            switch(c){
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }
        public static void main(String[] args) {
            String s = "a+b*(c^d-e)^(f+g*h)-i";
            System.out.println(infixToPrefix(s));
        }
}
