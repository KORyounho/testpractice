package org.example;

import com.google.common.collect.Iterators;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Iterators iterators
        Stack stk = new Stack();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '<'){
                if(!stk.isEmpty()) {
                    while (!stk.isEmpty()) {
                        sb.append(stk.pop());
                    }
                }
                int j = i;
                while(str.charAt(j) != '>'){
                    sb.append(str.charAt(j));
                    j++;
                }
                sb.append(str.charAt(j++));
                i = j-1;
                continue;
            }
            if(str.charAt(i) == ' '){
                while(!stk.isEmpty()){
                    sb.append(stk.pop());
                }
                sb.append(str.charAt(i));
                continue;
            }

            stk.push(str.charAt(i));
        }

        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        System.out.println(sb);
    }
}