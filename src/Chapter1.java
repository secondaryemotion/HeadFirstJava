public class Chapter1 {

    public String dooBee(){
        int x = 1;
        String answer = "";
        while (x < 3){
            answer = answer.concat("Doo");
            answer = answer.concat("Bee");
            x += 1;
        }
        if (x == 3) {
            answer = answer.concat("Do");
        }
        return answer;
    }

    public String abcdMagnets(){
        int x = 3;
        String answer = "";
        while (x > 0){
            if (x > 2){
                answer = answer.concat("a");
            }
            x = x - 1;
            answer = answer.concat("-");
            if (x == 2){
                answer = answer.concat("b c");
            }
            if (x == 1){
                answer = answer.concat("d");
                x = 0;
            }
        }
        return answer;
    }

    public String poolPuzzleOne() {
        int x = 0;
        String answer = "";
        while (x < 4) {
            answer = answer.concat("a");
            if (x < 1) {
                answer = answer.concat(" ");
            }
            answer = answer.concat("n");
            if (x > 1) {
                answer = answer.concat(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                answer = answer.concat("noys ");
            }
            if (x < 1) {
                answer = answer.concat("oise ");
            }
            x = x + 1;
        }
        return answer;
    }

}
