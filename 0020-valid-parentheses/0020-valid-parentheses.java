class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            else {
                if(stack.isEmpty()) return false;

                char top = stack.pop(); // ch = ], top = [

                if(ch == ')' && top!='(') return false;
                if(ch == ']' && top!='[') return false;
                if(ch == '}' && top!='{') return false;
            }

        }

        return (stack.isEmpty());
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}