package 프로그래머스_LV1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class 영단어 {
    public static void main(String[] arg){
        System.out.println(solution("12one4"));
    }

        public static int solution(String s) {
            int answer = 0;
            String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven" ,"eight","nine"};
            for(int i = 0; i < 10; i++)
            {
                s = s.replace(num[i], Integer.toString(i));
            }

            answer = Integer.parseInt(s);
            return answer;
        }
    }
    /*
    public static int solution(String s) {
        int answer = 0;
        int len = s.length();
        len  = len -1;
        //int cnt = 0;
        String split;
        LinkedList<Integer> res = new LinkedList<Integer>();

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("zero", 0);
        map.put("one", 1);
        map.put( "two", 2);
        map.put( "three", 3);
        map.put( "four", 4);
        map.put( "five", 5);
        map.put( "six", 6);
        map.put( "seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        while(true)
        {
            if(len < 0) break;
            System.out.println(len);
            if(len == 0) {
                split = s;
            }else
            {
                split = s.substring(len);
            }
            System.out.println(split);



            if(split.matches("^[0-9]*$")){
                res.addLast(Integer.parseInt(split));
                if(len <= 0) break;
                s = s.substring(0, len);
                len--;
                split = "";



            }
            else
            {
                int cnt = 0;
                while(true)
                {
                    if(cnt != 0)
                    {
                        split = s.substring(len);
                    }
                    if(len <= 0) break;
                    if(map.containsKey(split)){
                        res.addLast(map.get(split));
                        s = s.substring(0, len);
                        break;
                    }
                    else{
                        cnt++;

                    }
                    len--;

                }


            }

        }



        while(!res.isEmpty()){
            if(res.size() == 1) {
                answer += res.removeLast();
                break;
            }
            answer = res.removeLast() * (10^(res.size()-1));
        }

        return answer;
    }*/


