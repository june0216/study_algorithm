package 프로그래머스_LV0;

public class 로그인성공 {
    class Solution {
        public String solution(String[] id_pw, String[][] db) {
            String answer = "";
            for(int i = 0; i < db.length; i++)
            {
                if(id_pw[0].equals(db[i][0])){
                    if(id_pw[1].equals(db[i][1])){
                        return "login";
                    }
                    else
                    {
                        return "wrong pw";
                    }
                }
            }

            return "fail";
        }
    }
}
